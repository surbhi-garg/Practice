package com.design.proxy;

interface Accessable
{
    void accessRecord();
}
class Student implements Accessable
{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public void accessRecord() {
        System.out.println("Record is: "+rollNo+" "+name);
    }
}
enum UserRole{ADMIN,USER}
class User
{
    private String name;
    private UserRole role;

    public User(String name,UserRole role) {
        this.name = name;
        this.role=role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
class StudentProxy extends Student implements Accessable
{
    private User user;
    public StudentProxy(int rollNo,String name,User user) {
        super(rollNo,name);
        this.user = user;
    }

    @Override
    public void accessRecord() {
        if(user.getRole()==UserRole.ADMIN)
            super.accessRecord();
        else
            System.out.println("Access Denied! you're not admin");

    }
}

public class ProxyDemo {
    public static void main(String[] args) {
        Accessable student1=
                new StudentProxy(1,"Surbhi Garg",new User("Abhinav",UserRole.ADMIN));
        Accessable student2=new StudentProxy(2,"AditiWalia",new User("Surbhi",UserRole.USER));
        student1.accessRecord();
        student2.accessRecord();
    }
}

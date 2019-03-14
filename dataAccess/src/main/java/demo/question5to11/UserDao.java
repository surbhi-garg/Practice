package demo.question5to11;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //forQuestion11
    @Autowired
    SessionFactory sessionFactory;

    //Question5
    public int countAllUsers()
    {
        final String query="select count(*) from user";
         int count= jdbcTemplate.queryForObject(query,Integer.class);
         return count;
    }

    //Question6
    public String findNameByUserName(String username)
    {
        final String query="select name from user where username=?";
        String name=jdbcTemplate.queryForObject(query,new Object[]{username},String.class);
        return name;
    }

    //Question7
    public int addUser(Users user)
    {
        final  String query="insert into user(username,name,password,age,dob)values(?,?,?,?,?)";
       return jdbcTemplate.update(query,new Object[]{user.getUserName(),user.getName(),user.getPassword(),user.getAge(),user.getDob()});
    }

    //Question8
    public void findUserByUserName(String username)
    {
        final String query="select * from user where username=?";
        System.out.println(jdbcTemplate.queryForMap(query,new Object[]{username}));
    }

    //Question9
    public void printAllUsers()
    {
        final String query="select * from user";
        jdbcTemplate.queryForList(query).forEach(System.out::println);
    }

    //Question10
    Users getUser(String username)
    {
        final String query="select * from user where username=?";
        Users users=jdbcTemplate.queryForObject(query, new Object[]{username},(rs,rowNum)->
            {

                Users user=new Users();
                user.setUserName(rs.getString("username"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                user.setAge(rs.getInt("age"));
                user.setDob(rs.getDate("dob").toLocalDate());
                return user;
            });
        return users;
    }

    //Question11
    public void countUsersUsingHql()
    {
        String queryString="select count(distinct u.userName) from Users u";
        Query query=sessionFactory.openSession().createQuery(queryString);
        System.out.println("Count of users using HQL: "+query.uniqueResult());
    }
}


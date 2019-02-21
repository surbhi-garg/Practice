public class Person implements Cloneable {
    int personId;
    String name;
    Address address;

    //Copy constructor
    public Person(Person source)
    {
        this.personId=source.personId;
        this.name=source.name;
        this.address=new Address(source.address.getPlace(),source.address.getZip());
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Person(int personId, String name, Address address) {
        this.personId = personId;
        this.name = name;
        this.address = address;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }


}

public class ObjectClone {
    public static void main(String[] args) {
        Person person=new Person(1,"Surbhi",new Address("janakpuri",110046));
        try {


            //using clone
            Person person2=(Person)person.clone();

            System.out.println("After cloning using clone");
            System.out.println("First Object "+person);
            System.out.println("Second Object "+person2);

            person.address.setPlace("tilak nagar");

            System.out.println("Modification in an object in case of clone");//shallow copy
            System.out.println("First Object "+person);
            System.out.println("Second Object "+person2);


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //using constructor
        //deep copy
        Person person2=new Person(person);

        System.out.println("After cloning using copy constructor");
        System.out.println("First Object "+person);
        System.out.println("Second Object "+person2);

        person.address.setPlace("subhash nagar");

        System.out.println("Modification in an object in case of copy constructor");//shallow copy
        System.out.println("First Object "+person);
        System.out.println("Second Object "+person2);


    }
}

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public Person(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public Person(PersonBuilder builder) {
       this.firstName = builder.getFirstName();
       this.lastName = builder.getLastName();
       this.age = builder.getAge();
       this.address = builder.getAddress();
       //perche this = builder.build() non  funziona?
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
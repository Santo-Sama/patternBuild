public class PersonBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public PersonBuilder(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonBuilder setFirstName(String tempName){
        firstName = tempName;
        return this;
    }
    public PersonBuilder setLastName(String tempName){
        lastName = tempName;
        return this;
    }
    public PersonBuilder setAge(int tempAge){
        age = tempAge;
        return this;
    }
    public PersonBuilder setAddress(String tempAdrress){
        address = tempAdrress;
        return this;
    }

    public Person build(){
        return new Person(firstName,lastName,age,address);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

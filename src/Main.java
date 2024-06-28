public class Main {
    public static void main(String[] args) {

        PersonBuilder builder = new PersonBuilder("santo","bianchi");

        Person persona = new Person(builder);
        System.out.println(persona);

        builder.setFirstName("michele");
        builder.setAddress("via informatica");
        builder.setAge(30);

        Person persona2 = builder.build();
        System.out.println(persona2);
    }
}
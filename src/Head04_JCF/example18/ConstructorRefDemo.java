package Head04_JCF.example18;

public class ConstructorRefDemo {
    public static void main(String[] args) {

//        PersonFactory factory1 = (n, a) -> new Person(n, a);


        PersonFactory factory2 = Person::new;


//        PersonFactory factory3 = new PersonFactory() {
//            @Override
//            public Person create(String name, int age) {
//                return new Person(name, age);
//            }
//        };

        Person p = factory2.create("Kim", 25);
        System.out.println("Created Person -> name: " + p.name + ", age: " + p.age);
    }
}

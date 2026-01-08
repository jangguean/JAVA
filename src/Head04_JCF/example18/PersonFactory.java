package Head04_JCF.example18;

@FunctionalInterface
interface PersonFactory {
    Person create(String name, int age);
}

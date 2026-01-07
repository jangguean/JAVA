package Head03_OOP.example12;
//정적 내부 클래스
public class Outer {
    private static int staticValue = 100;
    private int instanceValue = 50;

    public static class StaticNested {
        public void printValues() {

            System.out.println("Outer.staticValue: " + staticValue);
//            System.out.println(instanceValue);
        }
    }
}

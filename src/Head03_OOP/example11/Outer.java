package Head03_OOP.example11;
//비정적 내부 클래스
public class Outer {
    private int instanceValue = 200;

    public class Inner {
        public void printInstanceValue() {
            System.out.println("Outer instanceValue: " + instanceValue);
//          System.out.println(instanceValue);
        }
    }
}

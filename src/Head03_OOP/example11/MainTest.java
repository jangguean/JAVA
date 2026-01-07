package Head03_OOP.example11;
//비정적 내부 클래스
public class MainTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printInstanceValue();
    }
}

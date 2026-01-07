package Head03_OOP.example03;

public class CreditCardPayment implements payment {
    @Override
    public void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }
}

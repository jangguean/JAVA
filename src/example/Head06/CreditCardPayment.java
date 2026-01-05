package example.Head06;

public class CreditCardPayment implements payment {
    @Override
    public void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }
}

package Head03_OOP.example06;

public class PolymorphismTest {
    public static void main(String[] args) {
        Payment[] payments = new Payment[]
                {
                        new CreditCardPayment(),
                        new AccountTransferPayment()
                };
        double[] paymentAmounts = new double[] {
                30000,
                70000
        };
        OrderService service = new OrderService();
        service.processPayment(new CreditCardPayment(), 10000);
        service.processPayment(new AccountTransferPayment(), 20000);

        for(Payment p : payments) {
            if (p instanceof CreditCardPayment){
                service.processPayment(p,paymentAmounts[0]);
            } else if(p instanceof AccountTransferPayment) {
                service.processPayment(p,paymentAmounts[1]);
            }
        }
    }
}

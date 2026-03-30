public class NetBankingPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " via Net Banking");
    }
}

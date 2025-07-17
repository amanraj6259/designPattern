package strategydesignpattern;

public class PayPalStrategy implements PaymentStrategyInterface{

    @Override
    public void pay() {
        System.out.println("Paid through PayPal");
    }
}

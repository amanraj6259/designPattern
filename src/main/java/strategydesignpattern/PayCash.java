package strategydesignpattern;

public class PayCash implements PaymentStrategyInterface{
    @Override
    public void pay() {
        System.out.println("Pay cash startegy");
    }
}

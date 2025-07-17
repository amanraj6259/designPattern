package strategydesignpattern;

public class CreditCardStrategy implements PaymentStrategyInterface{
    @Override
    public void pay() {
        System.out.println("Credit card strategy");
    }
}

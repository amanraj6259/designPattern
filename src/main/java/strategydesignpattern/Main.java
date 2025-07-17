package strategydesignpattern;

public class Main {
    public static void main(String[] args)
    {
        PaymentStrategyInterface payment = new CreditCardStrategy();
        payment.pay();
        System.out.println("Hey buddy");
    }
}

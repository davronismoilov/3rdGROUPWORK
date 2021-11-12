package uz.pdp.model;

public class Transaction {

    public static void pay(double price, Card card, short amount) {
        double balance = card.getCardBalance() - price * amount;
        card.setCardBalance(balance);
    }

    public static void receive(double price, Cafe cafe, short amount) {
        double balance = cafe.getCafeBalance() + price * amount;
        cafe.setCafeBalance(balance);
    }

    public static void incomeToSystem(double price, short amount) {
        double difference = Account.getCafePercent() * Account.getDiscountPercent();
        double balance = Account.getSystemBalance() + price * (difference / 100) * amount;
        Account.setSystemBalance(balance);
    }
}

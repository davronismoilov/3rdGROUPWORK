package uz.pdp.model;

import uz.pdp.model.base.HistoryModel;

import java.util.UUID;

public class HistoryUser extends HistoryModel {
    private Card card;
    private String cafeName;
    public HistoryUser(double price, Location location, UUID userID, String cafeName, String productName, Card card, short amount) {
        super(price, userID, productName, amount, location);
        this.card = card;
        this.cafeName = cafeName;
    }

    @Override
    public short getAmount() {
        return super.getAmount();
    }

    @Override
    public void setAmount(short amount) {
        super.setAmount(amount);
    }

    @Override
    public String getProductName() {
        return super.getProductName();
    }

    @Override
    public void setProductName(String productName) {
        super.setProductName(productName);
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getCafeName() {
        return cafeName;
    }

    public void setCafeName(String cafeName) {
        this.cafeName = cafeName;
    }

    @Override
    public UUID getUserID() {
        return super.getUserID();
    }

    @Override
    public void setUserID(UUID userID) {
        super.setUserID(userID);
    }
}

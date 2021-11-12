package uz.pdp.model;

import uz.pdp.model.base.BaseModel;

import java.util.UUID;

public class Card extends BaseModel {
    protected UUID userID;

    public Card(String cardName, long cardNumber, double cardBalance, UUID userID) {
        super(cardName, cardNumber, cardBalance);
        this.userID = userID;
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    @Override
    public long getCardNumber() {
        return super.getCardNumber();
    }

    @Override
    public void setCardNumber(long cardNumber) {
        super.setCardNumber(cardNumber);
    }

    @Override
    public UUID getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getCardBalance() {
        return super.getCardBalance();
    }

    @Override
    public void setCardBalance(double cardBalance) {
        super.setCardBalance(cardBalance);
    }

    @Override
    public boolean isActive() {
        return super.isActive();
    }

    @Override
    public void setActive(boolean active) {
        super.setActive(active);
    }
}

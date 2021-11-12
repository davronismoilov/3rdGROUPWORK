package uz.pdp.model;

import uz.pdp.model.base.HistoryModel;

import java.util.UUID;

public class HistoryCafe extends HistoryModel {
    public HistoryCafe(double price, UUID userID, String productName, short amount, Location location) {
        super(price, userID, productName, amount, location);
    }

    @Override
    public String getProductName() {
        return super.getProductName();
    }

    @Override
    public void setProductName(String productName) {
        super.setProductName(productName);
    }

    @Override
    public short getAmount() {
        return super.getAmount();
    }

    @Override
    public void setAmount(short amount) {
        super.setAmount(amount);
    }
}

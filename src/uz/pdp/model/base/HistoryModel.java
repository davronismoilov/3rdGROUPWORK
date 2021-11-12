package uz.pdp.model.base;


import uz.pdp.model.Location;

import java.util.UUID;

public class HistoryModel extends BaseModel {
    protected String productName;
    protected short amount;
    protected Location location;
    protected UUID userID;

    public HistoryModel(double price, UUID userID, String productName, short amount, Location location) {
        super.price = price;
        this.userID = userID;
        this.productName = productName;
        this.amount = amount;
        this.location = location;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public short getAmount() {
        return amount;
    }

    public void setAmount(short amount) {
        this.amount = amount;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }
}

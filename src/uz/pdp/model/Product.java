package uz.pdp.model;

import uz.pdp.model.base.BaseModel;

import java.util.UUID;

public class Product extends BaseModel {
    private UUID subcategoryID;
    private String cafeName;
    private UUID cafeID;

    public Product(String name, String cafeName, double price, short amount, UUID subcategoryID, UUID cafeID) {
        super.name = name;
        super.price = price;
        super.productAmount = amount;
        this.cafeName = cafeName;
        this.subcategoryID = subcategoryID;
        this.cafeID = cafeID;
    }

    public UUID getSubcategoryID() {
        return subcategoryID;
    }

    public void setSubcategoryID(UUID subcategoryID) {
        this.subcategoryID = subcategoryID;
    }

    public String getCafeName() {
        return cafeName;
    }

    public void setCafeName(String cafeName) {
        this.cafeName = cafeName;
    }

    public UUID getCafeID() {
        return cafeID;
    }

    public void setCafeID(UUID cafeID) {
        this.cafeID = cafeID;
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
    public boolean isActive() {
        return super.isActive();
    }

    @Override
    public void setActive(boolean active) {
        super.setActive(active);
    }

    @Override
    public short getProductAmount() {
        return super.getProductAmount();
    }

    @Override
    public void setProductAmount(short productAmount) {
        super.setProductAmount(productAmount);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }
}

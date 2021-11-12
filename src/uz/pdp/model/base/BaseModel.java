package uz.pdp.model.base;

import java.util.UUID;

public abstract class BaseModel {
    protected String username; // admin
    protected String password;
    protected String phoneNumber;
    protected long cardNumber;
    protected double cardBalance;
    protected final UUID id;
    protected short productAmount;
    protected String name;
    protected double price;
    protected double boughtSum; // sum of all bought products price by user
    protected String city;
    protected String district;
    protected String street;
    protected String home;
    protected boolean isActive = true;

    {
        id = UUID.randomUUID();
    }

    public BaseModel() {
    }

    public BaseModel(String username, String password) { //for admin
        this.username = username;
        this.password = password;
    }

    public BaseModel(String phoneNumber) { // for user
        this.phoneNumber = phoneNumber;
    }

    public BaseModel(String cardName, long cardNumber, double cardBalance) { // for card
        this.name = cardName;
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }


    public double getBoughtSum() {
        return boughtSum;
    }

    public void setBoughtSum(double boughtSum) {
        this.boughtSum = boughtSum;
    }

    public short getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(short productAmount) {
        this.productAmount = productAmount;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

package uz.pdp.model;

import uz.pdp.model.base.BaseModel;

import java.util.UUID;

public class Cafe extends BaseModel {
    private double cafeBalance;

    public Cafe(String name, String username, String password) {
        super.name = name;
        super.username = username;
        super.password = password;
    }

    public double getCafeBalance() {
        return cafeBalance;
    }

    public void setCafeBalance(double cafeBalance) {
        this.cafeBalance = cafeBalance;
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(username);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
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
}

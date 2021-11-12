package uz.pdp.model;

import uz.pdp.model.base.BaseModel;

import java.util.UUID;

public class User extends BaseModel {


    public User(String phoneNumber) {
        super(phoneNumber);
    }

    public User(String username, String password) { // for admin
        super(username, password);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public UUID getId() {
        return super.getId();
    }

    @Override
    public double getBoughtSum() {
        return super.getBoughtSum();
    }

    @Override
    public void setBoughtSum(double boughtSum) {
        super.setBoughtSum(boughtSum);
    }
}

package uz.pdp.model;

import uz.pdp.model.base.BaseModel;

import java.util.UUID;

public class Location extends BaseModel {
    private UUID userID;

    public Location(String city, String district, String street, String home, UUID userID) {
        super.city = city;
        super.district = district;
        super.street = street;
        super.home = home;
        this.userID = userID;
    }

    @Override
    public String getCity() {
        return super.getCity();
    }

    @Override
    public void setCity(String city) {
        super.setCity(city);
    }

    @Override
    public String getDistrict() {
        return super.getDistrict();
    }

    @Override
    public void setDistrict(String district) {
        super.setDistrict(district);
    }

    @Override
    public String getStreet() {
        return super.getStreet();
    }

    @Override
    public void setStreet(String street) {
        super.setStreet(street);
    }

    @Override
    public String getHome() {
        return super.getHome();
    }

    @Override
    public void setHome(String home) {
        super.setHome(home);
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }
}

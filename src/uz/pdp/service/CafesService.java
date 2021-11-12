package uz.pdp.service;

import uz.pdp.model.Cafe;
import uz.pdp.model.Category;
import uz.pdp.model.Product;
import uz.pdp.model.User;
import uz.pdp.service.base.BaseService;

import java.util.ArrayList;
import java.util.List;

public class CafesService implements BaseService<Cafe, List<Cafe>, Product, String> {
    private List<Cafe> cafes = new ArrayList<>();

    @Override
    public void add(Cafe cafe) {
        cafes.add(cafe);
    }

    @Override
    public int sendSMS() {
        return 0;
    }

    @Override
    public List<Cafe> getList(Product product) {
        return null;
    }

    @Override
    public List<Cafe> getList() {
        return null;
    }

    @Override
    public boolean check(String name) {
        for (Cafe cafe : cafes) {
            if (cafe.getName().equals(name))
                return false;
        }
        return true;
    }

    @Override
    public Cafe get(String name) {
        for (Cafe cafe : cafes) {
            if (cafe.getName().equals(name))
                return cafe;
        }
        return null;
    }

    @Override
    public Cafe get(String username, String password) {
        for (Cafe cafe : cafes) {
            if (cafe.getUsername().equals(username) && cafe.getPassword().equals(password))
                return cafe;
        }
        return null;
    }

    public boolean checkUsername(String username) {
        for (Cafe cafe : cafes) {
            if (cafe.getUsername().equals(username))
                return false;
        }
        return true;
    }

}

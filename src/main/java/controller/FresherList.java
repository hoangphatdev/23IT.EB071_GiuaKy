package controller;

import model.Fresher_employee;

import java.util.ArrayList;
import java.util.List;

public class FresherList {
    private List<Fresher_employee> fresherList = new ArrayList<>();

    public List<Fresher_employee> getFresherList() {
        return fresherList;
    }

    public void setFresherList(List<Fresher_employee> fresher_emplManger) {
        this.fresherList = fresher_emplManger;
    }
}

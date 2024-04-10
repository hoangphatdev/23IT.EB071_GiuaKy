package controller;

import model.Intern_employee;

import java.util.ArrayList;
import java.util.List;

public class InternList {
    private List<Intern_employee> internList = new ArrayList<>();

    public List<Intern_employee> getInternList() {
        return internList;
    }

    public void setInternList(List<Intern_employee> intern_employManger) {
        this.internList = intern_employManger;
    }
}

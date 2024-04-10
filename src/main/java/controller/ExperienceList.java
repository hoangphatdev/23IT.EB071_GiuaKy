package controller;

import model.Experience_employee;

import java.util.ArrayList;
import java.util.List;

public class ExperienceList {
    private List<Experience_employee> expList = new ArrayList<>();


    public List<Experience_employee> getExpList() {
        return expList;
    }

    public void setExpList(List<Experience_employee> exp_emplManager) {
        this.expList = exp_emplManager;
    }
}

package controller;

import model.IEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
   private
   List<IEmployee> emplList = new ArrayList<>();
   public EmployeeList(){
   }

    public List<IEmployee> getEmplList() {
        return emplList;
    }

    public void setEmplList(List<IEmployee> emplList) {
        this.emplList = emplList;
    }
}

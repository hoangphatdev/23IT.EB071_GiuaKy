import controller.CrudEmpl;
import controller.CrudEmplImple;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
//        controller.EmployeeList employeeList = new controller.EmployeeList();
        int num = 0;
        CrudEmplImple crudEmplImple = new CrudEmplImple();
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to Employee Management System ><");
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Edit Employee");
            System.out.println("4. Show All Employee");
            System.out.println("5. Out Program");
            System.out.println("---------------------------------------------");
            System.out.println("Select");
            num = scan.nextInt();
        switch (num){
            case 1: crudEmplImple.addEmpl();
            break;
            case 2: crudEmplImple.deleteEmpl();
            break;
            case 3: crudEmplImple.editEmpl();
            break;
            case 4: crudEmplImple.selectAllEmpl();
            break;
        }
        }while(num !=5);
    }
}

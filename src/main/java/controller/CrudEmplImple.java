package controller;

import dao.File_AddEmployee;
import model.Experience_employee;
import model.Fresher_employee;
import model.IEmployee;
import model.Intern_employee;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;



public class CrudEmplImple implements CrudEmpl{
    EmployeeList emplManager = new EmployeeList();
    ExperienceList expManager = new ExperienceList();
    FresherList fresherManager = new FresherList();
    InternList internManager = new InternList();
    @Override
    public IEmployee addEmpl() throws ParseException {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.println("Which employee do you want to add?");
        System.out.println("1.Experience");
        System.out.println("2.Fresher");
        System.out.println("3.Intern");
        num = scan.nextInt(); scan.nextLine();
        if(num == 1){
            System.out.println("id: ");
            int id = scan.nextInt(); scan.nextLine();
            System.out.println("Full Name: ");
            String fullName = scan.nextLine();
            System.out.println("Birthday");
            String birthDay = scan.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date birthDayDate = (Date) dateFormat.parse(birthDay);
            System.out.println("Email: ");
            String email = scan.nextLine();
            System.out.println("Employee Type: ");
            String employee_type = scan.nextLine();
            System.out.println("Experience Year: ");
            int expYear = scan.nextInt(); scan.nextLine();
            System.out.println("Professional Skill: ");
            String proSkill = scan.nextLine();
            Experience_employee ex = new Experience_employee(id, fullName,birthDayDate,email,employee_type, expYear, proSkill );
            try {
                new File_AddEmployee().addEmployee(ex);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            expManager.getExpList().add(ex);
        }else if(num == 2){
            System.out.println("id: ");
            int id = scan.nextInt(); scan.nextLine();
            System.out.println("Full Name: ");
            String fullName = scan.nextLine();
            System.out.println("Birthday");
            String birthDay = scan.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date birthDayDate = (Date) dateFormat.parse(birthDay);
            System.out.println("Email: ");
            String email = scan.nextLine();
            System.out.println("Employee Type: ");
            String employee_type = scan.nextLine();
            System.out.println("Graduation Date: ");
            String graduation_date = scan.nextLine();
            Date garaduation_dateDate = (Date) dateFormat.parse(graduation_date);
            System.out.println("Graduation Rank: ");
            String graduation_rank = scan.nextLine();
            System.out.println("Your Education: ");
            String education = scan.nextLine();
            Fresher_employee fr = new Fresher_employee(id, fullName,birthDayDate,email,employee_type,garaduation_dateDate,graduation_rank,education);
            try {
                new File_AddEmployee().addEmployee(fr);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            fresherManager.getFresherList().add(fr);

        }else if(num == 3){
            System.out.println("id: ");
            int id = scan.nextInt(); scan.nextLine();
            System.out.println("Full Name: ");
            String fullName = scan.nextLine();
            System.out.println("Birthday");
            String birthDay = scan.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date birthDayDate = (Date) dateFormat.parse(birthDay);
            System.out.println("Email: ");
            String email = scan.nextLine();
            System.out.println("Employee Type: ");
            String employee_type = scan.nextLine();
            System.out.println("Majors");
            String majors = scan.nextLine();
            System.out.println("Semester: ");
            int semester = scan.nextInt(); scan.nextLine();
            System.out.println("University: ");
            String university = scan.nextLine();
            Intern_employee inter = new Intern_employee(id, fullName,birthDayDate,email,employee_type,majors,semester,university);
            try {
                new File_AddEmployee().addEmployee(inter);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            internList.getInternList().add(inter);
        }
        return null;
    }

    @Override
    public IEmployee deleteEmpl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your employee fullname which is needed to delete: ");
        String fullName = scan.nextLine();
        System.out.println("Enter your employee id which is needed to delete");
        int id = scan.nextInt(); scan.nextLine();
        System.out.println("Enter type of employee");
        System.out.println("1. Experience employee");
        System.out.println("2. Fresher");
        System.out.println("3. Intern ");
        int num = scan.nextInt(); scan.nextLine();
        if(num == 1){
            for(Experience_employee ex : expManager.getExpList()){
                if(ex.getId() == id && ex.getFullName() == fullName){
                    expManager.getExpList().remove(ex);
                }
                else System.out.println("Id and FullName not found!!!");
            }
        }else if (num == 2){
            for(Fresher_employee fr : fresherManager.getFresherList()){
                if(fr.getId() == id && fr.getFullName() == fullName){
                    fresherManager.getFresherList().remove(fr);
                }
                else System.out.println("Id and FullName not found!!!");
            }
        }else if (num == 3){
            for(Intern_employee in : internManager.getInternList()){
                if(in.getId() == id && in.getFullName() == fullName){
                    internManager.getInternList().remove(in);
                }
                else System.out.println("Id and FullName not found!!!");
            }
        }



        return null;
    }
    @Override
    public IEmployee editEmpl() {
        return null;
    }

    @Override
    public List<IEmployee> selectAllEmpl() {
        return null;
    }
}

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
        System.out.println("----------------");
        System.out.println("Which employee do you want to add?");
        System.out.println("1.Experience");
        System.out.println("2.Fresher");
        System.out.println("3.Intern");
        System.out.print("--->");
        num = scan.nextInt(); scan.nextLine();
        if(num == 1){
            System.out.println("id: ");
            int id = scan.nextInt(); scan.nextLine();
            System.out.println("Full Name: ");
            String fullName = scan.nextLine();
            System.out.println("Birthday (dd/MM/yyyy)");
            String birthDayStringEnter = scan.nextLine();
            String birthDayString = birthDayStringEnter + " 00:00:00";
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date birthdayParse = (Date) dateFormat.parse(birthDayString);
            java.sql.Date birthdayDate = new java.sql.Date(birthdayParse.getTime());
            System.out.println("Email: ");
            String email = scan.nextLine();
            System.out.println("Employee Type: ");
            String employee_type = scan.nextLine();
            System.out.println("Experience Year: ");
            int expYear = scan.nextInt(); scan.nextLine();
            System.out.println("Professional Skill: ");
            String proSkill = scan.nextLine();
            Experience_employee ex = new Experience_employee(id, fullName,birthdayDate,email,employee_type, expYear, proSkill );
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
            internManager.getInternList().add(inter);
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
    public IEmployee editEmpl() throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("1. Experience employee");
        System.out.println("2. Fresher");
        System.out.println("3. Intern ");
        System.out.println("Enter type of employee which you want to edit");
        int num = scan.nextInt();
        scan.nextLine();
        if (num == 1) {
            System.out.println("List of Experience employee");
            for (Experience_employee ex : expManager.getExpList()) {
                System.out.println(ex);
            }
            System.out.println("Which experiece employee do you want to edit: ");
            System.out.println("Please, enter id and fullname: ");
            System.out.println("Id: ");
            int idFind = scan.nextInt();
            scan.nextLine();
            System.out.println("FullName: ");
            String fullNameFind = scan.nextLine();
            int emplIndex = 0;
            for (Experience_employee ex : expManager.getExpList()) {
                emplIndex++;
                if (idFind == ex.getId() && fullNameFind == ex.getFullName()) {
                    System.out.println("---------");
                    int condition = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Edit ID? --- 1.Yes 0.No");
                    if (condition == 1) {
                        System.out.println("Enter ID:");
                        int idEdit = scan.nextInt();
                        scan.nextLine();
                        ex.setId(idEdit);
                    }
                    System.out.println("Edit fullName? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter FullName: ");
                        String fullNameEdit = scan.nextLine();
                        ex.setFullName(fullNameEdit);
                    }
                    System.out.println("Edit birthday? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter birthday: ");
                        String birthdayStringEnter = scan.nextLine();
                        String birthdayString = birthdayStringEnter + " 00:00:00";
                        SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");
                        java.util.Date birthdayParse = (Date) dfm.parse(birthdayString);
                        java.sql.Date birthdayDate = new Date(birthdayParse.getTime());
                        ex.setBirthDay(birthdayDate);
                    }
                    System.out.println("Edit email? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter email: ");
                        String emailEdit = scan.nextLine();
                        ex.setEmail(emailEdit);
                    }
                    System.out.println("Edit employee_type? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter employee type: ");
                        String empl_typeEdit = scan.nextLine();
                        ex.setEmployee_type(empl_typeEdit);
                    }
                    System.out.println("Edit exp year? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter exp year: ");
                        int expYearEdit = scan.nextInt();
                        scan.nextLine();
                        ex.setExpYear(expYearEdit);
                    }
                    System.out.println("Edit professional skill? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter pro skill: ");
                        String proSkillEdit = scan.nextLine();
                        ex.setProSkill(proSkillEdit);
                    }
                    // replace obj empl moi vao obj cu o arraylist
                    expManager.getExpList().set(emplIndex, ex);
                    System.out.println("Edit successfully ><");
                }
            }
        } else if (num == 2) {
            System.out.println("List of fresher employee");
            for (Fresher_employee fr : fresherManager.getFresherList()) {
                System.out.println(fr);
            }
            System.out.println("Which frehser employee do you want to edit: ");
            System.out.println("Please, enter id and fullname: ");
            System.out.println("Id: ");
            int idFind = scan.nextInt();
            scan.nextLine();
            System.out.println("FullName: ");
            String fullNameFind = scan.nextLine();
            int emplIndex = 0;
            for (Fresher_employee fr : fresherManager.getFresherList()) {
                emplIndex++;
                if (idFind == fr.getId() && fullNameFind == fr.getFullName()) {
                    System.out.println("---------");
                    int condition = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Edit ID? --- 1.Yes 0.No");
                    if (condition == 1) {
                        System.out.println("Enter ID:");
                        int idEdit = scan.nextInt();
                        scan.nextLine();
                        fr.setId(idEdit);
                    }
                    System.out.println("Edit fullName? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter FullName: ");
                        String fullNameEdit = scan.nextLine();
                        fr.setFullName(fullNameEdit);
                    }
                    System.out.println("Edit birthday? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter birthday: ");
                        String birthdayStringEnter = scan.nextLine();
                        String birthdayString = birthdayStringEnter + " 00:00:00";
                        SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");
                        java.util.Date birthdayParse = (Date) dfm.parse(birthdayString);
                        java.sql.Date birthdayDate = new Date(birthdayParse.getTime());
                        fr.setBirthDay(birthdayDate);
                    }
                    System.out.println("Edit email? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter email: ");
                        String emailEdit = scan.nextLine();
                        fr.setEmail(emailEdit);
                    }
                    System.out.println("Edit employee_type? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter employee type: ");
                        String empl_typeEdit = scan.nextLine();
                        fr.setEmployee_type(empl_typeEdit);
                    }
                    System.out.println("Edit graduaion date? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter graduation date: ");
                        String graduationDateEnter = scan.nextLine();
                        String graduationDateString = graduationDateEnter + " 0:0:0";
                        SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd");
                        java.util.Date dateParse = (Date) fm.parse(graduationDateString);
                        java.sql.Date graduationDate = new Date(dateParse.getTime());
                        fr.setGraduation_date(graduationDate);
                    }
                    System.out.println("Edit graduation rank? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter graduation rank: ");
                        String graduationRankEdit = scan.nextLine();
                        fr.setGraduation_rank(graduationRankEdit);
                    }
                    System.out.println("Edit education? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter education: ");
                        String educationEdit = scan.nextLine();
                        fr.setEducation(educationEdit);
                    }
                    // replace obj empl moi vao obj cu o arraylist
                    fresherManager.getFresherList().set(emplIndex, fr);
                    System.out.println("Edit successfully ><");
                }
            }
        }else if(num == 3){
            System.out.println("List of intern employee");
            for (Intern_employee in : internManager.getInternList()){
                System.out.println(in);
            }
            System.out.println("Which intern employee do you want to edit?");
            System.out.println("Please, enter id and fullname: ");
            System.out.println("Id: ");
            int idFind = scan.nextInt();
            scan.nextLine();
            System.out.println("FullName: ");
            String fullNameFind = scan.nextLine();
            int emplIndex = 0;
            for (Intern_employee in : internManager.getInternList()){
                emplIndex++;
                if (idFind == in.getId() && fullNameFind == in.getFullName()){
                    System.out.println("----------");
                    int condition = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Edit ID? --- 1.Yes 0.No");
                    if (condition == 1) {
                        System.out.println("Enter ID:");
                        int idEdit = scan.nextInt();
                        scan.nextLine();
                        in.setId(idEdit);
                    }
                    System.out.println("Edit fullName? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter FullName: ");
                        String fullNameEdit = scan.nextLine();
                        in.setFullName(fullNameEdit);
                    }
                    System.out.println("Edit birthday? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter birthday: ");
                        String birthdayStringEnter = scan.nextLine();
                        String birthdayString = birthdayStringEnter + " 00:00:00";
                        SimpleDateFormat dfm = new SimpleDateFormat("dd-MM-yyyy");
                        java.util.Date birthdayParse = (Date) dfm.parse(birthdayString);
                        java.sql.Date birthdayDate = new Date(birthdayParse.getTime());
                        in.setBirthDay(birthdayDate);
                    }
                    System.out.println("Edit email? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter email: ");
                        String emailEdit = scan.nextLine();
                        in.setEmail(emailEdit);
                    }
                    System.out.println("Edit employee_type? --- 1.Yes 0.No");
                    condition = scan.nextInt();
                    scan.nextLine();
                    if (condition == 1) {
                        System.out.println("Enter employee type: ");
                        String empl_typeEdit = scan.nextLine();
                        in.setEmployee_type(empl_typeEdit);
                    }
                    System.out.println("Edit majors? --- 1.Yes 0.No");
                    condition = scan.nextInt(); scan.nextLine();
                    if (condition == 1){
                        System.out.println("Enter majors: ");
                        String majorsEdit = scan.nextLine();
                        in.setMajors(majorsEdit);
                    }
                    System.out.println("Edit semester? --- 1.Yes 0.No");
                    condition = scan.nextInt(); scan.nextLine();
                    if(condition == 1){
                        System.out.println("Enter semester: ");
                        int semesterEdit = scan.nextInt(); scan.nextLine();
                        in.setSemester(semesterEdit);
                    }
                    System.out.println("Edit university name? --- 1.Yes 0.No");
                    condition = scan.nextInt(); scan.nextLine();
                    if(condition == 1){
                        System.out.println("Enter university name: ");
                        String universityNameEdit = scan.nextLine();
                        in.setUniversity_name(universityNameEdit);
                    }
                    internManager.getInternList().set(emplIndex, in);
                    System.out.println("Edit successfully");
                }
            }
        }
        return null;
    }
    @Override
    public List<IEmployee> selectAllEmpl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which employee list type do you want to show?");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Intern");
        int num = scan.nextInt(); scan.nextLine();
        System.out.println("-------");
        if(num == 1){
            for (Experience_employee exp : expManager.getExpList()){
                System.out.println(exp);
            }
        }else if(num == 2){
            for(Fresher_employee fr : fresherManager.getFresherList()){
                System.out.println(fr);
            }
        }else if(num == 3){
            for (Intern_employee in : internManager.getInternList()){
                System.out.println(in);
            }
        }

        return null;
    }
}

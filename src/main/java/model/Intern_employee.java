package model;

import java.sql.Date;

public class Intern_employee extends Employee implements IEmployee{
    private String majors;
    private int semester;
    private String university_name;
    public Intern_employee(){};

    public Intern_employee(int id, String fullName, Date birthDay, String email, String employee_type, String majors, int semester, String university_name) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.email = email;
        this.employee_type = employee_type;
        this.majors = majors;
        this.semester = semester;
        this.university_name = university_name;
    }
    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    @Override
    public String toString() {
        return "Intern_employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDay=" + birthDay +
                ", email='" + email + '\'' +
                ", employee_type='" + employee_type + '\'' +
                ", majors='" + majors + '\'' +
                ", semester=" + semester + '\'' +
                ", university_name='" + university_name + '\'' +
                '}';
    }

    @Override
    public void showInfo() {

    }
}

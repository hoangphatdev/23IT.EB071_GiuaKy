package model;

import java.sql.Date;

public class Intern_employee implements IEmployee{
    int id;
    String fullName;
    Date birthDay;
    String email;
    String employee_type;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployee_type() {
        return employee_type;
    }

    public void setEmployee_type(String employee_type) {
        this.employee_type = employee_type;
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
        return "model.Intern_employee{" +
                "majors='" + majors + '\'' +
                ", semester=" + semester +
                ", university_name='" + university_name + '\'' +
                '}';
    }

    @Override
    public void showInfo() {

    }
}

package model;


import java.sql.Date;

public class Fresher_employee extends Employee implements IEmployee{
    private Date graduation_date;
    private String graduation_rank;
    private String education;
    public Fresher_employee(){};
    public Fresher_employee(int id, String fullName, Date birthDay, String email, String employee_type,  Date graduation_date, String graduation_rank, String education) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.email = email;
        this.employee_type = employee_type;
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }
    public Date getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(Date graduation_date) {
        this.graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    @Override
    public String toString() {
        return "model.Fresher_employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDay=" + birthDay +
                ", email='" + email + '\'' +
                ", employee_type='" + employee_type + '\'' +
                ", graduation_date=" + graduation_date +
                ", graduation_rank='" + graduation_rank + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
    @Override
    public void showInfo() {

    }
}

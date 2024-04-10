package model;


import java.sql.Date;
public class Experience_employee  implements IEmployee {
    int id;
    String fullName;
    Date birthDay;
    String email;
    String employee_type;
    private int expYear;
    private String proSkill;
    public Experience_employee(){};

    public Experience_employee(int id, String fullName, Date birthDay, String email, String employee_type, int expYear, String proSkill) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.email = email;
        this.employee_type = employee_type;
        this.expYear = expYear;
        this.proSkill = proSkill;
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

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "model.Experience_employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDay=" + birthDay +
                ", email='" + email + '\'' +
                ", employee_type='" + employee_type + '\'' +
                ", expYear=" + expYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(
                "Experience:[fullName= "



        );
    }
}

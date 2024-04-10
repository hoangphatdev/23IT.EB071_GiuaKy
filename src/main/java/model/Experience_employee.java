package model;


import java.sql.Date;
public class Experience_employee extends Employee  implements IEmployee {
    private int expYear;
    private String proSkill;

    public Experience_employee(int id, String fullName, Date birthDay, String email, String employee_type, int expYear, String proSkill) {
        super(id, fullName, birthDay, email, employee_type);
        this.expYear = expYear;
        this.proSkill = proSkill;
    }
    public Experience_employee(){};
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
        return "Experience_employee{" +
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

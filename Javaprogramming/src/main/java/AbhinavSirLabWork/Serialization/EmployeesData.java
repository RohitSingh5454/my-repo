package AbhinavSirLabWork.Serialization;

import java.io.Serializable;

public class EmployeesData implements Serializable {
    private String name;
    private String occupation;
   transient private String email;

    public EmployeesData(String name, String occupation, String email) {
        this.name = name;
        this.occupation = occupation;
        this.email = email;
    }

    public EmployeesData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void displayName(){
        System.out.println("My name is "+this.name + " occupation is "+this.occupation + " email is "+this.email);
    }
}

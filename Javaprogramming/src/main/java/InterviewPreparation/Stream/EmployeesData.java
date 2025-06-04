package InterviewPreparation.Stream;

import java.time.LocalDate;
import java.util.List;

public class EmployeesData {
    int id;
    String name;
    LocalDate date;
    List<String> hobbies;
    EmployeesData(int EmpId,String EmpName,LocalDate dob,List<String> hobby){
        id=EmpId;
        name=EmpName;
        date=dob;
        hobbies=hobby;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public List<String> getHobbies(){
        return hobbies;
    }
    public void setHobbies(List<String> hobby){
        this.hobbies=hobby;
    }


    @Override
    public String toString() {
        return "EmployeesData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}

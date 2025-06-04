package AbhinavSirLabWork.InterviewCoding.ibm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class  EmployeesData{
    int id;
    String name;
    int age;
    String department;

    public static void main(String[] args) {
        List<EmployeesData> list=new ArrayList<>();
        list.addAll(getEmployeesData());
        list.stream().sorted(Comparator.comparing(EmployeesData::getAge)).collect(Collectors.toList()).forEach(System.out::println);
        //System.out.println(list);
    }

    public EmployeesData(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }
    public static List<EmployeesData> getEmployeesData(){
        List<EmployeesData> list = new ArrayList<>();
        list.add(new EmployeesData(1, "Kavita", 32, "Hr"));
        list.add(new EmployeesData(7, "Rohan", 37, "Finance"));
        list.add(new EmployeesData(4, "Manohar", 31, "Banking"));
        list.add(new EmployeesData(3, "Shalini", 29, "Manager"));

        return list;
    }

    public EmployeesData() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "EmployeesData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}

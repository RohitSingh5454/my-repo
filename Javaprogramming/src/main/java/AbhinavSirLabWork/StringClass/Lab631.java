package AbhinavSirLabWork.StringClass;

public class Lab631 {
    public static void main(String[] args) {
        Student obj1=new Student();
        String str1=String.valueOf(obj1);
        System.out.println(str1);
        EmployeesData emp=new EmployeesData(89);
        String str2=String.valueOf(emp);
        System.out.println(str2);

    }
}
class Student{

}
class EmployeesData{
    int id;
    EmployeesData(int id){
        this.id=id;
    }
    public String toString(){
        return id+" ";
    }
}

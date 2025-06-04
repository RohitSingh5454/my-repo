package AbhinavSirLabWork.Oops.abstractClassabstractMethods;

public abstract class Person {
    String name;
    String gender;
    Person(String name,String gender){
        this.name=name;
        this.gender=gender;
    }
    public abstract void Work();
    public String toString(){
        return name+" "+gender;
    }
    public void changeName(String Newname){
        this.name=Newname;
    }
}
class EmployeesData extends Person{
    int id;

    EmployeesData(String name,String gender,int id){
        super(name, gender);
        this.id=id;
    }
    @Override
    public void Work() {
        if (id==0){
            System.out.println("EmployeesData is not working");
        }
        else {
            System.out.println("EmployeesData is working");
        }
    }

    public static void main(String[] args) {
        Person emp=new EmployeesData("Raghav","male",0);
        emp.Work();
        emp.changeName("Ranjan");
        emp.Work();
        emp.toString();
    }
}

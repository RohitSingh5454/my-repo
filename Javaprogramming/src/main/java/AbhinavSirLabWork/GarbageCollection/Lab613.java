package AbhinavSirLabWork.GarbageCollection;

public class Lab613 {
    public static void main(String[] args) {
        EmployeesData emps[]=new EmployeesData[500];
        for (int i=0;i< emps.length;i++){
            emps[i]=new EmployeesData("JLC "+(i+1));
        }

    }
}
class EmployeesData{
    String eid;
    double add[]=new double[123456];
    EmployeesData(String eid){
        this.eid=eid;
        System.out.println("\n object created with id "+eid);
    }
    protected void finalize(){
        System.out.println("Finalize "+eid);
    }
}

package AbhinavSirLabWork.Cloning;

public class deepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department dept=new Department(11,"Banking");
        EmployeesData emp1=new EmployeesData(1,"Raghav",23,dept);
        EmployeesData clone=(EmployeesData) emp1.clone();
        emp1.setEmpAge(34);
        clone.setEmpAge(37);
        System.out.println(emp1.getDepartment().getDeptId());
        System.out.println(emp1.getDepartment().getDeptName());
        clone.getDepartment().setDeptName("Finance");
        clone.getDepartment().setDeptId(23);
        System.out.println(clone.getDepartment().getDeptId());
        System.out.println(clone.getDepartment().getDeptName());
    }
}
class EmployeesData implements Cloneable{
   private int EmpId;
   private String EmpName;
   private int EmpAge;
   private Department department;

    public EmployeesData(int empId, String empName, int empAge, Department department) {
        EmpId = empId;
        EmpName = empName;
        EmpAge = empAge;
        this.department = department;
    }
    public Object clone() throws CloneNotSupportedException {
        EmployeesData cloned=(EmployeesData) super.clone();
        cloned.setDepartment((Department) cloned.getDepartment().clone());
        return cloned;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public int getEmpAge() {
        return EmpAge;
    }

    public void setEmpAge(int empAge) {
        EmpAge = empAge;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
class Department implements Cloneable{
    int deptId;
    String deptName;

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

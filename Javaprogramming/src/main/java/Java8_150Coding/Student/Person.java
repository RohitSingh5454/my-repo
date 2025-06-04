package Java8_150Coding.Student;

import java.util.function.Supplier;

public class Person {
    int pid;
    String sname;
    String age;
    String dob;
    public Person(int pid,String sname,String age,String dob){
        this.pid=pid;
        this.sname=sname;
        this.age=age;
        this.dob=dob;
    }

    public int getPid() {
        return pid;
    }

    public String getSname() {
        return sname;
    }

    public String getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }
}
class Hello{
    public static void main(String[] args) {
        Person ob1=new Person(23,"Yuvraaj","32","12/09/2084");
        Supplier<String> stringSupplier=()-> ob1.getAge();
        Supplier<String> supplier=ob1::getAge;
        System.out.println(stringSupplier.get());
        System.out.println(supplier.get());
    }
}

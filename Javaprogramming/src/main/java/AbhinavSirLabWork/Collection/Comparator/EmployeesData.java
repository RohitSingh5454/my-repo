package AbhinavSirLabWork.Collection.Comparator;

import java.util.*;
import java.io.*;
import java.lang.*;

public class EmployeesData {
    int rollNo;
    String name;
    String address;
    EmployeesData(String n,String addr,int roll){
        rollNo=roll;
        address=addr;
        name=n;
    }
    public String toString(){
        return this.rollNo+" "+this.name+" "+this.address;
    }
}
class Noman implements Comparator<EmployeesData>{

    @Override
    public int compare(EmployeesData o1, EmployeesData o2) {
        return o1.rollNo-o2.rollNo;
    }

}
class Manager implements Comparator<EmployeesData>{


    @Override
    public int compare(EmployeesData o1, EmployeesData o2) {
        return o1.address.compareTo(o2.address);
    }
}
class Client implements Comparator<EmployeesData>{


    @Override
    public int compare(EmployeesData o1, EmployeesData o2) {
        return o1.name.compareTo(o2.name);
    }
}
class Main{
    public static void main(String[] args) {
        ArrayList al=new ArrayList<EmployeesData>();
        al.add(new EmployeesData("rajan","New York",89));
        al.add(new EmployeesData("mahesh","London",34));
        al.add(new EmployeesData("krish","Chicago",56));
        al.add(new EmployeesData("piyush","Texas",91));
        System.out.println("Unsorted");
        for (int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        Collections.sort(al,new Noman());
        System.out.println("sort by rollno");
        for (int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        Collections.sort(al,new Client());
        System.out.println("sorted by name");
        for (int i=0;i< al.size();i++){
            System.out.println(al.get(i));
        }
        Collections.sort(al,new Manager());
        System.out.println("sorted by address");
        for (int i=0;i< al.size();i++){
            System.out.println(al.get(i));
        }

    }
}

package AbhinavSirLabWork.Serialization;

import java.io.*;

public class Lab891 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("D:\\sole.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            Address ad=new Address("Ranchi","Bahu bazaar");
            Teacher th=new Teacher(99,"Somlata",ad,"somalata@gmail.com",78);
            //Teacher.count=9;
            System.out.println(th);
            oos.writeObject(th);
            th.tname="kapil";
            th.email="kail@gmail.com";
            System.out.println("object serialized");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class Address implements Serializable{
    String add_id;
    String street;
    Address(String id,String street){
        this.add_id=id;
        this.street=street;
    }
    public String toString(){
        return add_id+" "+street;
    }

}
class Teacher implements Serializable{
    int tid;
    String tname;
    transient String email;
    static int count=6;
    Address add;
    Teacher(int id,String name,Address add,String email,int count){
        this.tid=id;
        this.tname=name;
        this.add=add;
        this.email=email;
        this.count=count;
    }
    public String toString(){
        return tid+" "+tname+" "+add+" "+email+" "+count;
    }
}

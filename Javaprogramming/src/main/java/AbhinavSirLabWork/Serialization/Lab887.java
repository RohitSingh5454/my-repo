package AbhinavSirLabWork.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lab887 {
    public static void main(String[] args) throws IOException {
        try(FileOutputStream fo=new FileOutputStream("D:\\java\\Core java Notes");
            ObjectOutputStream oos=new ObjectOutputStream(fo);) {
            Student st1=new Student(12,"Kamal",9877654333l);
        }
    }
}
class Student implements Serializable{
    int sid;
    String sname;
    long phone;
    static int count=3;
    Student(int id,String sname,long phone){
        this.sid=sid;
        this.phone=phone;
        this.sname=sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", phone=" + phone +
                '}';
    }
}

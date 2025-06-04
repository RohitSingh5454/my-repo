package AbhinavSirLabWork.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectIntoFile {
    public static void main(String[] args) throws IOException {
        EmployeesData obj1=new EmployeesData("Aman","Businessman","aman123@gmail.com");
        FileOutputStream fos=new FileOutputStream("xyz.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj1);
        oos.close();
        fos.close();
        System.out.println("File created!!!!!");
    }
}

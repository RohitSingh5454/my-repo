package AbhinavSirLabWork.Serialization.Deserialization;

import AbhinavSirLabWork.Serialization.EmployeesData;

import java.io.*;

public class FileStudent {
    public static void main(String[] args) {

        try {
           FileInputStream fos = new FileInputStream("xyz.txt");
            ObjectInputStream oos=new ObjectInputStream(fos);
            EmployeesData emp=(EmployeesData) oos.readObject();
            emp.displayName();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}

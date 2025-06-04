package AbhinavSirLabWork.Serialization;

import java.io.*;
class Bachelor implements Serializable{
    int id;
    String name;
    static int age;
    transient int roll;
    public Bachelor(int id,String name,int age,int roll){
        this.id=id;
        this.name=name;
        this.roll=roll;
        this.age=age;
    }
}
class serialExample{
    public static void printData(Bachelor ob1){
        System.out.println("id "+ob1.id);
        System.out.println("name "+ob1.name);
        System.out.println("roll "+ob1.roll);
        System.out.println("age "+ob1.age);
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Bachelor obj1=new Bachelor(1,"Rohan",45,77);
        String fileName="Rohit.txt";
        try {
            FileOutputStream fos=new FileOutputStream(fileName);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(obj1);
            oos.close();
            fos.close();
            System.out.println("Object has been serialized ");
            printData(obj1);
            obj1.age=67;
            obj1.name="Sagar";

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Deserialization
        obj1=null;
        FileInputStream fis=new FileInputStream(fileName);
        ObjectInputStream ois=new ObjectInputStream(fis);
       Bachelor obj2=(Bachelor)ois.readObject();
        ois.close();
        fis.close();
        System.out.println("Object has been deserialized");
        printData(obj2);
    }
}
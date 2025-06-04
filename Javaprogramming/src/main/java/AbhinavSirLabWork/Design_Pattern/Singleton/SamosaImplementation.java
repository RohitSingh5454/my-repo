package AbhinavSirLabWork.Design_Pattern.Singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SamosaImplementation {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {
//        Samosa samosa1=Samosa.getSamosa();
//        Samosa samosa2=Samosa.getSamosa();
//        Samosa samosa3=Samosa.getSamosa();
//        if (samosa1.hashCode()==samosa2.hashCode() && samosa2.hashCode()==samosa3.hashCode()){
//            System.out.println("All the three objects are same");
//        }
//        else {
//            System.out.println("All three objects are different");
//        }
//        Samosa ob1=Samosa.Instance;
//        System.out.println(ob1.hashCode());
//        Constructor<Samosa> constructor=Samosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa ob2=constructor.newInstance();
//        System.out.println(ob1.hashCode());
//        System.out.println(ob2.hashCode());
        // using serialization we can break singleton
        Samosa samosa1=Samosa.getSamosa();
        //System.out.println(samosa1.hashCode());
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(samosa1);
        System.out.println("Serialization done");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
        Samosa samosa2=(Samosa) ois.readObject();
        System.out.println(samosa2.hashCode());
        Samosa cloneSamosa=(Samosa) samosa2.clone();
        System.out.println("After cloning the object");
        System.out.println(cloneSamosa.hashCode());
    }
}

package AbhinavSirLabWork.File_Handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lab873 {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("xyz.txt");
            FileOutputStream fos=new FileOutputStream("xyz.txt");
            while (true){
                int asci=fis.read();
                if (asci==-1){
                    break;
                    //fos.write(asci);
                }
            }
            System.out.println("Writing completed");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

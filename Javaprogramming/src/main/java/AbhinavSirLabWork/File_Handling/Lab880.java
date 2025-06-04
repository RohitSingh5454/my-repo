package AbhinavSirLabWork.File_Handling;

import java.io.File;

public class Lab880 {
    public static void main(String[] args) {
        File file=new File("D:\\Html code with harry\\CSS\\Chapter 0");
        System.out.println("Dir found "+file.exists());
        file.mkdirs();
        System.out.println("Dir found "+file.exists());
    }
}

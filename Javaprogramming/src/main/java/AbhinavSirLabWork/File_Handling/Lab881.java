package AbhinavSirLabWork.File_Handling;

import AbhinavSirLabWork.Packages.Package1.Pac2Imp.F;

import java.io.File;
import java.io.IOException;

public class Lab881 {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Html code with harry\\CSS");
        System.out.println("File found "+file.exists());
        file.createNewFile();
        System.out.println("File found "+file.exists());
    }
}

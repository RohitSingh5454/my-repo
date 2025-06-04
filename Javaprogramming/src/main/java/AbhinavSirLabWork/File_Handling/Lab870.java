package AbhinavSirLabWork.File_Handling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Lab870 {
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("xyz.txt"); BufferedInputStream bis=new BufferedInputStream(fis);){
            while (true){
                int asci= bis.read();
                if (asci==-1)
                    break;
                char ch=(char) asci;
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}

package AbhinavSirLabWork.File_Handling;

import java.io.File;

public class Lab878 {
    public static void main(String[] args) {
        File file=new File("D:\\");
        File files[]=file.listFiles();
        for (File f:files){
            System.out.println(f+"-> isfile :"+f.isFile()+"idDir :"+f.isDirectory());
        }
    }
}

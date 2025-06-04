package AbhinavSirLabWork.File_Handling;

import java.io.File;

public class Lab877 {
    public static void main(String[] args) {
        File drives[]=File.listRoots();
        System.out.println(drives);
        for (File f:drives){
            long total= f.getTotalSpace();
            total=total/1024/1024/1024;
            System.out.println(f+"\t\t\t"+total+"GB\t\t"+"usable"+"GB");
        }
    }
}

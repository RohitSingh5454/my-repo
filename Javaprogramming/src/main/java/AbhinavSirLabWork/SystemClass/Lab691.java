package AbhinavSirLabWork.SystemClass;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Lab691 {
    public static void main(String[] args) throws Exception {
        System.out.println("Message using out");
        System.err.println("Message using Err");
        FileOutputStream fos=new FileOutputStream("out.txt");
        PrintStream ps=new PrintStream(fos);
        System.out.println(ps);
        System.setOut(ps);
        for (int i=0;i< args.length;i++){
            System.out.println("value is : "+i);
        }
        System.out.println("Message using Err");
    }
}

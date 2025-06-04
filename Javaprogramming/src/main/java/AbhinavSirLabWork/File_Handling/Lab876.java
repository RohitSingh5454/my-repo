package AbhinavSirLabWork.File_Handling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lab876 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("abc.txt");
        pw.println(97);
        pw.write(97);
        pw.println(10.0);
        pw.println(true);
        pw.println("Jlc");
        pw.close();
    }
}

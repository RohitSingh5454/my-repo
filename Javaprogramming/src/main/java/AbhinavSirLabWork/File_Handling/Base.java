package AbhinavSirLabWork.File_Handling;

import java.io.File;
import java.io.IOException;

public class Base {
    public static void main(String[] args) throws IOException {
        File f=new File("E:\\java Programming\\Java_Programming\\abc.txt\\Rohit_Singh");
        System.out.println( f.mkdir());

    }
}

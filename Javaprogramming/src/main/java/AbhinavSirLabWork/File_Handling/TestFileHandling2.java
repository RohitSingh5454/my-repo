package AbhinavSirLabWork.File_Handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileHandling2 {
    public static void main(String[] args) throws IOException {
       /* File fn=new File("C:\\Users\\User\\Downloads\\Rohit_labs");
        System.out.println(fn.mkdir());
        File leaveApp=new File(fn.getCanonicalPath()+"\\application-leave.txt");
        leaveApp.createNewFile();
        FileWriter fw=new FileWriter(leaveApp);
        fw.write("Hello sir we have a great discussion");
        fw.close();*/
        File fs=new File("xyz.txt");
        fs.createNewFile();
        FileReader rd=new FileReader(fs);
        int i;
        while ((i=rd.read())!=-1){
            System.out.println((char) i);
        }
    }
}

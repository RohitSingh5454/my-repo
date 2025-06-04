package AbhinavSirLabWork.File_Handling;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileFilter;

public class Lab879 {
    public static void main(String[] args) {
        File file=new File("D:\\codebase");
        File javaFiles[] =file.listFiles(new ExcFilter(".java"));
        System.out.println("Java Files");
        if (javaFiles!=null){
            for (File f:javaFiles){
                System.out.println(f);
            }

        }
        else
            System.out.println("no java file found");
    }
}

class ExcFilter implements FileFilter{
    String ext;
    public ExcFilter(String ext){
        this.ext=ext;
    }

    @Override
    public boolean accept(File f) {
        return f.getName().endsWith(ext);
    }
}

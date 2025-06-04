package AbhinavSirLabWork.File_Handling;

import java.io.BufferedInputStream;

public class Lab869 {
    public static void main(String[] args) {
        System.out.println("Enter data");
        try (BufferedInputStream bis=new BufferedInputStream(System.in)){
            while (true){
                int asc=bis.read();
                System.out.println(asc);
                if (asc==13)
                    break;
                char ch=(char) asc;
                System.out.println(ch);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}

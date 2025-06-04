package AbhinavSirLabWork.File_Handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lab871 {
    public static void main(String[] args) {
        try(InputStreamReader isr=new InputStreamReader(System.in); BufferedReader br=new BufferedReader(isr);) {
            System.out.println("Enter id");
            String id=br.readLine();
            System.out.println("Enter name");
            String name=br.readLine();
            System.out.println(id+"\t"+name);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

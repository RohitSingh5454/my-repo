package AbhinavSirLabWork.File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Lab874 {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("xyz.txt");
            BufferedReader br=new BufferedReader(fr);
            FileWriter fw=new FileWriter("xyz.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            while (true){
                String st= br.readLine();
                if (st==null)
                    break;
                bw.write(st);
                bw.write("Daman and diu");
                bw.newLine();
            }
            bw.close();
            System.out.println("Writing completed");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

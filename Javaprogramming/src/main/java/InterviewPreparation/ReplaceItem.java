package InterviewPreparation;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class ReplaceItem {
    public static void main(String[] args) {
        ArrayList<String> l1=new ArrayList<>(List.of("A","B","C","D","E"));
        int index= l1.indexOf("D");
        System.out.println(l1);
         l1.set(l1.indexOf("D"),"D_new" );
         Assertions.assertEquals("D_new",l1.get(index));
        System.out.println("After change "+l1);
    }
}

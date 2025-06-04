package AbhinavSirLabWork.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem_1 {
    public static void main(String[] args) {
        String[][] sarray=new String[][]{{"Rakesh","Lokesh"},{"Raman","Sourav","Vinod"},{"Manan","prakas"}};
        List<String[]> list= Arrays.stream(sarray).filter(i->i.length>2).collect(Collectors.toList());

                for (String[] array1:list){
            System.out.println("After updation result is " +Arrays.toString(array1));
        }
    }
}

package Java8_150Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductList {
    public static void main(String[] args) {
       /* List<Integer> list= Arrays.asList(4,5,7,3,2,6,8,9);
        List<Integer> list1=list.stream().map(i->i*i*i).filter(i->i>50).collect(Collectors.toList());
        System.out.println(list1);*/
        int prod=1;
        int[] a={2,3,4,5,6,7};
        for (int i=0;i<a.length;i++){
            prod=a[i]*a[i]*a[i];
            if (prod>50){
                System.out.println(prod);
            }
            else {
                System.out.println("Element not found");
            }
        }
    }
}

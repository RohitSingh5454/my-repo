package AbhinavSirLabWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class removeduplicate {
    public static void main(String[] args) {
        int[] arry2={1,2,3,4,3,5,6,7,4};
        HashSet<Integer> hs=new HashSet<>();
        List<Integer> list= Arrays.stream(arry2).boxed().filter(i->hs.add(i)).collect(Collectors.toList());
        //System.out.println(list);
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
         while (arry2.length>=0){

         }
        System.out.println(count);
         }



    }


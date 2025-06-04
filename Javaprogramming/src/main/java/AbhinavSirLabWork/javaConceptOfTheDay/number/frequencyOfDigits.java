package AbhinavSirLabWork.javaConceptOfTheDay.number;

import java.util.HashMap;
import java.util.Scanner;

public class frequencyOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<>();
        while (num>0){
            int rem=num%10;
            if (hm.containsKey(rem)){
                hm.put(rem,hm.get(rem)+1);
            }
            else {
                hm.put(rem,1);
            }
            num/=10;
        }
        System.out.println(hm);
    }
}

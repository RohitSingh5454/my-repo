package AbhinavSirLabWork.InterviewCoding.Applore;

import java.util.Arrays;
import java.util.Scanner;

public class SmallNoNotInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] array=new int[num];
        for (int i=0;i<num;i++){
             array[i]=sc.nextInt();
        }
        int minNo=smallestNoNotInArr(array);
        System.out.println(minNo);
        sc.close();
    }
    public static int smallestNoNotInArr(int[] array){
        int min=1;
        Arrays.sort(array);
        for (int i=0;i<array.length;i++){
            if (array[i]==min){
                min++;
            }else if (array[i]>min){
                break;
            }
        }
        return min;
    }
}

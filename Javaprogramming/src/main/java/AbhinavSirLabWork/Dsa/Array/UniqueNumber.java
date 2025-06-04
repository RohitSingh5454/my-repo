package AbhinavSirLabWork.Dsa.Array;

import java.util.Arrays;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] array={7,1,3,3,7,7,8};
        for (int i=0;i<array.length;i++){
            int freq=0;
            for (int j=0;j<array.length;j++){
                if (array[i]==array[j]){
                    freq++;
                }
                if (freq==2){
                    break;
                }
            }
            if (freq==1){
                System.out.print(array[i]+" ");
            }
        }
    }
}

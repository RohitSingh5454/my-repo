package AbhinavSirLabWork.Dsa.Array;

public class MaxNumber {
    public static void main(String[] args) {
        int[] array={-7,-1,-2,-6,-4};
        int max=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Maximum number in array "+max);
    }
}

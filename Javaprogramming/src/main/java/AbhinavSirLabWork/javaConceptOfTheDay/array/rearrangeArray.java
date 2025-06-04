package AbhinavSirLabWork.javaConceptOfTheDay.array;

public class rearrangeArray {
    public static void main(String[] args) {
        int[] arr1={1,0,1,1,1,0,0};
        int[] arr2=new int[arr1.length];
        int firstZero=0;
        int firstOne=0;
        for (int i:arr1){
            if (i==0){
                firstZero++;
            }
            else {
                firstOne++;
            }
        }
        for (int i=0;i<firstZero;i++){
            arr2[i]=0;
        }
        for (int i=firstZero;i< arr2.length;i++){
            arr2[i]=1;
        }
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}

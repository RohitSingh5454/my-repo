package AbhinavSirLabWork.javaConceptOfTheDay.array;

public class leaderElement {
    public static void main(String[] args) {
        int[] arr1={12,54,23,11,17,10};  //op-54 23 17 10
        int max=arr1[arr1.length-1];
        for (int i=arr1.length-2;i>=0;i--){
            if (arr1[i]>max){
                System.out.print(arr1[i]+" ");
                max=arr1[i];
            }
        }
    }
}

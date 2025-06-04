package AbhinavSirLabWork.javaConceptOfTheDay.number;

public class missingNumber {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5,7,8};
         missingNo(array,8);
    }
    public static void missingNo(int[] array,int n){
        int sum=(n*(n+1))/2;
        int actualSum=0;
        for (int i=0;i<array.length;i++){
            actualSum=actualSum+array[i];
        }
        int missingNos=sum-actualSum;
        System.out.println(missingNos);
    }
}

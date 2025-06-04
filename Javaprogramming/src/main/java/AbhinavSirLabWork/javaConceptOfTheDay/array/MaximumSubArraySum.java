package AbhinavSirLabWork.javaConceptOfTheDay.array;

public class MaximumSubArraySum{
    public static void main(String[] args) {
         maxSubArraySum(new int[]{2, 4, 2, 8, 3, 3, 2, -4, 12});
        maxSubArraySum(new int[]{2, 3, -8, 7, -1, 2, 3});
        maxSubArraySum1(new int[]{2, 3, -8, 7, -1, 2, 3});

    }
    // o(n2)
    public static void maxSubArraySum(int[] array){
        int start=0;
        int res=array[0];
        for (int i=0;i<array.length;i++){
           int currSum=0;
            for (int j=i;j<array.length;j++){
                 currSum=currSum+array[j];
                 res=Math.max(res,currSum);
                }
            }
        System.out.println(res);
    }
    //o(n)
    public static void maxSubArraySum1(int[] array){
        int res=array[0];
        int maxEnding=array[0];
        for (int i=0;i<array.length;i++){
            int currSum=array[i];
           maxEnding= Math.max(maxEnding+array[i],array[i]);
           res=Math.max(maxEnding,res);
        }
        System.out.println(res);
    }
}

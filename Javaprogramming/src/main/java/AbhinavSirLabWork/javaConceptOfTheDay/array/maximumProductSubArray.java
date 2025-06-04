package AbhinavSirLabWork.javaConceptOfTheDay.array;

public class maximumProductSubArray {
    public static void main(String[] args) {
        System.out.println(maxProdSubArray(new int[]{1, 3, 10, 2, 60}));
        System.out.println(maxProdSubArray(new int[]{2, 6, 3, 10, 1, 4}));
        System.out.println(maxProductSubArray(new int[]{2, 6, 3, 10, 1, 4}));
    }
    public static int maxProdSubArray(int[] array){
        int res=array[0];
        for (int i=0;i<array.length;i++){
            int maxProd=1;
            for (int j=i;j<array.length;j++){
                maxProd=maxProd*array[j];
               res=Math.max(maxProd,res);
            }
        }
        return res;
    }
    public static int maxProductSubArray(int[] array){
        int currMax=array[0];
        int currMin=array[0];
        int maxProd=array[0];
        for (int i=1;i<array.length;i++){
            int temp=max(array[i],array[i]*currMin,array[i]*currMax);
            currMin=min(array[i],array[i]*currMin,array[i]*currMax);
            currMax=temp;
            maxProd=Math.max(currMax,maxProd);
        }
        return maxProd;
    }
    public static int max(int a,int b,int c){
     return Math.max(a,Math.max(b,c));
    }
    public static int min(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
}

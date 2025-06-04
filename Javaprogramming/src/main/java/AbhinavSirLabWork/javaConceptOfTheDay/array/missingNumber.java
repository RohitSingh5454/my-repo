package AbhinavSirLabWork.javaConceptOfTheDay.array;

public class missingNumber {
    public static void main(String[] args) {
      int[] array=new int[]{1,2,3,5,6,7,8};
      int num=8;
      int sum=num*(num+1)/2;
      int missingNo;
      int sum1=0;
      for (int i=0;i<array.length;i++){
          sum1=sum1+array[i];
      }
      missingNo=sum-sum1;
        System.out.println("Missing number is "+missingNo);
    }
}

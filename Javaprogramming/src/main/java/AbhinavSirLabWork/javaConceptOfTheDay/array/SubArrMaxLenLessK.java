package AbhinavSirLabWork.javaConceptOfTheDay.array;

public class SubArrMaxLenLessK {
    public static void main(String[] args) {
     int[] array= {1, 2, 3, 4, 5};
     int length=subArrayMaximumLengthLessK(array,20);
        System.out.println(length);
    }
    public static int subArrayMaximumLengthLessK(int[] array,int k){
        int sum=0;
        int count=1;
        for (int i=0;i<array.length;i++){
            int temp=array[i];
            for (int j=i+1;j<array.length;j++){
                if (array[j]+temp==k){
                    count++;
                }
                else {
                    temp=array[j]+temp;
                }
            }
        }
        return count;
    }
}

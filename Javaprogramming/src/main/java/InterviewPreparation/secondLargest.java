package InterviewPreparation;

public class secondLargest {
    public static void main(String[] args) {
        int[] array1=new int[]{1,2,3,4,5,5,6,7,7,8};
        for (int i=0;i<array1.length;i++){
            for (int j=i+1;j<array1.length;j++){
                if (array1[i]<array1[j]){
                    int temp=array1[i];
                    array1[i]=array1[j];
                    array1[j]=temp;
                }
            }
        }
        for (int i=0;i<=array1.length-1;i++){
            System.out.println("Second largest is "+array1[i]);
        }
    }
}

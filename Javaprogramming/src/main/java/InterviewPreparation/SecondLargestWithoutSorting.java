package InterviewPreparation;

public class SecondLargestWithoutSorting {
    public static void main(String[] args) {
        int arr1[] ={12,34,23,56,32,76,76,21};
        int largest=arr1[0];
        int second_largest=arr1[1];
        System.out.println(second_largest);
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]>largest){
                second_largest=largest;
                largest=arr1[i];
            } else if (arr1[i]>second_largest && arr1[i]!=largest) {
                second_largest=arr1[i];

            }
        }
        System.out.println("second largest is "+second_largest);
    }
}

package AbhinavSirLabWork.AirIndia;

public class ReverseArray {
    public static void main(String[] args) {
         int[] originaalArray={12,21,423,11,22,42};
         getBackward(originaalArray);
    }
    public static void getBackward(int[] arr){
        int arrayNew[] =new int[arr.length];
        for (int i=0;i< arr.length;i++){
            arrayNew[i]=arr[arr.length-i-1];
        }
        System.out.println("Reversed array");
        for (int i: arrayNew){
            System.out.print(i+ " ");
        }
    }
}

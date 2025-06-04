package AbhinavSirLabWork.SystemClass;

public class Lab693 {
    public static void main(String[] args) {
        int[] arr1=new int[]{23,45,11,22,44};
        int[] arr2=new int[6];
        System.out.println("After copying");
        System.arraycopy(arr1,0,arr2,1,arr1.length);
        for (int a:arr2){
            System.out.println(a);
        }
    }
}

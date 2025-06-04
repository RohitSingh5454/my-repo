package AbhinavSirLabWork.SystemClass;

public class Lab694 {
    public static void main(String[] args) {
        int arr1[]={12,34,56,67,78,89};
        long arr2[] =new long[6];
        System.arraycopy(arr1,0,arr2,0,arr1.length);   // not possible to change from int to long
        for (long a:arr2){
            System.out.println(arr2);
        }
    }
}

package AbhinavSirLabWork.InterviewCoding.sterlite;

public class replaceFisrst3 {
    public static void main(String[] args) {
        int[] a={1,3,5,7,9};
        int[] b={2,4,6,8,10};
        for (int i=0;i<2;i++){
            int temp1=a[i];
            int temp2=b[i];
            a[i+1]=a[i];
            a[i]=a[i+1];
            b[i+1]=b[i];
            b[i]=b[i+1];
        }
        for (int i=0;i<5;i++){
        System.out.print(a[i]+ " ");
    }
        for (int k=0;k<5;k++){
            System.out.print(b[k]+" ");
        }
}}

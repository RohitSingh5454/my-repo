package InterviewPreparation;

public class ArrayRemove{
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,6,7,8,9};
        int del_elem=9;
        for (int i=0;i< a.length;i++){
            if (a[i]==del_elem){
                for (int j=i;j<a.length-1;j++){
                    a[j]=a[j+1];
                }
                break;
            }

        }
        for (int i=0;i<a.length-1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
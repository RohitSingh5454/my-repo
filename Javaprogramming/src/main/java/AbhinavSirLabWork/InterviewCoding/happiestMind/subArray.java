package AbhinavSirLabWork.InterviewCoding.happiestMind;

public class subArray {
    public static void main(String[] args) {
        int[] array1={10,2,3,-5,99,12,0,-1};
         for (int i=0;i<array1.length;i++){
             for (int j=i;j< array1.length;j++){
                 for (int k=i;k<=j;k++){
                     System.out.print(array1[k]+" ");
                 }
                 System.out.println();
             }
             System.out.println();
         }
    }
}

package AbhinavSirLabWork.javaConceptOfTheDay.array;

public class selectionSort {
    public static void main(String[] args) {
        selectionSorting(new int[] {45, 84, 101, 62, 12, 45});
    }
    public static void selectionSorting(int[] array1){
        int temp;
        int pos;
        for (int i=0;i<array1.length-1;i++){
            pos=i;
            for (int j=i+1;j<array1.length;j++){
                if (array1[j]<array1[pos]){
                  pos=j;
                }
            }
            temp=array1[i];
            array1[i]=array1[pos];
            array1[pos]=temp;
        }
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
    }
}

package AbhinavSirLabWork.InterviewCoding.ibm;

public class SelectionSorting {
    public static void main(String[] args) {
     int[] array={64 ,25 ,12 ,22 ,11};
        System.out.println("Arrays before sort");
        printArray(array);
        selectionSort(array);
        System.out.println("Arrays after sort");
        printArray(array);
    }
    public static void selectionSort(int[] array){
        for (int i=0;i<array.length-1;i++){
            int min_index=i;
            for (int j=i+1;j< array.length;j++){
                if (array[j]<array[min_index]){
                    min_index=j;
                }
            }
            int temp=array[i];
            array[i]=array[min_index];
            array[min_index]=temp;
        }
    }
    public static void printArray(int[] array){
        for (int x:array){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}

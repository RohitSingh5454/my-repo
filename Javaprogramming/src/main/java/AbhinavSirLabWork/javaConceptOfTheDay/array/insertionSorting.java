package AbhinavSirLabWork.javaConceptOfTheDay.array;

public class insertionSorting {
    public static void main(String[] args) {
       int[] array= new int[]{1,2,7,3,9,6};
        insertionSorting.insertionSort(array, array.length);
        insertionSorting.printArray(array);
    }
    static void printArray(int[] array){
        int n= array.length;
        for (int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void insertionSort(int[] array,int x){
        for (int i=1;i< x;i++){
            int key=array[i];
            int j=i-1;
            while (j>=0 && array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }

    }
}

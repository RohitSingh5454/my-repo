package AbhinavSirLabWork.javaConceptOfTheDay.array;

public class selectionSorting {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 5, 6, 17, 12, 72, 15};
    }
    public static int[] selectionSort(int[] array){
        int temp;
        for (int i=0;i< array.length;i++){
            int min_indx=i;
            for (int j=i+1;j<array.length;j++){
                if (array[j]<array[min_indx]){
                    min_indx=j;
                }
                temp=array[min_indx];
                array[j]=temp;
            }
        }
        return null;
    }
}

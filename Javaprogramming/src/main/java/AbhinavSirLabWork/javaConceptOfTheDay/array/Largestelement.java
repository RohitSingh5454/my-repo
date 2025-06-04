package AbhinavSirLabWork.javaConceptOfTheDay.array;

public class Largestelement {
    public static void main(String[] args) {
        int[] array1={12,2,3,34,45,56,34};
        int max=Integer.MAX_VALUE;
        for (int i=0;i<array1.length;i++){
            for (int j=i+1;j<array1.length;j++){
                if (array1[i]>array1[j]){
                    max=array1[i];
                }
            }
        }
        System.out.println(max);
    }
}

package AbhinavSirLabWork.javaConceptOfTheDay.array;

public class findPairs {
    public static void main(String[] args) {
        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
        findThePairs(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);
        findThePairs(new int[] {12, 23, 125, 41, -75, 38, 27, 11}, 50);
    }
    public static void findThePairs(int[] array,int x){
        System.out.println("pair of elements whose sum is "+x);
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]+array[j]==x){
                    System.out.println(array[i]+" "+array[j]);
                }
            }
        }
    }
}

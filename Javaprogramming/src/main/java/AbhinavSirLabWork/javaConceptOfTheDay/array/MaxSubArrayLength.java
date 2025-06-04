package AbhinavSirLabWork.javaConceptOfTheDay.array;

public class MaxSubArrayLength {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 5, 5, 5, 2, 2, 1, 1};
        System.out.println(IdenticalSubArrayLength(array));
    }

    public static int IdenticalSubArrayLength(int[] array) {
        int j = 1;
        int e=0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                j = j + 1;
            } else {
                j = 1;
            }
            if (e<j){
                e=j;
            }
        }
        return e;
    }
}

package AbhinavSirLabWork.javaConceptOfTheDay.array;

public class moveZerosEnd {
    public static void main(String[] args) {
        moveZerosToEnd(new int[]{1, 0, 1, 1, 0, 1, 0});
        moveZerosToEnd(new int[] {12, 0, 7, 0, 8, 0, 3});

        moveZerosToEnd(new int[] {1, -5, 0, 0, 8, 0, 1});

        moveZerosToEnd(new int[] {0, 1, 0, 1, -5, 0, 4});

        moveZerosToEnd(new int[] {-4, 1, 0, 0, 2, 21, 4});
    }

    public static void moveZerosToEnd(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[counter] = array[i]; // 1 1 1 1
                counter++;   //

            }
        }
        while (counter < array.length) {  // 3<4
            array[counter] = 0;
            counter++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

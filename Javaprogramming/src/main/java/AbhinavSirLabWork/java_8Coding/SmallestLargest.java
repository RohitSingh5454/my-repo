package AbhinavSirLabWork.java_8Coding;

public class SmallestLargest {
    public static int Largest(int[] largest) {
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        for (int i = 0; i < largest.length; i++) {
            if (max < largest[i]) {
                max = largest[i];
            }
        }
        return max;
    }
    public static int Smallest(int[] smallest){
        int min=Integer.MAX_VALUE;
        System.out.println(min);
        for (int i=0;i< smallest.length;i++){
            if (min>smallest[i]){
                min=smallest[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a={12,34,11,234,54,222,534};
        Largest(a);
        Smallest(a);
       /* System.out.println("Largest is "+Largest(a));
        System.out.println("Smallest is "+Smallest(a));*/
    }
}
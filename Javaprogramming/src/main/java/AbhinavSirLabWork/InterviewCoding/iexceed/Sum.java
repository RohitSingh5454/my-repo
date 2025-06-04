package AbhinavSirLabWork.InterviewCoding.iexceed;

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        long sum= Arrays.stream(a).filter(i->i%2==0).sum();
        System.out.println(sum);
    }
}

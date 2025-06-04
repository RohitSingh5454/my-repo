package AbhinavSirLabWork.Dsa.Pattern;

public class RightAnglePallindromTraingle {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            char ch='A';
            for (int j=0;j<=2*i;j++){
                if (j<i) {
                    System.out.print(ch);
                    ch++;
                } else if (j==i) {
                    System.out.print(ch);
                }
                else {
                   ch--;
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }
}

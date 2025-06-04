package InterviewPreparation.Pattern;

public class StarPattern {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0;i<5;i++){
            for (int j=4;j>=i;j--) {
                if (j == i) {
                    for (int k = 0; k <= i; k++) {
                        System.out.print("*");
                    }
                }
                    System.out.print(" ");
                }

            System.out.println();
//            for (int k=0;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
        }
    }
}

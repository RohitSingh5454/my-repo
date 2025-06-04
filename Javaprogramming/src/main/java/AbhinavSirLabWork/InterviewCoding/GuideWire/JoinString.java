package AbhinavSirLabWork.InterviewCoding.GuideWire;

import java.util.Scanner;

public class JoinString {
    public static String makePossibleCombination(int AA,int BB,int AB){
        int total=AA+AB+BB;
        String str="";
        for (int i=0;i<total;i++){
            if (AA>0) {
                if (!str.endsWith("A")){
                    str = str + "AA";
                    AA--;
                }
            }
            if (BB>0) {
                if (!str.endsWith("B")){
                    str = str + "BB";
                    BB--;
                } else if (!str.substring(0,1).equals("B")) {
                    str="BB"+str;
                    BB--;
                }
            }
            if (AB>0) {
                if (str == "" || !str.substring(str.length()-2) .equals("AA")) {
                    str = str + "AB";
                    AB--;
                } else if (!str.substring(0,2).equals("BB")) {
                    str="AB"+str;
                    AB--;
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int AA=sc.nextInt();
        int BB=sc.nextInt();
        int AB=sc.nextInt();
       String string= makePossibleCombination(AA,BB,AB);
        System.out.println(string);
    }
}
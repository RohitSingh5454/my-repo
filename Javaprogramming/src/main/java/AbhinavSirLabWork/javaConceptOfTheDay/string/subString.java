package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        printAllSubstring(str);
    }
    private static void printAllSubstring(String input){
        StringBuilder sb;
        for (int i=0;i<input.length();i++){
            sb=new StringBuilder().append(input.charAt(i));
            System.out.println(sb);
            for (int j=i+1;j<input.length();j++){
                sb.append(input.charAt(j));
                System.out.println(sb);
            }
        }
    }
}

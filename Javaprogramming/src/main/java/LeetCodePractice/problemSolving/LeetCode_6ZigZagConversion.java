package LeetCodePractice.problemSolving;

import java.util.Scanner;

public class LeetCode_6ZigZagConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(); //PAYPALISHIRING
        int noRows=sc.nextInt();
        String result=zigzagConvert2(str,noRows);
        System.out.println(result);
    }
    public static String zigzagConvert(String str,int noOfRows){
        if (str.isEmpty() || str.isBlank() || noOfRows<=0){
            return "";
        }
        if (noOfRows==1){
            return str;
        }
        StringBuilder sb=new StringBuilder();
        int step=2*noOfRows-2;
        for (int i=0;i<noOfRows;i++){
            for (int j=i;j<str.length();j=j+step){
                sb.append(str.charAt(j));
                if (i!=0 && i!=noOfRows-1 && (j+step-2+i)<str.length()){
                    sb.append(str.charAt(j+step-2*i));
                }
            }
        }
        return sb.toString();
    }
    public static String zigzagConvert1(String str,int noRows){
        String[] newStr=new String[noRows];
        for (int i=0;i<noRows;i++){
            newStr[i]="";
        }
        int i=0;
        while (i<str.length()){
            for (int index=0;index<noRows && i<str.length();index++){
                newStr[index]=newStr[index]+str.charAt(i++);
            }
            for (int index=noRows-2;index>0 &&i<str.length();index--){
                newStr[index]=newStr[index]+str.charAt(i++);
            }
        }
        String res="";
        for (String s:newStr){
            res+=s;
        }
        return res;
    }
    // Best time complexity
    public static String zigzagConvert2(String s,int numRows){
        if (numRows < 2 || s == null || s.length() < numRows) return s;

        int n = s.length();

        int zigLen = (numRows - 1) * 2;
        char[] chars = new char[n];
        int pos = 0;


        for (int row = 0; row < numRows; row++) {
            int i = row;
            while (i < n) {
                chars[pos++] = s.charAt(i);

                if (row != 0 && row != numRows -1) {
                    int second = i + (zigLen - 2 * row);
                    if (second < n) {
                        chars[pos++] = s.charAt(second);
                    }
                }

                i += zigLen;
            }
        }
        return new String(chars);
    }
}

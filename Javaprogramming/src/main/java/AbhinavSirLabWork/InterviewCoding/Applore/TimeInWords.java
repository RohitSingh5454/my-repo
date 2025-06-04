package AbhinavSirLabWork.InterviewCoding.Applore;

import java.util.Scanner;

public class TimeInWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hour=sc.nextInt();
        int minute=sc.nextInt();
        String[] allMinutes={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"
                ,"thirteen","fourteen","quarter","sixteen","seveteen","eighteen","nineteen","twenty","twenty one",
                "twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight",
                "twenty nine","half"};
        String sts=timeWords(allMinutes,hour,minute);
        System.out.println(sts);
    }
    public static String timeWords(String[] strings,int hr,int m){
        if (m<30){
            return strings[m-1]+" minute"+" past "+strings[hr-1];
        } else if (m==15) {
            return strings[m-1] +" past "+strings[hr-1];
        } else if (m==30) {
            return strings[m-1]+" past "+strings[hr-1];
        } else if (m>30) {
            return strings[60-m-1]+" minutes to "+strings[hr];
        } else if (m==0) {
            return strings[hr-1]+" o'"+" clock";
        }
        return null;
    }
}

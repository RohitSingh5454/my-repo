package AbhinavSirLabWork.javaConceptOfTheDay.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FindDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("start date");
        String s1=sc.nextLine();
        System.out.println("end date");
        String s2=sc.nextLine();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy/HH:mm:ss");
        try {
            Date startDate=simpleDateFormat.parse(s1);
            Date endDate=simpleDateFormat.parse(s2);
            long diffInMilliSec=startDate.getTime()-endDate.getTime();
            long seconds = (diffInMilliSec / 1000) % 60;

            long minutes = (diffInMilliSec / (1000 * 60)) % 60;

            long hours = (diffInMilliSec / (1000 * 60 * 60)) % 24;

            long days = (diffInMilliSec / (1000 * 60 * 60 * 24)) % 365;

            long years =  (diffInMilliSec / (1000l * 60 * 60 * 24 * 365));
            System.out.println("Difference is----> ");
            System.out.println(years+" years, "+days+" days, "+hours+" hours, "+minutes+" minutes, "+seconds+" seconds");

        }
        catch (ParseException px){
            px.printStackTrace();
        }
    }
}

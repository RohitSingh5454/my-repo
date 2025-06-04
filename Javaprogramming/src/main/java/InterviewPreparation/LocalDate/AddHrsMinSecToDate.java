package InterviewPreparation.LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class AddHrsMinSecToDate {
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();
       // System.out.println(now);
        LocalDateTime updated=now.plusHours(4);
        //System.out.println(updated);
        updated.plusMinutes(20);
       // System.out.println(updated);
        Date doc=new Date();
        Calendar co=Calendar.getInstance();
        co.setTime(doc);
       // System.out.println(co.getTime());
        co.add(Calendar.HOUR,3);
        System.out.println(co.getTime());
    }
}

package InterviewPreparation.FunctionalInterface;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UpiPayment {
    String doPayment(String source,String test);
    //int save();
    default double get(){
        return new Random().nextDouble();
    }
    static String DatePattern(String patterns){
        SimpleDateFormat SDF=new SimpleDateFormat(patterns);
        return SDF.format(new Date());
    }
}

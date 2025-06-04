package InterviewPreparation.FunctionalInterface;

import javax.lang.model.util.SimpleElementVisitor14;

public  class Paytm implements UpiPayment{
    @Override
    public String doPayment(String source, String test) {
           String str= UpiPayment.DatePattern("YYYY-MM-DD");
        return null;
    }

    @Override
    public double get() {
        return UpiPayment.super.get();
    }
}

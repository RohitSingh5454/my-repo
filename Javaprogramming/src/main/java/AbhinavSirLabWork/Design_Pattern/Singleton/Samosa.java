package AbhinavSirLabWork.Design_Pattern.Singleton;

import java.io.Serializable;

public class Samosa implements Serializable,Cloneable {

    private static Samosa samosa;
    private Samosa(){
       if (samosa!=null){
           throw new RuntimeException("You are trying to break singleton design pattern");
       }
    }
    public static Samosa getSamosa(){
       synchronized (Samosa.class) {
           if (samosa == null) {
               samosa = new Samosa();
           }
       }
        return samosa;
    }
    public Object readResolve(){
        return samosa;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

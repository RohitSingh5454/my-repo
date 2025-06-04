package AbhinavSirLabWork.ThisKeyword;

import java.lang.annotation.Annotation;

@FunctionalInterface
public interface Fuctional {
    public void run();
}
class Ctp implements Fuctional{
    public static void main(String[] args) {
       Ctp obj1=new Ctp();
       obj1.run();

    }

    @Override
    public void run() {
        System.out.println("Hey java");

    }
}


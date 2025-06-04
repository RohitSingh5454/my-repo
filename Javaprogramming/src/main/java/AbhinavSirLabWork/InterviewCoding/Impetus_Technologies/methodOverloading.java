package AbhinavSirLabWork.InterviewCoding.Impetus_Technologies;

import AbhinavSirLabWork.Design_Pattern.Hello;

public class methodOverloading {
    public  void call(String str) {
        System.out.println("Hello String");
    }

    public  void call(StringBuffer sb) {
        System.out.println("Hello Object");
    }

        public static void main(String[] args) {
            methodOverloading ob = new methodOverloading();
            ob.call("Hello");
        }
    }


package StringClass;

public class Lab651 {
    public static void main(String[] args) {
        String str1="My name is rohit";
        char ch[]=str1.toCharArray();
        char ch1[]=new char[10];
        byte by1[]=new byte[12];
        ch1[0]='r';
        ch1[1]='o';
        ch1[2]='h';
        by1[0]='i';
        by1[1]='t';
        by1[2]='s';
          str1.getChars(3,7,ch1,4);
        for (int i=0;i<ch1.length;i++){
            char chi=ch1[i];
            System.out.println(chi);
        }
        System.out.println("----------------------");
        for (int j=0;j<by1.length;j++){
             byte byi=by1[j];
            System.out.println(byi);
        }

    }
}

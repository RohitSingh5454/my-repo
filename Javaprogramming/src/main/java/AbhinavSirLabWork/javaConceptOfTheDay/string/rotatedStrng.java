package AbhinavSirLabWork.javaConceptOfTheDay.string;

public class rotatedStrng {
    public static void main(String[] args) {
        String str="Hello";
        String str1="olleH";
        if (str.length()!=str1.length()){
            System.out.println("this is not rotated string");
        }
        else {
            String str3=str+str1;
            if (str3.contains(str1)){
                System.out.println("str is rotated version of str1");
            }
            else {
                System.out.println("str is not rotated version of str1");
            }
        }
    }
}

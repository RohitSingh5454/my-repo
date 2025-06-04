package AbhinavSirLabWork.javaConceptOfTheDay.string;

public class RevStringSpacePreserve {
    public static void main(String[] args) {
        System.out.println(reverseString("I Am Not String"));

        System.out.println(reverseString("JAVA JSP ANDROID"));

        System.out.println(reverseString("1 22 333 4444 55555"));
    }
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int p= chars.length-1;
        int i = 0;

        while(i < p) {
            if(chars[i] == ' ')
                i++;
            if(chars[p] == ' ')
               p--;

            char tmp = chars[i]; // swap (i, p)
            chars[i] = chars[p];
            chars[p] = tmp;

            i++;
            p--;
        }

        return new String(chars);
    }
}

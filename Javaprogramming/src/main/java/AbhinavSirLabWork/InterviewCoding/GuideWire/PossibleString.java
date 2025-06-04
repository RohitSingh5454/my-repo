package AbhinavSirLabWork.InterviewCoding.GuideWire;

public class PossibleString {
    public static void main(String[] args) {
      String str= makePossibleString(5,0,2);
        System.out.println(str);
    }
    public static String makePossibleString(int AA,int AB,int BB) {
        StringBuilder sb = new StringBuilder();
        int length = sb.length();
        while (AA > 0 || BB > 0 || AB>0) {
            boolean lastA = length > 0 && sb.charAt(length - 1) == 'A';
            boolean lastAA = length > 0 && sb.substring(length - 2) == "AA";
            boolean lastB = length > 0 && sb.charAt(length - 1) == 'B';
            boolean lastBB = length > 0 && sb.substring(length - 2) == "BB";
            if ((AA>0&& !lastAA )|| lastBB) {
                if (AA > 0) {
                    sb.append("AA");
                    AA--;
                }
                else if (AB>0){
                    sb.append("AB");
                    AB--;
                }
            }
            else {
                if (BB>0){
                    sb.append("BB");
                    BB--;
                } else if (AB>0){
                    sb.append("BA");
                    AB--;
                }
            }
        }
        return sb.toString();
    }
}

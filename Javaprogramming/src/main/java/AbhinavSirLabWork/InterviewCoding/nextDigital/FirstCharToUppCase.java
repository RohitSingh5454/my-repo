package AbhinavSirLabWork.InterviewCoding.nextDigital;

public class FirstCharToUppCase {
    public static void main(String[] args) {
        String str = "java is programming language";
        boolean capitalize=true;
        StringBuilder sb=new StringBuilder();
        int i=0;

        while (str.length()>i){
//            if (i==0){
//               sb.append(str.toUpperCase().charAt(i));
//            }
            char ch=str.charAt(i);
            if (capitalize && Character.isLetter(ch)){
                sb.append(Character.toUpperCase(ch));
                capitalize=false;
            }
            else {
                sb.append(ch);
            }
            if (ch==' '){
                capitalize=true;
            }
//            else if (str.charAt(i)==' '){
//                sb.append(str.toUpperCase().charAt(i+1));
//            }
//            else {
//                if (i==1) {
//                    sb.append(str.charAt(i));
//                }
//                else {
//                    sb.append(str.charAt(i+1));
//                }
//            }
            i++;
        }
        System.out.println(sb.toString());
    }
}

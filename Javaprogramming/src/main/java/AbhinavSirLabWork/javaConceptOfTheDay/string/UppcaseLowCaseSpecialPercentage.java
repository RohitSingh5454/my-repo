package AbhinavSirLabWork.javaConceptOfTheDay.string;

public class UppcaseLowCaseSpecialPercentage {
    public static void main(String[] args) {
        String str="Tiger Runs @ The Speed Of 100 km/hour";
        int totalChars=str.length();
        int upperCase=0;
        int lowerCase=0;
        int digit=0;
        int specialChar=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (Character.isUpperCase(ch)){
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            } else if (Character.isDigit(ch)) {
                digit++;
            }
            else {
                specialChar++;
            }
        }
        System.out.println("percentage of upper case is "+upperCase*100/totalChars);
        System.out.println("percentage of lower case is "+lowerCase*100/totalChars);
        System.out.println("percentage of digit is "+digit*100/totalChars);
        System.out.println("percentage of special char is "+specialChar*100/totalChars);
        calculatePercentage("AUS : 123/3, 21.2 Overs");
    }
    public static void calculatePercentage(String str){
        int totalChars=str.length();
        int upperCase=0;
        int lowerCase=0;
        int digit=0;
        int specialChar=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (Character.isUpperCase(ch)){
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            } else if (Character.isDigit(ch)) {
                digit++;
            }
            else {
                specialChar++;
            }
        }
        System.out.println("percentage of upper case is "+upperCase*100/totalChars);
        System.out.println("percentage of lower case is "+lowerCase*100/totalChars);
        System.out.println("percentage of digit is "+digit*100/totalChars);
        System.out.println("percentage of special char is "+specialChar*100/totalChars);
    }
}

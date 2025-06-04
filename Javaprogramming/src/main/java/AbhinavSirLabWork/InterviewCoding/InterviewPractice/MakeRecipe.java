package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

public class MakeRecipe {
    public static void main(String[] args) {
        String[] strings={"toast","bread","breada","cheese","curd"};
        String str="abcdeeehrsu";
       int totalDish= recipeCanBeMade(strings,str);
        System.out.println(totalDish);
    }
    public static int recipeCanBeMade(String[] dishes,String recipe){
        int count=0;
        for (String dish:dishes){
            if (canPrepare(recipe,dish)){
                count++;
            }
        }
        return count;
    }
    public static boolean canPrepare(String dish,String recipe){
       for (char ch:recipe.toCharArray()){
            if (dish.indexOf(ch)==-1){
                return false;
            }
            dish=dish.replaceFirst(String.valueOf(ch),"");
        }
        return true;
    }
}

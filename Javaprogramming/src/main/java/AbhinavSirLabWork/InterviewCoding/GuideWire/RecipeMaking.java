package AbhinavSirLabWork.InterviewCoding.GuideWire;

public class RecipeMaking {
    public static void main(String[] args) {
        RecipeMaking ob=new RecipeMaking();
        String[] strings={"toast","bread","breada","cheese"};
        String str="abcdeeehrs";
        int totalDish= ob.totalDishCanBeMade(strings,str);
        System.out.println(totalDish);
    }
    public int totalDishCanBeMade(String[] dishes,String recipe){
        int count=0;
        for (String dish:dishes){
            if (canPrepare(dish,recipe)){
                count++;
            }
        }
        return count;
    }
    public boolean canPrepare(String recipe,String dish){
        for (char ch:recipe.toCharArray()){
            if (dish.indexOf(ch)==-1){
                return false;
            }
            dish=dish.replaceFirst(String.valueOf(ch),"");
        }
        return true;
    }
}

package AbhinavSirLabWork.InterviewCoding.Mitl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class mapTheVariable {
    public static void main(String[] args) {
        List<abc> list= Arrays.asList(new abc(1,"Manohar"),new abc(2,"chikanglur"));
       Map<Integer,String> mapTheVariable=list.stream().collect(Collectors.toMap(abc::getId,abc::getName));
        System.out.println(mapTheVariable);
    }
}
class abc {

    int id;
    String name;

    public abc(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

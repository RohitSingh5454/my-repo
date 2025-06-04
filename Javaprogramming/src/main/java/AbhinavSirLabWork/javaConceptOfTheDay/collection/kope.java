package AbhinavSirLabWork.javaConceptOfTheDay.collection;

import AbhinavSirLabWork.Constructor.Xyz;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class kope {
    public static void main(String[] args) {

        List<xyz> list1=List.of(new xyz(1,"manoj"),new xyz(2,"bhanu"));
      Map<Integer,String> mapData= list1.stream().collect(Collectors.toMap(xyz::getId,xyz::getName));
        System.out.println(mapData);

    }
}
class xyz{
    int id;
    String name;
    xyz(int id,String name){
        this.id=id;
        this.name=name;

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

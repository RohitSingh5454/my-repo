package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class mapTheVariable {
    public static void main(String[] args) {
        List<abc> newList=new ArrayList<>();
        newList.add(new abc(2,"Manksh"));
        newList.add(new abc(5,"nilesh"));
        Map<Integer,String> mapDataMember=newList.stream().collect(Collectors.toMap(abc::getId,abc::getName));
        System.out.println(mapDataMember);
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


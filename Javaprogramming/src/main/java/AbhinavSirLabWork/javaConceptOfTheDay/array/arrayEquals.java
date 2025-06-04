package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.Arrays;

public class arrayEquals {
    public static void main(String[] args) {
        String[] array1={"java","jdbc","Hibernate","Servlet","microservices"};
        String[] array2={"java","jdbc","Hibernate","Servlet","microservices"};
        String[][] array3={{"java","jdbc","Hibernate","Servlet","microservices"},{"java","jdbc","Hibernate","Servlet","microservices"}};
        String[][] array4={{"java","jdbc","Hibernate","Servlet","microservices"},{"java","jdbc","Hibernate","Servlet","microservices"}};
        System.out.println(Arrays.equals(array1,array2));
        System.out.println(Arrays.deepEquals(array3,array4));
        System.out.println(Arrays.equals(array3,array4));
    }
}

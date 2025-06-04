package AbhinavSirLabWork.Design_Pattern.Builder;

public class MainClass {
    public static void main(String[] args) {
        User user1=new User.UserBuilder().setUserId("1").
                setUserName("Rohitkumar").
                setEmailId("rohitkumar@gmail.com").build();
        User user2=new User.UserBuilder().setUserId("2").
                setUserName("Ankitkumar").
                setEmailId("ankitkumar@gmail.com").build();
        User user3=new User.UserBuilder().setUserId("3").
                setUserName("Shivamkumar").
                setEmailId("Shivamkumar@gmail.com").build();
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}

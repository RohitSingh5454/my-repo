package AbhinavSirLabWork.Oops.encapsulation;

public class Encapsulate {
    private String geekName;
    private int geekRoll;
    private int geekAge;
    private String geekName1;

    public int getRoll() {
        return geekRoll;
    }

    public int getAge() {
        return geekAge;
    }

    public String getName() {
        return geekName;
    }
    public void setName(String newName) {
        geekName = newName;
    }

    public void setRoll(int newRoll) {
        geekRoll = newRoll;
    }

    public void setAge(int newAge) {
        geekAge = newAge;
    }
}

package AbhinavSirLabWork.Enum;

public class lab894 {
    public static void main(String[] args) {
        Direction d1=null;
        d1=Direction.South;
        System.out.println(d1);
        System.out.println(Direction.North);
        System.out.println(Direction.East);
        System.out.println(Direction.West);
    }
}
enum Direction{

    East,North,West,South;
    Direction(){
        System.out.println("Direction def constructor");
    }
    static {
        System.out.println("static block in direction class");
    }
}
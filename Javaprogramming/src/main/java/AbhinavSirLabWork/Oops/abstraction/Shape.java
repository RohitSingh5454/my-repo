package AbhinavSirLabWork.Oops.abstraction;

public abstract class Shape {
    String color;
    abstract double area();
    public abstract String toString();
    public Shape(String color){
        System.out.println("shape class constructor called");
        this.color=color;
    }
    public String getColor(){
        return color;
    }

}
class Circle extends Shape{
    double radius;
    Circle(String color,double radius){
        super(color);
        System.out.println("Circle constructor called");
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle color is "+super.getColor()+" area "+area();
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;
    public Rectangle(String color,double length,double breadth){
        super(color);
        System.out.println("Rectangle class constructor called");
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    double area() {
        return length*breadth;
    }

    @Override
    public String toString() {
        return "Rectangle color is "+super.getColor()+" area "+area();
    }
}
class Test{
    public static void main(String[] args) {
        Shape ob1=new Circle("Red",2);
        Shape ob2=new Rectangle("Blue",3,5);
        //ob1.area();
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
    }
}

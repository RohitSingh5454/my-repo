package AbhinavSirLabWork.Packages.Package1.Pac2Imp;

import AbhinavSirLabWork.Packages.Package1.PackageImplement.B;

public class Lab489 {
    public static void main(String[] args) {
        Box b1=new Box();
        b1.Show();
    }
}
class Box{
    private int b=34;
    void Show(){
        System.out.println(b);
    }
}
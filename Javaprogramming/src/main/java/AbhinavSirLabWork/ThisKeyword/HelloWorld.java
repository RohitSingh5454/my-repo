package AbhinavSirLabWork.ThisKeyword;

public class HelloWorld {
    void Show(){
        HelloWorld h1=this;
        //Sop h2=this;  ----Error

    }
}
class Sop{
    void Get(){
        Sop s1=this;
        //HelloWorld h2=this; ---- Error
    }
}

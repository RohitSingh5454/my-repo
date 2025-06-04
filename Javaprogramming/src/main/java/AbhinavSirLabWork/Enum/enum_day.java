package AbhinavSirLabWork.Enum;

 enum enum_day {
     Monday,
     Tuesday,
     Wednesday,
     Thursday,
     Friday,
     Saturday,
     Sunday;
}
class Xyz{
     enum_day enumDay;
     Xyz(enum_day enumDay){
         this.enumDay=enumDay;
     }
     public void get(){
         switch (enumDay){
             case Monday :
                 System.out.println("Monday is boring day");
                 break;
             case Friday:
                 System.out.println("Friday is a joyful day");
                 break;
             case Saturday:
             case Sunday:
                 System.out.println("These two days are weekend");
                 break;
             default:
             System.out.println("Mondays are so bad");
             break;
         }
     }

    public static void main(String[] args) {
         String str="Monday";
         String string="Friday";
        Xyz ob1=new Xyz(enum_day.valueOf(str));
        ob1.get();
        Xyz ob2=new Xyz(enum_day.Friday);
        ob2.get();
    }
}


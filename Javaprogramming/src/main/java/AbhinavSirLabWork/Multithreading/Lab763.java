package AbhinavSirLabWork.Multithreading;

public class Lab763 {
    public static void main(String[] args) {
        BankAccount obj=new BankAccount();
        AccountThread obj1=new AccountThread(obj);

    }
}
class BankAccount{
    private int bal=800;
    public void Deposit(int amount){
        bal=bal+amount;
    }
    public synchronized void Withdraw(int amount){
        if (bal>amount){
            bal=bal-amount;
            System.out.println(bal +"after withdraw "+Thread.currentThread().getName());
        }
    }
    public int getBal(){
        return bal;
    }

}
class AccountThread implements Runnable{
    BankAccount rohit=null;
    AccountThread(BankAccount a){
        this.rohit=a;
        Thread t1=new Thread(this,"r1");
        Thread t2=new Thread(this,"r2");
        t1.start(); t2.start();
    }

    @Override
    public void run() {
         for (int i=0;i<5;i++){
             rohit.Withdraw(100);
             if (rohit.getBal()<0){
                 System.out.println("no amount");
             }
         }
    }
}
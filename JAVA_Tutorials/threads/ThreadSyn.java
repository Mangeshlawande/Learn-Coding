
import java.util.*;


class Account {
    int bal;
    Account(int b) {
        bal = b;
    }
 boolean isSufficientBal(int withdraw) {
        if (bal>=withdraw){
            return true;
        }
        else{
            return false;
        }   
    }
    void Withdraw(int amt, String g1)
    {
        bal = bal - amt;
       System.out.println("Transaction Successful !!");
       System.out.println(g1+" Current Balance is "+bal);
    }
};

class Customer implements Runnable
{
    String h1;
Account x1; // A general object .
Customer(Account j1, String m1)
{   
     x1 = j1;
     h1 = m1;
 }
public void run()
{
    Scanner s1 = new Scanner(System.in);
   synchronized(x1)
   {
    System.out.println("Enter Amount to withdraw for "+h1+" :");
    int amt = s1.nextInt();
    if(x1.isSufficientBal(amt))
    {
        x1.Withdraw(amt,h1);
    }
    else
    {
        System.out.println("Insufficient Balance ");
    }
   }

}

}
public class ThreadSyn {
    public static void main(String []args) {
        Account a1 = new Account(5000);
        Customer c1 = new Customer(a1,"Harry");
        Customer c2 = new Customer(a1, "Hitesh");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
    
}

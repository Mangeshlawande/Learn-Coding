import java.util.*;
class Account
{

    int balance;
    Account (int b) 
    {
        balance = b;

    }
     public boolean isSufficientBal(int withdraw)
    {
        if (balance>= withdraw)
        {
            return true;
        }
        else{
            return false;
        }
    }
     public void withdraw(int withdraw)
     {
        balance = balance - withdraw;
        System.out.println("WithDraw Successful !!");
        System.out.println("Current Balance is : " + balance);
     }

}

class Customer implements Runnable

{
    Account q;
    String r;
 Customer (Account q1, String w1)
 {
        q = q1;
        r = w1;
 }
 public void run()
 {
     synchronized(q)
     {
        Scanner s1 = new Scanner(System.in);// System.in for keyboard
        System.out.println(r+" Enter Amount for Withdrawal: ");
        int  amt = s1.nextInt();

        if(q.isSufficientBal(amt))
        {
            System.out.println(r+" ");
            q.withdraw(amt);
        }
        else
        {
            System.out.println("Insufficient Balance !!");
        }

    }
 }

}

public class MultiT3 
{
    public static void main (String [] args)
    {
        System.out.println("MultiThreading ");
        Account a1 = new Account(10000);
        Customer c1 = new Customer(a1, "Dakshak");
        Customer c2 = new Customer(a1, "kalia");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}

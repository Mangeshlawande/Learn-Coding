// package threads;


class Process1 extends Thread 
{
    public void run()
    {
        int i;
        for(i = 1; i<=10; i++){
            System.out.println("Process1 : "+i);
        }
    }

}
class Process2 extends Thread //Class 
{
    
    public void run()
    {
        int i;
        for(i = 1; i<=10; i++){
            System.out.println("Process2 : "+i);
        }
    }
}
/*
  class Thread 
 {
  Thread (Runnable r1)
  {
  runnable type ka object nahi banta
  Interface ka object nahi banta reference var banta hai
  }
 }
 
 */

 public class ThreadC {
    public static void main(String []args)
    {
        System.out.println("MultiThreading Using Classes ");
        //creating an object
        Process1 p1 = new Process1();
        Process2 p2 = new Process2();
        p1.start();
        p2.start();// make thread object indirectly
    }
}
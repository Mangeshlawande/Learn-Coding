// // package threads;
// // runnable is an interface 


// class Process1 implements Runnable
// {
//     public void run()
//     {
//     for(int i = 1; i<=10; i++)
//     {
//         System.out.println("Processor1:"+i);   
//     }
//     }

// }

// class Process2 implements Runnable

// {

//     public void run()
//     {
//         for(int i = 1; i<=10; i++){
//             System.out.println("Processor2: "+i);   
//         }
//     }
// }

// // interface ka obj nahi pr reference var banta hai 
// public class MultiT {
//     public static  void main(String []args)
//     {
//         Process1 p1 = new Process1();
//         Process2 p2 = new Process2();
//         // use thread for connection 

//         // Thread t1 = new Thread(Runnable r1);// runable type ka data pass karna padega iska object banta hi nahi
//         Thread t1 = new Thread(p1);// runable type ka data pass karna padega iska object banta hi nahi

//         Thread t2 = new Thread(p2);

//     }
// }


class Process1 implements Runnable
{
    public void run()
    {
        int i;
        for(i = 1; i<=10; i++){
            System.out.println("Process1 : "+i);
        }
    }

}
class Process2 implements Runnable//Interface
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
class MultiT
{
    public static void main(String []args)
    {
        System.out.println("MultiThreading with Interface ");
        //creating an object
        Process1 p1 = new Process1();
        Process2 p2 = new Process2();
// Thread object
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        //thread name ki class ke pass start name ka func hota hai
        t1.start();
        t2.start();
    }
}
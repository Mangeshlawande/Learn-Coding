//  rules in java :
//  in java , there is no private and protected class is there (java main private and protected class nahi hoti)
// only one class is public in one java file , mostly the main class is a public class
//class ke under class banai ja sakti hai, aur use private and protected banaya ja sakta hai;

class Nokia
{
    //  4 members in class;
    private int mic;
    private int cam;
    void SetValue()
    {
// main function ko jvm call karta hai ; ClassesAndObjects.main()=> file_name.main()
    mic = 2;
    cam = 40;
    }
    void display()
    {
         System.out.println(mic);
          System.out.println(cam);
    }

}
class ClassesAndObjects
{
    // inner class can make it as private or protected 

    public static void main (String[]args)
    {
        Nokia n1 = new Nokia();// make an object 
        // n1 call setValue() function
         n1.display();
         n1.SetValue();
         n1.display();

    }
}

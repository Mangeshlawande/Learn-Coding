// import java.io.*;
// import java.io.IOException;
import java.util.*;// all Collection is in util package 
class Collection1 
{
    public static void main (String []args) 
    {
        ArrayList l1 = new ArrayList(5);
        l1.add("A");
        l1.add("B");
        l1.add("D");
        l1.add("E");// Collection Fun();
        l1.add(2,"E");// ArrayList fun ()
        // System.out.println(l1);
        
        Iterator g1 = l1.iterator();
        while (g1.hasNext()) // iterator fun()
        {
            System.out.println(g1.next());  
            String s1 = (String)g1.next();
            if(s1!="G")
            {
                System.out.println(s1);
            }
        }
    }
}
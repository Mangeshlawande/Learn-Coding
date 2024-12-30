import java.util.*;//  import interface

/*
 * public interface Enumeration
 * {
 *  boolean hasMoreElements();
 
 * E(any type of data) nextElement();
 
 
 * }
 */


/*Iterator is available for all collection implemented classes 
all collection implemented classes provided a method called iterator

interface Iterator 
{

public boolean hasNext();
public object next();
public void remove();

}

Iterator and Enumeration both can move single direction only;
only read and remove operation available 
not able to add new object 
not able to  replace any element


 */
/*
 * List Iterator =>
 *  it is a child interface of iterator;
 * it is bidirectional cursor
 * all list implemented classes provide a method called list iterator
 * 
 * public iterator listIterator
 * {
 * boolean hasNext();
 * E(Object) next();
 *void remove();
 * boolean hasPrevious();
 * boolean previous();
 * void add(E e);
 * void set(E e);
 * int nextIndex();
 * int previousIndex();
 * 
 * }
 */


// all class ie, arraylist(), LinkedList etc have one commmon function which is iterator 
//with help of that we can give all info to another variable , it can able to move forword

//Enumeration is only work for stack and vector 
class Cursors
{

    public static void main(String []args) 
    { // stroe any type of data 
        Vector v1 = new Vector();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("D");
        v1.add("E");
        ListIterator l1 = v1.listIterator();

        while(l1.hasNext())
        {
            String s1 = (String)l1.next();
            System.out.println(l1.next());
            if(s1=="A")
            {
                l1.set("C++ Programming"); 
            }
            else if(s1.equals("B"))
            {
                    l1.set("Mango");
            }
            else if(s1.equals("C"))
            {
                    l1.add("Mango");
            }
            else if(s1.equals("D"))
            {
                    l1.remove();
            }
            else{
                l1.set("CORE Java !!");
            }
        }
        ListIterator l2 = v1.listIterator();


        while(l1.hasNext())
        {
            System.out.println(l1.next());
        }
        // while(l1.hasPrevious())
        // {
        //     System.out.println(l1.previous());
        // }




        /* Iterator k1 = v1.iterator();
        while(k1.hasNext())
        {
            // System.out.println(k1.next());
            String s1 = (String)k1.next();
            if (s1=="D"|| s1=="A")
            {
                k1.remove();
            }
            else{
                System.out.println(s1);
            }
        }
            */

        

        // for  vector and stack work only Enumeration 
        /*Enumeration k1 = v1.elements(); // element() Enumerator type ka data pass karta hai 
        while(k1.hasMoreElements())
        {
            System.out.println(k1.nextElement());
        }
            */
    }

}
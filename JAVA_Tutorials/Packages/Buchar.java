package Package2;
import Package1.*;

// classs needs to be public and main fun in it
// cmd to compile the file: javac -d . Buchar.java
// cmd to run program:java Package2.Buchar
public class Buchar {
    public static void main( String args[])
    {
        William b1 = new William();
        b1.setData(5, 8);
        b1.display();
    }
    
}

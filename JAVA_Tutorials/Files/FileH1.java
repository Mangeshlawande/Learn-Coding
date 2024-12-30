import java.io.*;

public class FileH1 
{
    public static void main (String []args) throws IOException
    {
     File f1 = new File("a.txt");//it store only information/metadata
     System.out.println(f1.exists());
     System.out.println(f1.canWrite());
     System.out.println(f1.length());
     
          f1.createNewFile();// compile time Exception

     System.out.println(f1.exists());
     System.out.println(f1.canWrite());
     System.out.println(f1.length());
    }
}


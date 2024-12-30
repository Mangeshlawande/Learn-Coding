import java.io.*;


public class FileH2 
{
    public static void main (String []args) throws IOException
    {   
        String s1 = "Welcome TO Programming ";
        // convert the string into character array
        // File h1 = new File("a.txt");
        FileOutputStream f1 = new FileOutputStream("a.txt",true);
        // FileOutputStream f1 = new FileOutputStream("a.txt");//erase prev data

        char []c1 = s1.toCharArray();
        for(int i =0; i<c1.length; i++)
        {
            f1.write(c1[i]);
        }
        // f1.write('c');
        f1.close();
    }
}

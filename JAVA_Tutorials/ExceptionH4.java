import java.io.*;
// import java.sql.SQLException;

public class ExceptionH4 
{
    // public static void main(String []args) throws IOException, ClassNotFoundException, SQLException
    // throws keyword compiler ko handle karne ke liye bolta hai 
    //try-catch-finally is used when programmer handle the error ;
    // Unreported Exception :- when nothing handle the error 
    public static void main(String []args) 
// if you use try catch finally then you cannot handle checked exception 
    {
        System.out.println("A");
        try
        {
            throw new IOException("Printer Not Found !!");
            // throws ke niche ka statement unreachable hota hai;
            // System.out.println("B");
        }
        catch(IOException e1)
        {
            System.out.println(e1.getMessage());
        }
    }
}/**
What is the difference between throw and throws keyword in java ?
 throws used in checked Exception 
 throw used in unchecked exception 

 kisi exception class ka object throw karne main throw kw ka use karta hai;
 exception report karne ke liye throws kw use kiyajata hai ;





*/

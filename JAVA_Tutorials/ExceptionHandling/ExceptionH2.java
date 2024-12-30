public class ExceptionH2 {
    public static void main (String []args)
    {
        System.out.println("Exception Handling 2 ");
        String s1 = null;
        System.out.println(5/0);
        
        try 
        {
            System.out.println("ArrayIndexOutOfBound");
            System.out.println(5/0);
            System.out.println(s1.length());
            
        }
        catch(ArrayIndexOutOfBoundsException e1)
        // catch(Exception e1)
        {
            System.out.println(e1.getMessage());
        }

        catch(NullPointerException e2)
        {
            System.out.println(e2.getMessage());
        }
        finally
        {
            System.out.println("Program Terminated Successfully !!");
        }
    }
}

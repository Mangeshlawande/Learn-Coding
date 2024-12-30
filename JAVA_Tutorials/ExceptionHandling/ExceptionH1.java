

class ExceptionH1 {
    public static void main(String []args)
    {
        // for 1 try we can use multiple catch()
        String s1;
        s1 = null;// null pointer exception 
        try {
            // System.out.println(5/0);//Arithematic exception
            System.out.println(s1.length());
            
        }
        catch(NullPointerException n1)
        {    
            System.out.println(n1.getMessage());
        }   
        try {
            
            System.out.println(5/0);//Arithematic exception
        }
        catch(ArithmeticException e1)
        {
            System.out.println(e1.getMessage());
        }
        System.out .println("Exception Handling ");
       System.out.println("A");
       System.out.println("B");
        
    }
}

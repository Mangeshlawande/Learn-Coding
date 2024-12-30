class Wrap
{
    //primitive = pre-defined, nonprimitive = user-defined ; 
    // we used wrapper class for conerting primitiveto non primitive or non primitive to primitive datatypes

    public static void main(String[]args)
    {
        int x = Integer.parseInt("123");
    //    Integer x1 =  Integer.valueOf("10110", 2);
        Double x1 =  Double.valueOf("56");// it can't take 2 arguments; 
        
        //
        // Integer i1 = Integer.valueOf("1000011",8);//octal
        Integer i1 = Integer.valueOf("1000011",2);
        int z = i1.intValue();
        System.out.println(z);



    //    int  y = x1.intValue();
     double  y = x1.doubleValue();
       System.out.println(x);
       System.out.println(y);
    
    
    }
}
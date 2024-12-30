class CLA
{
    public static void main(String[]args)
    {
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println(args[2]);
        // System.out.println(args[3]);

        int i=0,s=0;
        for(i=0; i<args.length; i++)
        {
           s= s + Integer.parseInt(args[i]);
            //  it can print int type data ;
        }
            System.out.println("average is " + s/args.length);
    }
}
//  stored data in string format 


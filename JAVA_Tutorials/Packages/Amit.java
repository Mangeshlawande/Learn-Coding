
// cmd : javac -d . Amit.java ==> creating a class file
// - d for current directory 

// to run the file cmd : java.flderName/PackageName.FileName  
// package Package1  // to make a folder  its compulsary;

public class Amit
{
    // can make only one public class 
    // public kia to file ka name and class ka name ek hona chaiye;
    // instance member variable 
    private int x ; // mention each var seperately
    private int y ;
     public void setData( int p , int q )// instance member function 
    {
        x = p;
        y = q;

    }// . in cmd represent current dir , (..) represent root dir 
    // for making package in current directory ( javac -d . Amit.java);
     public void display()
    {
    System.out.println(x);
    System.out.println(y);

    }
}
// javac -d . CLA.java
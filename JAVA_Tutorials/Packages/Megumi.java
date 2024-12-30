package Packages;
import Package1.*;

// cmd : javac -d . Amit.java ==> creating a class file
// - d for current directory 

// to run the file cmd : java.flderName/PackageName.FileName  
// package Package1;// to make a folder  its compulsary;

class Megumi
{
public static void main(String[]args){
System.out.println("package folder directory");
Amit a1= new Amit();
a1.setData(5,6);
a1.display();
}
}
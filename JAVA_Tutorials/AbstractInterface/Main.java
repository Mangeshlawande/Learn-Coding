
/**
 * Java Program to show that you can overload main method in Java
 * but you cannot override main method.
 * 
 * @author Javin Paul
 */
public class Main {

    /**
     * Standard main method, JVM will only call this method
     * even if you provided multiple overloaded version.
     * 
     */
    public static void main(String[] args) {
        System.out.println("Inside main(String[] args) method ....");
       
    }
    
    /**
     * An overloaded main method which accepts Integer[] instead of
     * String[] as argument. 
     * @param args
     */
    public static void main(Integer[] args){
        System.out.println("Inside main(Integer[] args) method ....");
    }
    
    
    /**
     * Another overloaded main method which accepts Double[] instead of
     * String[] as argument. 
     * @param args
     */
    public static void main(Double[] args){
        System.out.println("Inside main(Double[] args) method ....");
    }

}

// Output
// Inside main(String[] args) method ....

















// // Java program to demonstrate
// // method overriding in java

// // Base Class
// class Parent {
// 	void show() { System.out.println("Parent's show()"); }
// }

// // Inherited class
// class Child extends Parent {
// 	// This method overrides show() of Parent
// 	@Override void show()
// 	{
// 		System.out.println("Child's show()");
// 	}
// }

// // Driver class
// class Main {
//     public static void main(int x)
//     {
//         System.out.println("Main function Overriding in java ");
//         System.out.println(x);
//     }
    
// 	public static void main(String[] args)
// 	{
// 		// If a Parent type reference refers
// 		// to a Parent object, then Parent's
// 		// show is called
// 		Parent obj1 = new Parent();
// 		obj1.show();

// 		// If a Parent type reference refers
// 		// to a Child object Child's show()
// 		// is called. This is called RUN TIME
// 		// POLYMORPHISM.
// 		Parent obj2 = new Child();
// 		obj2.show();
// 	}
// }

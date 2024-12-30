


import javax.swing.*;
import java.awt.event.*;// To fetch ActionListener Name ka  Interface 
import java.awt.*;

public class LoginS extends JFrame
{
    JLabel l1, l2,l3,l4,l0; //creating a reference variable
    JTextField t1,t2;
    JButton b1,b2,b3,b4;


    
    
    LoginS(String s1)
    {
        super(s1);
    }
    LoginS()
    {

    }
   
    void setComponents()
    {
        l0 = new JLabel();
        ImageIcon i1 = new ImageIcon("/home/mangesh/Downloads/Login.jpg");
        // path in string type 
        l0.setIcon(i1);
        Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
        Cursor c2 = new Cursor(Cursor.WAIT_CURSOR);
        // Cursor c2 = new Cursor(Cursor.CROSSHAIR_CURSOR);
        // Cursor c3 = new Cursor(Cursor.DEFAULT_CURSOR);
        // Cursor c4 = new Cursor(Cursor.HAND_CURSOR);
        // available in awt package 

        Font f1 = new Font("Times New Roman", Font.BOLD,28);
        Font f2 = new Font("Callibri", Font.ITALIC,15);


        l1 = new JLabel("Welcome To coding Institute");
        l1.setFont(f1);
        // l1.setForeground(Color.BLUE);
        l2 = new JLabel("USERNAME");
        l3 = new JLabel("PASSWORD");
        l3.setFont(f2);
        // l3.setForeground(Color.GREEN);
        l4 = new JLabel();
        t1 = new JTextField();
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");
        // b1.setForeground(Color.YELLOW);
        // b1.setBackground(Color.RED);
        b1.setCursor(c1);
        b2 = new JButton("Clear");
        b2.setCursor(c2);
        // b2.setForeground(Color.WHITE);
        // b2.setBackground(Color.GREEN);
        
        b3 = new JButton("Add");
        b3.setCursor(c2);
        // b3.setForeground(Color.BLUE);
        // b3.setBackground(Color.YELLOW);
        b4 = new JButton("AutoFill");
        b4.setCursor(c1);
        // b4.setForeground(Color.BLUE);
        // b4.setBackground(Color.GRAY);
        setLayout(null);
        add(l0);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        l0.setBounds(200, 10, 150, 150);
        l1.setBounds(100,50,500,30);
        l2.setBounds(100,200,100,30);
        l3.setBounds(100,350,100,30);
        l4.setBounds(100,550,300,30);
        t1.setBounds(350,200,100,30);
        t2.setBounds(350,350,100,30);
        b1.setBounds(250,450,100,30);
        b2.setBounds(400,450,100,30);
        b3.setBounds(100,450,100,30);
        b4.setBounds(400,550,100,30);
        b1.addActionListener(new Log());//it receive actionListener type
        b2.addActionListener(new Clear());//it receive actionListener type
        b3.addActionListener(new Add());//it receive actionListener type
        b4.addActionListener(new Autofill());//it receive actionListener type
        l1.addMouseListener(new MouseL());
        /*
        actionListener(ActiomLlistener l1)
        {

        }

        
     */
        
    }

    class MouseL  implements MouseListener//Interface
    {
        public void mouseClicked(MouseEvent e1)
        {

        }
        public void mousePressed(MouseEvent e1)
        {

        }
        public void mouseReleased(MouseEvent e1)
        {

        }
        public void mouseEntered(MouseEvent e1)
        {
            l1.setForeground(Color.RED);
        }
        public void mouseExited(MouseEvent e1)
        {
            l1.setForeground(Color.BLACK);
            
        }
       
       
    }

    public static void main(String []args)
    {
        LoginS s1 = new LoginS("Welcome to CoDing Sikho");
        s1.setVisible(true);
        s1.setSize(500,500);
        s1.setComponents();
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //  class ka object 

    class Log implements ActionListener//interface
    {
       
        public void actionPerformed(ActionEvent e1)
        {
            String s1=t1.getText();
            String s2=t2.getText();
            if(s1.equals("Coding")&& s2.equals("Seekho"))
            {
                JOptionPane.showMessageDialog(null, "Login Successful !!");
                l4.setText("Login Successful !!");
            }
            else
            {   // search swing components in java
                JOptionPane.showMessageDialog(null, "Login UnSuccessful !!");
            }
        }
    }

    class Clear implements ActionListener//interface
    {
       
        public void actionPerformed(ActionEvent e1)
        {
           t1.setText("");
           t2.setText("");
        }
    }
    class Autofill implements ActionListener//interface
    {
       
        public void actionPerformed(ActionEvent e1)
        {
           t1.setText("Coding");
           t2.setText("Seekho");
        }
    }
    class Add implements ActionListener//interface
    {
       
        public void actionPerformed(ActionEvent e1)
        {
            try{

                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c = a + b;
                l4.setText(" Addition is : "+c );
            }
            catch(Exception I1)
            {
                // System.out.println(I1.getMessage());
                l4.setText("Please Enter A number only !!");
            }
        }
    }
}

/*
 *  void setComponents()
    {
        JLabel l1 = new JLabel("Creating a Label  within Component!!");
        // JTextField t1 = new JTextField("Input");
        setLayout(null);
        // t1.setBounds(200,200,100,30);
        l1.setBounds(200,100, 100,60);
        // add(t1);
        add(l1);
    }

 */

 // import javax.swing.*;

// public class LoginS
// {/**
//     //two ways to pass message 
//         1.by passing arg in the constructor
//         2. setTitle(); method

//      */
//     LoginS(String s1)
//     {
        
//     }
//     LoginS()
//     {

//     }

//     public static void main(String []args)
//     {
//             JFrame j1 = new JFrame("Welcome To S-BOOk");
//             j1.setVisible(true);
//             j1.setSize(500,500);
//             j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//     }
// }


/**
//two ways to pass message 
    1.by passing arg in the constructor
    2. setTitle(); method

 */
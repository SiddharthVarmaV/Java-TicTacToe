import java.awt.*;
import java.awt.Color;
import java.awt.event.*;  
import javax.swing.*;

class NewJFrame {
    NewJFrame(String s){
        JFrame frame = new JFrame();
        JLabel winner;
        if(!s.equals("RED") && !s.equals("BLUE")){
            winner = new JLabel("It's A Draw !");
        }
        else{
            winner = new JLabel("\""+s + "\" Won!");
        }
        winner.setBounds(100,130, 100,30);
        frame.add(winner);
        frame.setSize(300,300);  
        frame.setLayout(null);  
        frame.setVisible(true);
    }
}

public class TicTacToe extends JFrame implements ActionListener {

    JButton b1 = new JButton(" ");  
    JButton b2 = new JButton(" ");  
    JButton b3 = new JButton(" ");  
    JButton b4 = new JButton(" ");
    JButton b5 = new JButton(" ");  
    JButton b6 = new JButton(" ");  
    JButton b7 = new JButton(" ");  
    JButton b8 = new JButton(" ");
    JButton b9 = new JButton(" ");
    
    TicTacToe(){

        b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
        b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
        b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);

        add(b1);add(b2);add(b3);add(b4);add(b5);  
        add(b6);add(b7);add(b8);add(b9);

        setLayout(new GridLayout(3,3)); 
        setSize(300,300);  
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static int i = 1;
    static String s = "";
    public void actionPerformed(ActionEvent e)  
    {

        //First click of button {

            //Red color

            
        if(i%2 == 1){
        if (e.getSource()==b1) {
            b1.setBackground(Color.red);
            b1.setEnabled(false);
        }
        else if (e.getSource()==b2) {
            b2.setBackground(Color.red);
            b2.setEnabled(false);
        }
        else if (e.getSource()==b3) {
            b3.setBackground(Color.red);
            b3.setEnabled(false);
        }
        else if (e.getSource()==b4) {
            b4.setBackground(Color.red);
            b4.setEnabled(false);
        }
        else if (e.getSource()==b5) {
            b5.setBackground(Color.red);
            b5.setEnabled(false);
        }
        else if (e.getSource()==b6) {
            b6.setBackground(Color.red);
            b6.setEnabled(false);
        }
        else if (e.getSource()==b7) {
            b7.setBackground(Color.red);
            b7.setEnabled(false);
        }
        else if (e.getSource()==b8) {
            b8.setBackground(Color.red);
            b8.setEnabled(false);
        }
        else if (e.getSource()==b9) {
            b9.setBackground(Color.red);
            b9.setEnabled(false);
        }
        }


        // Blue 
        else{
            if (e.getSource()==b1) {
                b1.setBackground(Color.blue);
                b1.setEnabled(false);
            }
            else if (e.getSource()==b2) {
                b2.setBackground(Color.blue);
                b2.setEnabled(false);
            }
            else if (e.getSource()==b3) {
                b3.setBackground(Color.blue);
                b3.setEnabled(false);
            }
            else if (e.getSource()==b4) {
                b4.setBackground(Color.blue);
                b4.setEnabled(false);
            }
            else if (e.getSource()==b5) {
                b5.setBackground(Color.blue);
                b5.setEnabled(false);
            }
            else if (e.getSource()==b6) {
                b6.setBackground(Color.blue);
                b6.setEnabled(false);
            }
            else if (e.getSource()==b7) {
                b7.setBackground(Color.blue);
                b7.setEnabled(false);
            }
            else if (e.getSource()==b8) {
                b8.setBackground(Color.blue);
                b8.setEnabled(false);
            }
            else if (e.getSource()==b9) {
                b9.setBackground(Color.blue);
                b9.setEnabled(false);
            }
        }
        //Button clicks over

        /* 
        Now to do the check.
        It is possible to finish
        For color check to i%2
        */

        i++;
        
        //Horzontals

        if( (b1.getBackground() == b2.getBackground() && b2.getBackground() == b3.getBackground() && b3.getBackground() == Color.RED) || (b1.getBackground() == b2.getBackground() && b2.getBackground() == b3.getBackground() && b3.getBackground() == Color.BLUE)){
            if (i%2 == 0){
                s = "RED";
            }
            else {
                s = "BLUE";
            }
            new NewJFrame(s);
        }

        else if((b4.getBackground() == b5.getBackground() && b5.getBackground() == b6.getBackground() && b6.getBackground() == Color.RED) || (b4.getBackground() == b5.getBackground() && b5.getBackground() == b6.getBackground() && b6.getBackground() == Color.BLUE)){
            if (i%2 == 0){
                s = "RED";
            }
            else {
                s = "BLUE";
            }
            new NewJFrame(s);
        }

        else if((b7.getBackground() == b8.getBackground() && b8.getBackground() == b9.getBackground() && b9.getBackground() == Color.RED) || (b7.getBackground() == b8.getBackground() && b8.getBackground() == b9.getBackground() && b9.getBackground() == Color.BLUE)){
            if (i%2 == 0){
                s = "RED";
            }
            else {
                s = "BLUE";
            }
            new NewJFrame(s);
        }

        /*
        Horzontals over.
        Verticals start
        */

        else if((b1.getBackground() == b4.getBackground() && b4.getBackground() == b7.getBackground() && b7.getBackground() == Color.RED) || (b1.getBackground() == b4.getBackground() && b4.getBackground() == b7.getBackground() && b7.getBackground() == Color.BLUE)){
            if (i%2 == 0){
                s = "RED";
            }
            else {
                s = "BLUE";
            }
            new NewJFrame(s);
        }

        else if((b2.getBackground() == b5.getBackground() && b5.getBackground() == b8.getBackground() && b8.getBackground() == Color.RED) || (b2.getBackground() == b5.getBackground() && b5.getBackground() == b8.getBackground() && b8.getBackground() == Color.BLUE)){
            if (i%2 == 0){
                s = "RED";
            }
            else {
                s = "BLUE";
            }
            new NewJFrame(s);
        }

        else if((b3.getBackground() == b6.getBackground() && b6.getBackground() == b9.getBackground() && b9.getBackground() == Color.RED) || (b3.getBackground() == b6.getBackground() && b6.getBackground() == b9.getBackground() && b9.getBackground() == Color.BLUE)){
            if (i%2 == 0){
                s = "RED";
            }
            else {
                s = "BLUE";
            }
            new NewJFrame(s);
        }

        /*
        Horizontals over
        Diagonals start
        */

        else if((b1.getBackground() == b5.getBackground() && b5.getBackground() == b9.getBackground() && b9.getBackground() == Color.RED) || (b1.getBackground() == b5.getBackground() && b5.getBackground() == b9.getBackground() && b9.getBackground() == Color.BLUE)){
            if (i%2 == 0){
                s = "RED";
            }
            else {
                s = "BLUE";
            }
            new NewJFrame(s);
        }

        else if((b3.getBackground() == b5.getBackground() && b5.getBackground() == b7.getBackground() && b7.getBackground() == Color.RED) || (b3.getBackground() == b5.getBackground() && b5.getBackground() == b7.getBackground() && b7.getBackground() == Color.BLUE)){
            if (i%2 == 0){
                s = "RED";
            }
            else {
                s = "BLUE";
            }
            new NewJFrame(s);
        }
        else if(i==10){
            new NewJFrame(s);
        }



        /*
        Diagonals over
        */

    }
    public static void main(String[] args) {
        new TicTacToe();
    }
}

package demo;

//6a. Swing program demonstrating GridLayout

import javax.swing.*;
import java.awt.*;

public class GridLayout6a {

 public static void main(String[] args) {

     // Create Frame
     JFrame frame = new JFrame("GridLayout Example");

     // Set GridLayout (3 rows, 3 columns)
     frame.setLayout(new GridLayout(3, 3, 10, 10)); // gaps = 10px

     // Add buttons
     for (int i = 1; i <= 9; i++) {
         frame.add(new JButton("Button " + i));
     }

     // Frame settings
     frame.setSize(300, 300);
     frame.setLocationRelativeTo(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
 }
}
package application;

import model.entities.Rectangle;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width =  Integer.parseInt(JOptionPane.showInputDialog(null, "Enter rectangle width: ", 0));
        rectangle.height = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter rectangle height: ", 0));

        JOptionPane.showMessageDialog(null, "Area: " + rectangle.areaCalculate());
        JOptionPane.showMessageDialog(null, "Perimeter: " + rectangle.perimeterCalculate());
        JOptionPane.showMessageDialog(null, "Diagonal: " + rectangle.diagonalCalculate());
    }
}
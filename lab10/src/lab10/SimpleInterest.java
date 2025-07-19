/* 4.Write a java program to compute simple interest. The input and output required are taken from/to prebuilt dialog box. */


import javax.swing.*;

public class SimpleInterest {
    public static void main(String[] args) {
        String pStr = JOptionPane.showInputDialog("Enter Principal:");
        String rStr = JOptionPane.showInputDialog("Enter Rate:");
        String tStr = JOptionPane.showInputDialog("Enter Time:");

        double p = Double.parseDouble(pStr);
        double r = Double.parseDouble(rStr);
        double t = Double.parseDouble(tStr);

        double si = (p * r * t) / 100;

        JOptionPane.showMessageDialog(null, "Simple Interest: " + si);
    }
}

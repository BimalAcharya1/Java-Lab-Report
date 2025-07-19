/* 2.Write a program using Swing components to add and subtract two numbers. Use text fields for inputs and output.
    Your program should display the result when the user press button. */




import javax.swing.*;
import java.awt.event.*;

public class AddSubtract extends JFrame {
    JTextField num1, num2, result;
    JButton add, subtract;

    public AddSubtract() {
        setTitle("Add & Subtract");
        setLayout(null);
        setSize(300, 250);

        JLabel l1 = new JLabel("Num 1:");
        l1.setBounds(20, 30, 100, 30);
        add(l1);
        num1 = new JTextField();
        num1.setBounds(120, 30, 100, 30);
        add(num1);

        JLabel l2 = new JLabel("Num 2:");
        l2.setBounds(20, 70, 100, 30);
        add(l2);
        num2 = new JTextField();
        num2.setBounds(120, 70, 100, 30);
        add(num2);

        add = new JButton("Add");
        add.setBounds(30, 110, 100, 30);
        add(add);

        subtract = new JButton("Subtract");
        subtract.setBounds(140, 110, 100, 30);
        add(subtract);

        result = new JTextField();
        result.setBounds(80, 160, 120, 30);
        result.setEditable(false);
        add(result);

        add.addActionListener(e -> {
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            result.setText(String.valueOf(a + b));
        });

        subtract.addActionListener(e -> {
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            result.setText(String.valueOf(a - b));
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AddSubtract();
    }
}

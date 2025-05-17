import javax.swing.*;
import java.awt.event.*;

public class RectangleCalculator extends JFrame {
    JTextField lengthField, widthField, areaField, perimeterField;
    JButton calculateButton;

    public RectangleCalculator() {
        setTitle("Rectangle Area & Perimeter");
        setLayout(null);
        setSize(300, 300);

        JLabel l1 = new JLabel("Length:");
        l1.setBounds(20, 30, 100, 30);
        add(l1);
        lengthField = new JTextField();
        lengthField.setBounds(120, 30, 100, 30);
        add(lengthField);

        JLabel l2 = new JLabel("Width:");
        l2.setBounds(20, 70, 100, 30);
        add(l2);
        widthField = new JTextField();
        widthField.setBounds(120, 70, 100, 30);
        add(widthField);

        JLabel l3 = new JLabel("Area:");
        l3.setBounds(20, 150, 100, 30);
        add(l3);
        areaField = new JTextField();
        areaField.setBounds(120, 150, 100, 30);
        areaField.setEditable(false);
        add(areaField);

        JLabel l4 = new JLabel("Perimeter:");
        l4.setBounds(20, 190, 100, 30);
        add(l4);
        perimeterField = new JTextField();
        perimeterField.setBounds(120, 190, 100, 30);
        perimeterField.setEditable(false);
        add(perimeterField);

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(80, 110, 100, 30);
        add(calculateButton);

        calculateButton.addActionListener(e -> {
            double length = Double.parseDouble(lengthField.getText());
            double width = Double.parseDouble(widthField.getText());
            areaField.setText(String.valueOf(length * width));
            perimeterField.setText(String.valueOf(2 * (length + width)));
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new RectangleCalculator();
    }
}

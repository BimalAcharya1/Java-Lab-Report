import javax.swing.*;

public class MinMax extends JFrame {
    JTextField t1, t2, t3, result;
    JButton compute;

    public MinMax() {
        setTitle("Smallest & Largest");
        setLayout(null);
        setSize(350, 300);

        t1 = new JTextField(); t1.setBounds(100, 30, 150, 30); add(new JLabel("Num 1:")).setBounds(30, 30, 60, 30); add(t1);
        t2 = new JTextField(); t2.setBounds(100, 70, 150, 30); add(new JLabel("Num 2:")).setBounds(30, 70, 60, 30); add(t2);
        t3 = new JTextField(); t3.setBounds(100, 110, 150, 30); add(new JLabel("Num 3:")).setBounds(30, 110, 60, 30); add(t3);

        compute = new JButton("Find");
        compute.setBounds(100, 150, 100, 30);
        add(compute);

        result = new JTextField(); result.setBounds(50, 200, 250, 30); result.setEditable(false); add(result);

        compute.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = Integer.parseInt(t3.getText());
            int min = Math.min(a, Math.min(b, c));
            int max = Math.max(a, Math.max(b, c));
            result.setText("Smallest: " + min + ", Largest: " + max);
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MinMax();
    }
}

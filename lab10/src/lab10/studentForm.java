import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class studentForm extends JFrame {
    public studentForm() {
        setTitle("Student Registration");
        setLayout(null);
        setSize(400, 500);

        JTextField name = new JTextField(); 
        name.setBounds(120, 20, 200, 30);
        add(new JLabel("Name:")).setBounds(20, 20, 100, 30); 
        add(name);
          
        JTextField address = new JTextField(); 
        address.setBounds(120, 60, 200, 30); 
        add(new JLabel("Address:")).setBounds(20, 60, 100, 30); 
        add(address);
          
        JTextField email = new JTextField(); 
        email.setBounds(120, 100, 200, 30); 
        add(new JLabel("Email:")).setBounds(20, 100, 100, 30); 
        add(email);
          
        JPasswordField password = new JPasswordField(); 
        password.setBounds(120, 140, 200, 30); 
        add(new JLabel("Password:")).setBounds(20, 140, 100, 30);
        add(password);

        JRadioButton male = new JRadioButton("Male");
          male.setBounds(120, 180, 60, 30);
          
        JRadioButton female = new JRadioButton("Female"); 
          female.setBounds(180, 180, 70, 30);
          
        ButtonGroup gender = new ButtonGroup(); 
          gender.add(male); 
          gender.add(female);
          add(new JLabel("Gender:")).setBounds(20, 180, 100, 30); 
          add(male); 
          add(female);

        JCheckBox hobby1 = new JCheckBox("Reading");
                hobby1.setBounds(120, 220, 80, 30);
        JCheckBox hobby2 = new JCheckBox("Gaming"); 
                hobby2.setBounds(200, 220, 80, 30);
        add(new JLabel("Hobbies:")).setBounds(20, 220, 100, 30); 
             add(hobby1);
             add(hobby2);

        String[] countries = {"Nepal", "USA", "UK","India"};
        JComboBox<String> country = new JComboBox<>(countries);
           country.setBounds(120, 260, 200, 30);
        add(new JLabel("Country:")).setBounds(20, 260, 100, 30);
           add(country);

        JTextArea opinion = new JTextArea(); 
          opinion.setBounds(120, 300, 200, 60);
        add(new JLabel("Opinion:")).setBounds(20, 300, 100, 30); 
           add(opinion);

        JButton submit = new JButton("Submit"); 
          submit.setBounds(150, 380, 100, 30);
          add(submit);

        submit.addActionListener(e -> {
            String info = "Name: " + name.getText() + "\n" +
               "Address: " + address.getText() + "\n" +
               "Email: " + email.getText() + "\n" +
               "Gender: " + (male.isSelected() ? "Male" : "Female") + "\n" +
               "Hobbies: " + (hobby1.isSelected() ? "Reading " : "") + (hobby2.isSelected() ? "Gaming" : "") + "\n" +
               "Country: " + country.getSelectedItem() + "\n" +
               "Opinion: " + opinion.getText();

            JOptionPane.showMessageDialog(this, info);
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new studentForm();
    }
}

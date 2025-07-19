/* 6. Write a java program to illustrate the following Swing component
a. JMenu
b. JTable
c. JInternalFrame and Desktop */



public class SwingComponentsDemo extends JFrame {
    public SwingComponentsDemo() {
        setTitle("Swing Components");
        setSize(600, 400);
        setLayout(null);
        
        //Menu 
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        file.add(new JMenuItem("Open"));
        file.add(new JMenuItem("Save"));
        menuBar.add(file);
        setJMenuBar(menuBar);

        //Table
        String[] columns = {"ID", "Name"};
        String[][] data = {{"1", "Albert"}, {"2", "Nimesh"}};
        JTable table = new JTable(data, columns);
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(20, 20, 200, 100);
        add(pane);

        //JInternal Frame and Desktop
        JDesktopPane desktop = new JDesktopPane();
        desktop.setBounds(250, 20, 300, 300);
        JInternalFrame internal = new JInternalFrame("Internal Frame", true, true, true, true);
        internal.setSize(250, 150);
        internal.setVisible(true);
        desktop.add(internal);
        add(desktop);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingComponentsDemo();
    }
}


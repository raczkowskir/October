import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstRR {
    private JButton resultButton;
    private JPanel panel1;
    private JButton closeButton;
    private Icon icon = new Icon() {
        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {

        }

        @Override
        public int getIconWidth() {
            return 30;
        }

        @Override
        public int getIconHeight() {
            return 30;
        }
    }

    public FirstRR() {
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button works!");
                JOptionPane.showMessageDialog(null, "You actually do sth :)");
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("This button works even better :)");
                JOptionPane.showMessageDialog(null, "You actually do sth :)");
                closeButton.setIcon(icon);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FirstRR");
        frame.setContentPane(new FirstRR().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

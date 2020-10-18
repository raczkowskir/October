import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstRR {
    private JButton resultButton;
    private JPanel panel1;

    public FirstRR() {
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button works!");
                JOptionPane.showMessageDialog(null, "You actually do sth :)");
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

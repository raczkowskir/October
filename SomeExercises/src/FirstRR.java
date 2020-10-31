import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstRR {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel RakiPanel;

    ActionListener[] Al = new ActionListener[3];
    JButton[] buttons = {button1, button2, button3};

    private void actionsForButtons(String myConsolext, String myMessage) {
        System.out.println(myConsolext);
        JOptionPane.showMessageDialog(null, myMessage);
    }

    public FirstRR() {
        for (int i = 0; i < Al.length; i++) {
            String iterator = "" + (i + 1);
            Al[i] = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    actionsForButtons("Button " + iterator + " works", "Action " + iterator);
                }
            };

            buttons[i].addActionListener(Al[i]);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FirstRR");
        frame.setContentPane(new FirstRR().RakiPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocation(300, 300);
    }
}

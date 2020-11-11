import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// TODO:
// add listener for ',' button
// add feature of using numeric keyboard
// add icone
// prepare exe file
// enlarge txtField

public class FirstRR {
    private JPanel rakiPanel;
    private JTextField calculationsTxtField;
    private JButton btnClear, btnPlus, btnMinus, btnDivide, btnMultiply, btnResult, btnBack;
    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    private String firstNumber = "", secondNumber = "";
    private char operationType = '?';
    Double result = 0.0;

    private void clearAll() {
        firstNumber = "";
        secondNumber = "";
        operationType = '?';
        result = 0.0;
    }

    public FirstRR() {
        btnClear.addActionListener(actionBtnClear);
        btnPlus.addActionListener(actionBtnPlus);
        btnMinus.addActionListener(actionBtnMinus);
        btnDivide.addActionListener(actionBtnDivide);
        btnMultiply.addActionListener(actionBtnMultiply);
        btnResult.addActionListener(actionBtnResult);
        btnBack.addActionListener(actionBtnBack);
        setListnersForNumericbtns();
    }

    ActionListener actionBtnBack = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Back");
            String calcTxtFieldContent = calculationsTxtField.getText();
            try {
                Character lastMark = calcTxtFieldContent.charAt(calcTxtFieldContent.length() - 1);
                System.out.println(lastMark);
                calculationsTxtField.setText(calcTxtFieldContent.substring(0, calcTxtFieldContent.length() - 1));

                if (operationType == '?') {
                    firstNumber = firstNumber.substring(0, firstNumber.length() -1);
                }
                else if (lastMark == '+' || lastMark == '-' || lastMark == '/' || lastMark == '*') {
                    operationType = '?';
                }
                else {
                    secondNumber = secondNumber.substring(0, secondNumber.length() -1);
                }

            } catch (StringIndexOutOfBoundsException err) {
                System.out.println("Empty field.");
            }
        }
    };

    ActionListener actionBtnClear = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clear");
            calculationsTxtField.setText("");
            clearAll();
        }
    };

    ActionListener actionBtnPlus = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("plus");
            if (! firstNumber.equals("")) {
                calculationsTxtField.setText(firstNumber + "+");
                operationType = '+';
                secondNumber = "";
            }
        }
    };

    ActionListener actionBtnMinus = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("minus");
            if (! firstNumber.equals("")) {
                calculationsTxtField.setText(firstNumber + "-");
                operationType = '-';
                secondNumber = "";
            }
        }
    };

    ActionListener actionBtnDivide = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("divide");
            if (! firstNumber.equals("")) {
                calculationsTxtField.setText(firstNumber + "/");
                operationType = '/';
                secondNumber = "";
            }
        }
    };

    ActionListener actionBtnMultiply = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("multiply");
            if (! firstNumber.equals("")) {
                calculationsTxtField.setText(firstNumber + "*");
                operationType = '*';
                secondNumber = "";
            }
        }
    };

    ActionListener actionBtnResult = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("result");

            if (!firstNumber.equals("")) {

                switch (operationType) {
                    case '+':
                        result = Double.valueOf(firstNumber) + Double.valueOf(secondNumber);
                        break;
                    case '-':
                        result = Double.valueOf(firstNumber) - Double.valueOf(secondNumber);
                        break;
                    case '*':
                        result = Double.valueOf(firstNumber) * Double.valueOf(secondNumber);
                        break;
                    case '/':
                        result = Double.valueOf(firstNumber) / Double.valueOf(secondNumber);
                        break;
                }
            }
            String temporaryResult = String.valueOf(result);
            calculationsTxtField.setText(temporaryResult);
            clearAll();
            firstNumber = temporaryResult;
        }
    };

    private void setListnersForNumericbtns() {
        ActionListener[] al = new ActionListener[10];
        JButton[] numericBtns = {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};

        for (int i = 0; i < al.length; i++) {
            String iterator = ""+ i;
            al[i] = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(iterator);
                    if (operationType == '?') {
                        firstNumber = firstNumber + iterator;
                        calculationsTxtField.setText(firstNumber);
                    }
                    else {
                        secondNumber = secondNumber + iterator;
                        calculationsTxtField.setText(firstNumber + operationType + secondNumber);
                    }
                }
            };
            numericBtns[i].addActionListener(al[i]);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FirstRR");
        frame.setContentPane(new FirstRR().rakiPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocation(300, 300);
    }
   }
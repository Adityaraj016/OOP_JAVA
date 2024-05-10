import javax.swing.*;
import java.awt.event.*;

public class SwingDemo extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextField resultField;
    private JButton factorialButton;
    private JButton squareButton;

    public SwingDemo() {
        setTitle("Swing Demo");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        inputField = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        factorialButton = new JButton("FACTORIAL");
        squareButton = new JButton("SQUARE");

        factorialButton.addActionListener(this);
        squareButton.addActionListener(this);

        panel.add(new JLabel("Enter Number: "));
        panel.add(inputField);
        panel.add(factorialButton);
        panel.add(squareButton);
        panel.add(new JLabel("Result: "));
        panel.add(resultField);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == factorialButton) {
            calculateFactorial();
        } else if (e.getSource() == squareButton) {
            calculateSquare();
        }
    }

    private void calculateFactorial() {
        try {
            int num = Integer.parseInt(inputField.getText());
            if (num < 0) {
                throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
            }
            int factorial = 1;
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
            resultField.setText(String.valueOf(factorial));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input! Please enter a valid integer.");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }


    private void calculateSquare() {
        try {
            int num = Integer.parseInt(inputField.getText());
            int square = num * num;
            resultField.setText(String.valueOf(square));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input! Please enter a valid integer.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo().setVisible(true);
            }
        });
    }
}

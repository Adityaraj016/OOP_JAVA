package assigments;

import javax.swing.*;
import java.awt.*;

public class PersonalDetailsGUI extends JFrame {
    public PersonalDetailsGUI() {
        setTitle("Personal Details");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create labels and text fields for personal details
        JLabel hometownLabel = new JLabel("Hometown:");
        JTextField hometownField = new JTextField(20);

        JLabel passionLabel = new JLabel("Passion:");
        JTextField passionField = new JTextField(20);

        JLabel hobbiesLabel = new JLabel("Hobbies:");
        JTextField hobbiesField = new JTextField(20);

        JLabel fieldOfInterestLabel = new JLabel("Field of Interest:");
        JTextField fieldOfInterestField = new JTextField(20);

        JLabel fatherNameLabel = new JLabel("Father's Name:");
        JTextField fatherNameField = new JTextField(20);

        JLabel fatherOccupationLabel = new JLabel("Father's Occupation:");
        JTextField fatherOccupationField = new JTextField(20);

        JLabel fatherIncomeLabel = new JLabel("Father's Annual Income:");
        JTextField fatherIncomeField = new JTextField(20);

        JLabel motherNameLabel = new JLabel("Mother's Name:");
        JTextField motherNameField = new JTextField(20);

        JLabel motherOccupationLabel = new JLabel("Mother's Occupation:");
        JTextField motherOccupationField = new JTextField(20);

        JLabel motherIncomeLabel = new JLabel("Mother's Annual Income:");
        JTextField motherIncomeField = new JTextField(20);

        // Create a panel and set layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2));

        // Add components to the panel
        panel.add(hometownLabel);
        panel.add(hometownField);
        panel.add(passionLabel);
        panel.add(passionField);
        panel.add(hobbiesLabel);
        panel.add(hobbiesField);
        panel.add(fieldOfInterestLabel);
        panel.add(fieldOfInterestField);
        panel.add(fatherNameLabel);
        panel.add(fatherNameField);
        panel.add(fatherOccupationLabel);
        panel.add(fatherOccupationField);
        panel.add(fatherIncomeLabel);
        panel.add(fatherIncomeField);
        panel.add(motherNameLabel);
        panel.add(motherNameField);
        panel.add(motherOccupationLabel);
        panel.add(motherOccupationField);
        panel.add(motherIncomeLabel);
        panel.add(motherIncomeField);

        // Add panel to the frame
        add(panel);
        hometownField.setText("Vaishali, Bihar");
        passionField.setText("Trading");
        hobbiesField.setText("Cricket, Listening to music");
        fieldOfInterestField.setText("Coding related things");
        fatherNameField.setText("Sanjay Kumar");
        fatherOccupationField.setText("Businessman");
        fatherIncomeField.setText("600000");
        motherNameField.setText("Rinku Devi");
        motherOccupationField.setText("Housewife");
        motherIncomeField.setText("200000");

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PersonalDetailsGUI());
    }
}

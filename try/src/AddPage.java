import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// my current probelm is in this page, as you can notice i created this page using Gui form to create some text holders, but this page is not working whenever i run the 
//program an error appears to me("Cannot bind: field does not exist: AddPage.NameField") i dont not know how to solve this i searched on google,youtube and even with chat gpt
// but i could not figure it out how to solve it, i was planning to use the gui form desgin for the rest of the pages but i think the same problem will happen to me, i wish you can
// help me
public class AddPage {
    private JTextField nameHolder;
    private JTextField addressHolder;
    private JTextField phoneNbHolder;
    private JTextField salaryHolder;
    private JButton submitButton;
    private JButton backButton;
    private JLabel nameField;
    private JLabel addressField;
    private JLabel phoneNbField;
    private JLabel salaryField;

    public AddPage() {
        // Instantiate text fields
        nameHolder = new JTextField();
        addressHolder = new JTextField();
        phoneNbHolder = new JTextField();
        salaryHolder = new JTextField();

        // Instantiate buttons
        submitButton = new JButton("Submit");
        backButton = new JButton("Back");

        // Set labels
        nameField = new JLabel("Name:");
        addressField = new JLabel("Address:");
        phoneNbField = new JLabel("Phone Number:");
        salaryField = new JLabel("Salary:");

        // Create JFrame
        JFrame frame = new JFrame("AddPage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null); // Use null layout for absolute positioning

        // Set bounds for components
        nameField.setBounds(20, 20, 80, 25);
        nameHolder.setBounds(120, 20, 200, 25);

        addressField.setBounds(20, 60, 80, 25);
        addressHolder.setBounds(120, 60, 200, 25);

        phoneNbField.setBounds(20, 100, 100, 25);
        phoneNbHolder.setBounds(120, 100, 200, 25);

        salaryField.setBounds(20, 140, 80, 25);
        salaryHolder.setBounds(120, 140, 200, 25);

        submitButton.setBounds(120, 180, 80, 25);
        backButton.setBounds(220, 180, 80, 25);

        // Add components to the frame
        frame.add(nameField);
        frame.add(nameHolder);
        frame.add(addressField);
        frame.add(addressHolder);
        frame.add(phoneNbField);
        frame.add(phoneNbHolder);
        frame.add(salaryField);
        frame.add(salaryHolder);
        frame.add(submitButton);
        frame.add(backButton);

        // Set action listener for the back button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your action here
            }
        });

        frame.setVisible(true);
    }

    
}

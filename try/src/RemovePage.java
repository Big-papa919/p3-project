import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemovePage implements ActionListener {
    JButton backButton = new JButton("Back");

    JButton submitButton = new JButton("Submit");
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    RemovePage(){

        backButton.setBounds(450,450,200,40);
        frame.add(backButton);
        backButton.addActionListener(this);
        backButton.setFocusable(false);

        submitButton.setBounds(680,450,200,40);
        frame.add(submitButton);
        submitButton.setFocusable(false);
        submitButton.addActionListener(this);


        frame.setTitle("Remove Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==backButton){
            frame.dispose();
            LaunchPage lunchPage = new LaunchPage();
        }
    }
}

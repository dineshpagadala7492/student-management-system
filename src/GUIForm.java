package src;

import javax.swing.*;
import java.awt.*;

public class GUIForm extends JFrame {
    public GUIForm() {
        setTitle("Student Management System");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome to Student Management System", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 14));

        add(label);
    }
}

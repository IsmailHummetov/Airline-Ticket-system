package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JLabel UserName = new JLabel("Username:");
    JLabel Password = new JLabel("Password:");
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JButton login = new JButton("Login");

    LoginPage() {
        frame.setSize(350, 300);
        frame.setResizable(false);
        frame.setTitle("Login");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.add(UserName);
        frame.add(Password);
        frame.add(username);
        frame.add(password);
        frame.add(login);

        UserName.setBounds(30, 50, 120, 30);
        UserName.setFont(new Font(null, Font.ITALIC, 20));

        Password.setBounds(30, 100, 120, 30);
        Password.setFont(new Font(null, Font.ITALIC, 20));

        username.setBounds(150, 50, 150, 30);
        username.setFont(new Font(null, Font.ITALIC, 16));

        password.setBounds(150, 100, 150, 30);
        username.setFont(new Font(null, Font.ITALIC, 12));

        login.setBounds(100, 150, 150, 70);
        login.setFont(new Font(null, Font.BOLD, 25));
        login.setFocusable(true);
        login.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            if (username.getText().equals("admin") && String.valueOf(password.getPassword()).equals("adminadmin")) {
                frame.dispose();
                new Flight();
            } else {
                JOptionPane.showMessageDialog(frame, "Username or password is wrong");
                username.setText("");
                password.setText("");
            }
        }

    }

}


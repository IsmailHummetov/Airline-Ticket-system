package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonalData implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label_name = new JLabel("Name");
    JLabel label_surname = new JLabel("Surname");
    JLabel label_passport_id = new JLabel("Passport ID");
    JLabel label_card_number = new JLabel("Card Number");
    JLabel label_valid = new JLabel("Valid");
    JLabel label_cvv = new JLabel("CVV");

    JTextField text_name = new JTextField();
    JTextField text_surname = new JTextField();
    JTextField text_passport_id = new JTextField();
    JTextField text_card_number = new JTextField();
    JTextField text_valid = new JTextField();
    JTextField text_cvv = new JTextField();
    JButton button_done = new JButton("Done");

    PersonalData() {
        frame.setTitle("Personal Data");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(300, 330);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.add(label_name);
        frame.add(label_surname);
        frame.add(label_passport_id);
        frame.add(label_card_number);
        frame.add(label_valid);
        frame.add(label_cvv);
        frame.add(text_name);
        frame.add(text_surname);
        frame.add(text_passport_id);
        frame.add(text_card_number);
        frame.add(text_valid);
        frame.add(text_cvv);
        frame.add(button_done);


        //Labels
        {
            label_name.setBounds(10, 20, 100, 30);
            label_name.setFont(new Font(null, Font.ITALIC, 20));

            label_surname.setBounds(10, 60, 100, 30);
            label_surname.setFont(new Font(null, Font.ITALIC, 20));

            label_passport_id.setBounds(10, 100, 120, 30);
            label_passport_id.setFont(new Font(null, Font.ITALIC, 20));

            label_card_number.setBounds(10, 140, 120, 20);
            label_card_number.setFont(new Font(null, Font.ITALIC, 14));

            label_valid.setBounds(10, 190, 50, 20);
            label_valid.setFont(new Font(null, Font.ITALIC, 14));

            label_cvv.setBounds(215, 190, 50, 20);
            label_cvv.setFont(new Font(null, Font.ITALIC, 14));

        }

        //TextFields
        {
            text_name.setBounds(130, 20, 150, 30);
            text_name.setFont(new Font(null, Font.ITALIC, 16));

            text_surname.setBounds(130, 60, 150, 30);
            text_surname.setFont(new Font(null, Font.ITALIC, 16));

            text_passport_id.setBounds(130, 100, 150, 30);
            text_passport_id.setFont(new Font(null, Font.ITALIC, 16));

            text_card_number.setBounds(10, 165, 270, 20);
            text_card_number.setFont(new Font(null, Font.BOLD, 12));

            text_valid.setBounds(50, 190, 40, 20);
            text_valid.setFont(new Font(null, Font.ITALIC, 12));

            text_cvv.setBounds(250, 190, 30, 20);
            text_cvv.setFont(new Font(null, Font.ITALIC, 12));
        }

        button_done.setBounds(100, 220, 100, 50);
        button_done.setFont(new Font(null, Font.BOLD, 25));
        button_done.setFocusable(true);
        button_done.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button_done) {
            Ticket.set_personal_data(text_name.getText(), text_surname.getText(), text_passport_id.getText());
            JOptionPane.showMessageDialog(frame, "Registration is complected");
            frame.dispose();

        }
    }
}

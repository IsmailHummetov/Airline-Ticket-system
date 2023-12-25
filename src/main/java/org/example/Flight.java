package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Flight extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JLabel text = new JLabel();
    JLabel text1 = new JLabel();
    JLabel text2 = new JLabel();
    JLabel text3 = new JLabel();
    JLabel text4 = new JLabel();
    JLabel text5 = new JLabel();

    JComboBox from = new JComboBox();
    JComboBox to = new JComboBox();
    JComboBox departure = new JComboBox();
    JComboBox ticket_type = new JComboBox();
    JComboBox baggage = new JComboBox();

    JButton button_buy = new JButton("Buy Ticket");
    JButton button_show_ticket = new JButton("Show Ticket");

    static String name, surname, passport_id;
    String flights[][] = {{"Baku", "Moscow", "20/12/2023", "15:00", "345", "420"}, {"Baku", "Moscow", "24/12/2023", "15:00", "340", "418"}, {"Baku", "Moscow", "28/12/2023", "18:00", "358", "440"}, {"Baku", "Moscow", "29/12/2023", "05:45", "380", "480"}, {"Baku", "Moscow", "04/01/2024", "01:00", "360", "445"}, {"Baku", "Moscow", "06/01/2024", "12:15", "350", "430"}, {"Baku", "Moscow", "10/01/2024", "20:30", "330", "400"},
            {"Baku", "Istanbul", "22/12/2023", "10:00", "220", "300"}, {"Baku", "Istanbul", "24/12/2023", "12:00", "235", "310"}, {"Baku", "Istanbul", "25/12/2023", "18:40", "240", "315"}, {"Baku", "Istanbul", "29/12/2023", "20:10", "255", "330"}, {"Baku", "Istanbul", "31/12/2023", "08:40", "270", "400"}, {"Baku", "Istanbul", "01/01/2024", "21:00", "265", "390"}, {"Baku", "Istanbul", "02/01/2024", "15:00", "250", "365"}, {"Baku", "Istanbul", "04/01/2024", "12:45", "265", "370"}, {"Baku", "Istanbul", "05/01/2024", "19:00", "230", "340"},
            {"Baku", "Gabala", "22/12/2023", "15:00", "60", "90"}, {"Baku", "Gabala", "26/12/2023", "12:30", "65", "105"}, {"Baku", "Gabala", "31/12/2023", "15:40", "70", "120"}, {"Baku", "Gabala", "03/01/2024", "05:00", "60", "85"}, {"Baku", "Gabala", "07/01/2024", "10:45", "55", "85"},
            {"Baku", "Nakhchivan", "20/12/2023", "15:00", "80", "120"}, {"Baku", "Nakhchivan", "23/12/2023", "16:20", "80", "110"}, {"Baku", "Nakhchivan", "28/12/2023", "15:45", "90", "120"}, {"Baku", "Nakhchivan", "31/12/2023", "11:00", "105", "140"}, {"Baku", "Nakhchivan", "01/01/2024", "08:40", "100", "135"}, {"Baku", "Nakhchivan", "03/01/2024", "00:30", "90", "125"}, {"Baku", "Nakhchivan", "06/01/2024", "12:00", "85", "115"},
            {"Baku", "Tbilisi", "20/12/2023", "12:00", "140", "210"}, {"Baku", "Tbilisi", "24/12/2023", "13:20", "150", "220"}, {"Baku", "Tbilisi", "29/12/2023", "05:30", "155", "210"}, {"Baku", "Tbilisi", "30/12/2023", "19:40", "165", "235"}, {"Baku", "Tbilisi", "02/01/2024", "18:25", "150", "220"}, {"Baku", "Tbilisi", "05/01/2024", "22:45", "145", "215"}, {"Baku", "Tbilisi", "08/01/2024", "10:00", "130", "200"},
            {"Moscow", "Baku", "22/12/2023", "10:00", "450", "530"}, {"Moscow", "Baku", "30/12/2023", "00:30", "520", "600"}, {"Moscow", "Baku", "31/12/2023", "12:45", "570", "640"}, {"Moscow", "Baku", "03/01/2024", "15:00", "480", "540"}, {"Moscow", "Baku", "07/01/2024", "18:30", "450", "520"}, {"Moscow", "Baku", "12/01/2024", "21:50", "430", "500"},
            {"Moscow", "Istanbul", "21/12/2023", "11:45", "520", "590"}, {"Moscow", "Istanbul", "25/12/2023", "12:00", "540", "620"}, {"Moscow", "Istanbul", "30/12/2023", "02:30", "590", "650"}, {"Moscow", "Istanbul", "03/01/2024", "06:50", "550", "630"}, {"Moscow", "Istanbul", "06/01/2024", "18:00", "530", "600"}, {"Moscow", "Istanbul", "11/01/2024", "21:30", "510", "580"},
            {"Moscow", "Tbilisi", "23/12/2023", "21:00", "400", "460"}, {"Moscow", "Tbilisi", "28/12/2023", "23:00", "425", "480"}, {"Moscow", "Tbilisi", "31/12/2023", "15:00", "445", "500"}, {"Moscow", "Tbilisi", "03/01/2024", "12:30", "440", "490"}, {"Moscow", "Tbilisi", "08/12/2023", "18:45", "420", "450"},
            {"Istanbul", "Baku", "20/12/2023", "12:00", "240", "320"}, {"Istanbul", "Baku", "22/12/2023", "19:00", "245", "340"}, {"Istanbul", "Baku", "25/12/2023", "10:30", "260", "345"}, {"Istanbul", "Baku", "28/12/2023", "21:00", "270", "360"}, {"Istanbul", "Baku", "30/12/2023", "23:45", "275", "385"}, {"Istanbul", "Baku", "31/12/2023", "22:10", "290", "410"}, {"Istanbul", "Baku", "01/01/2024", "13:30", "280", "390"}, {"Istanbul", "Baku", "02/01/2024", "06:30", "270", "360"}, {"Istanbul", "Baku", "05/01/2024", "15:50", "265", "340"}, {"Istanbul", "Baku", "08/01/2024", "12:40", "250", "330"},
            {"Istanbul", "Moscow", "22/12/2023", "08:00", "450", "520"}, {"Istanbul", "Moscow", "28/12/2023", "10:50", "480", "540"}, {"Istanbul", "Moscow", "30/12/2023", "15:00", "510", "590"}, {"Istanbul", "Moscow", "03/01/2024", "18:30", "430", "500"}, {"Istanbul", "Moscow", "06/01/2024", "03:25", "420", "510"}, {"Istanbul", "Moscow", "12/01/2024", "23:10", "425", "490"},
            {"Istanbul", "Tbilisi", "25/12/2023", "18:00", "200", "280"}, {"Istanbul", "Tbilisi", "28/12/2023", "12:30", "220", "300"}, {"Istanbul", "Tbilisi", "31/12/2023", "11:00", "245", "320"}, {"Istanbul", "Tbilisi", "01/01/2024", "22:45", "235", "305"}, {"Istanbul", "Tbilisi", "09/01/2024", "15:20", "210", "270"},
            {"Gabala", "Baku", "22/12/2023", "12:00", "60", "80"}, {"Gabala", "Baku", "29/12/2023", "11:40", "65", "90"}, {"Gabala", "Baku", "01/01/2024", "13:30", "60", "80"}, {"Gabala", "Baku", "07/01/2024", "15:00", "55", "85"},
            {"Gabala", "Nakhchivan", "25/12/2023", "21:00", "50", "80"}, {"Gabala", "Nakhchivan", "31/12/2023", "10:30", "65", "90"}, {"Gabala", "Nakhchivan", "02/01/2024", "18:45", "55", "80"}, {"Gabala", "Nakhchivan", "10/01/2024", "02:30", "45", "75"},
            {"Nakhchivan", "Gabala", "20/12/2023", "10:00", "50", "80"}, {"Nakhchivan", "Gabala", "28/12/2023", "12:30", "55", "80"}, {"Nakhchivan", "Gabala", "01/01/2024", "15:00", "60", "80"}, {"Nakhchivan", "Gabala", "07/01/2024", "19:20", "50", "80"},
            {"Nakhchivan", "Baku", "20/12/2023", "15:00", "80", "110"}, {"Nakhchivan", "Baku", "24/12/2023", "12:00", "80", "110"}, {"Nakhchivan", "Baku", "29/12/2023", "20:30", "90", "115"}, {"Nakhchivan", "Baku", "31/12/2023", "08:20", "105", "130"}, {"Nakhchivan", "Baku", "01/01/2024", "10:45", "95", "120"}, {"Nakhchivan", "Baku", "03/01/2024", "23:10", "85", "115"}, {"Nakhchivan", "Baku", "08/01/2024", "22:00", "75", "100"},
            {"Tbilisi", "Baku", "20/12/2023", "10:00", "135", "200"}, {"Tbilisi", "Baku", "23/12/2023", "11:15", "140", "200"}, {"Tbilisi", "Baku", "26/12/2023", "15:00", "140", "210"}, {"Tbilisi", "Baku", "29/12/2023", "18:20", "145", "220"}, {"Tbilisi", "Baku", "31/12/2023", "21:30", "160", "235"}, {"Tbilisi", "Baku", "01/01/2024", "17:45", "155", "225"}, {"Tbilisi", "Baku", "04/01/2024", "13:15", "140", "210"}, {"Tbilisi", "Baku", "08/01/2024", "20:00", "135", "205"}, {"Tbilisi", "Baku", "12/01/2024", "00:30", "130", "190"},
            {"Tbilisi", "Moscow", "22/12/2023", "11:00", "360", "420"}, {"Tbilisi", "Moscow", "28/12/2023", "12:30", "380", "440"}, {"Tbilisi", "Moscow", "30/12/2023", "10:15", "385", "435"}, {"Tbilisi", "Moscow", "31/12/2023", "05:00", "405", "460"}, {"Tbilisi", "Moscow", "01/01/2024", "21:40", "390", "450"}, {"Tbilisi", "Moscow", "03/01/2024", "14:45", "375", "430"}, {"Tbilisi", "Moscow", "05/01/2024", "19:00", "365", "420"}, {"Tbilisi", "Moscow", "09/01/2024", "02:30", "345", "400"},
            {"Tbilisi", "Istanbul", "22/12/2023", "21:00", "210", "280"}, {"Tbilisi", "Istanbul", "28/12/2023", "10:30", "190", "260"}, {"Tbilisi", "Istanbul", "30/12/2023", "18:45", "235", "300"}, {"Tbilisi", "Istanbul", "02/01/2024", "20:20", "220", "270"}, {"Tbilisi", "Istanbul", "07/12/2024", "05:50", "205", "265"},
    };
    String city[] = {"-", "Baku", "Moscow", "Istanbul", "Nakhchivan", "Gabala", "Tbilisi"};

    Flight() {
        frame.setTitle("Flights");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(800, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //Flight Label
        {
            text.setText("Flights");
            text.setBounds(300, 20, 200, 60);
            text.setFont(new Font("Arial", Font.BOLD, 36));
        }

        //From Label
        {
            text1.setText("From");
            text1.setBounds(50, 100, 100, 20);
            text1.setOpaque(true);
            text1.setBackground(new Color(42, 103, 219));
            text1.setForeground(Color.WHITE);
            text1.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 16));
            text1.setBorder(BorderFactory.createLineBorder(Color.black));
        }

        //To Label
        {
            text2.setText("To");
            text2.setBounds(150, 100, 100, 20);
            text2.setOpaque(true);
            text2.setBackground(new Color(42, 103, 219));
            text2.setForeground(Color.WHITE);
            text2.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 16));
            text2.setBorder(BorderFactory.createLineBorder(Color.black));
        }

        //Departure Time Label
        {
            text3.setText("Departure Time");
            text3.setBounds(250, 100, 200, 20);
            text3.setOpaque(true);
            text3.setBackground(new Color(42, 103, 219));
            text3.setForeground(Color.WHITE);
            text3.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 16));
            text3.setBorder(BorderFactory.createLineBorder(Color.black));
        }

        //Type of ticket Label
        {
            text4.setText("Type of ticket");
            text4.setBounds(450, 100, 150, 20);
            text4.setOpaque(true);
            text4.setBackground(new Color(42, 103, 219));
            text4.setForeground(Color.WHITE);
            text4.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 16));
            text4.setBorder(BorderFactory.createLineBorder(Color.black));
        }

        //Baggage Label
        {
            text5.setText("Baggage");
            text5.setBounds(600, 100, 100, 20);
            text5.setOpaque(true);
            text5.setBackground(new Color(42, 103, 219));
            text5.setForeground(Color.WHITE);
            text5.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 16));
            text5.setBorder(BorderFactory.createLineBorder(Color.black));
        }


        button_buy.setBounds(170, 200, 150, 70);
        button_buy.setFont(new Font(null, Font.BOLD, 18));
        button_buy.setFocusable(true);
        button_buy.addActionListener(this);

        button_show_ticket.setBounds(400, 200, 150, 70);
        button_show_ticket.setFont(new Font(null, Font.BOLD, 18));
        button_show_ticket.setFocusable(true);
        button_show_ticket.addActionListener(this);
        button_show_ticket.setEnabled(false);

        from = new JComboBox(city);
        from.setBounds(50, 120, 100, 20);
        to.setBounds(150, 120, 100, 20);
        departure.setBounds(250, 120, 200, 20);
        ticket_type.setBounds(450, 120, 150, 20);
        baggage.setBounds(600, 120, 100, 20);
        from.addActionListener(this);
        to.addActionListener(this);
        departure.addActionListener(this);
        ticket_type.addActionListener(this);
        baggage.addActionListener(this);

        //Frame adding
        {
            frame.add(text);
            frame.add(from);
            frame.add(to);
            frame.add(departure);
            frame.add(ticket_type);
            frame.add(baggage);
            frame.add(text1);
            frame.add(text2);
            frame.add(text3);
            frame.add(text4);
            frame.add(text5);
            frame.add(button_buy);
            frame.add(button_show_ticket);
        }
    }

    public static void set_personal_data(String Name, String Surname, String Passport_ID) {
        name = Name;
        surname = Surname;
        passport_id = Passport_ID;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == from) {
            to.removeAllItems();
            baggage.removeAllItems();
            ArrayList<String> cities = new ArrayList<>();
            boolean flag = false;
            for (int i = 0; i < flights.length; i++) {
                if (flights[i][0].equals(from.getSelectedItem())) {
                    flag = true;
                    boolean test = false;
                    for (int j = 0; j < cities.size(); j++) {
                        if (cities.get(j) == flights[i][1]) test = true;
                    }
                    if (!test) {
                        to.addItem(flights[i][1]);
                        cities.add(flights[i][1]);
                    }
                }
            }
            if (flag == false) {
                to.removeAllItems();
                departure.removeAllItems();
            }
            baggage.addItem("No");
            baggage.addItem("Yes(45$)");
        }
        if (e.getSource() == to) {
            departure.removeAllItems();
            boolean flag = false;
            for (int i = 0; i < flights.length; i++) {
                if (flights[i][0] == from.getSelectedItem() && flights[i][1] == to.getSelectedItem()) {
                    flag = true;
                    departure.addItem(flights[i][2] + "   " + flights[i][3]);
                }
            }
            if (flag == false) departure.removeAllItems();
        }
        if (e.getSource() == departure) {
            ticket_type.removeAllItems();
            for (int i = 0; i < flights.length; i++) {
                if (flights[i][0].equals(from.getSelectedItem())
                        && flights[i][1].equals(to.getSelectedItem())
                        && (flights[i][2] + "   " + flights[i][3]).equals(departure.getSelectedItem())) {
                    ticket_type.addItem("Economy(" + flights[i][4] + "$)");
                    ticket_type.addItem("Business(" + flights[i][5] + "$)");
                    break;

                }
            }
        }
        if (e.getSource() == button_buy) {
            new PersonalData();
            button_show_ticket.setEnabled(true);
            Ticket.set_flight_data((String) from.getSelectedItem(), (String) to.getSelectedItem()
                    , (String) departure.getSelectedItem(), (String) ticket_type.getSelectedItem(), (String) baggage.getSelectedItem());

        }
        if (e.getSource() == button_show_ticket) {
            new Ticket();
        }
    }
}

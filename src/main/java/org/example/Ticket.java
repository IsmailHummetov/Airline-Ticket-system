package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ticket {
    JFrame frame = new JFrame();

    //Title labels
    JLabel label_boardpass = new JLabel("BOARDING PASS");
    JLabel label_flight = new JLabel("FLIGHT");
    JLabel label_boarding_time = new JLabel("BOARDING TIME");
    JLabel label_gate = new JLabel("GATE");
    JLabel label_seat = new JLabel("SEAT");
    JLabel label_passenger = new JLabel("PASSENGER NAME");
    JLabel label_class = new JLabel("CLASS");
    JLabel label_from = new JLabel("FROM");
    JLabel label_to = new JLabel("TO");
    JLabel label_date = new JLabel("DATE");
    JLabel label_baggage = new JLabel("BAGGAGE");

    //Data labes

    JLabel label_data_flight = new JLabel();
    JLabel label_data_boarding_time = new JLabel();
    JLabel label_data_gate = new JLabel();
    JLabel label_data_seat = new JLabel();
    JLabel label_data_passenger = new JLabel();
    JLabel label_data_class = new JLabel();
    JLabel label_data_from = new JLabel();
    JLabel label_data_to = new JLabel();
    JLabel label_data_date = new JLabel();
    JLabel label_data_baggage = new JLabel();


    static String name, surname, passport_id, departure_place, arrival_place, time, cost_ticket, baggage;
    static String type_of_ticket, boarding_time, date, seat, flight;
    static int cost, baggage_cost = 0, gate;

    public static void set_flight_data(String departure_place1
            , String arrival_place1, String time1, String cost1, String baggage1) {
        departure_place = departure_place1;
        arrival_place = arrival_place1;
        time = time1;
        cost_ticket = cost1;
        baggage = baggage1;
    }

    public static void set_personal_data(String name1, String surname1, String passport_id1) {
        name = name1;
        surname = surname1;
        passport_id = passport_id1;
    }

    public static void calc_cost() {
        String str = "";
        for (int i = 0; i < cost_ticket.length(); i++) {
            if (Character.isDigit(cost_ticket.charAt(i))) {
                str += cost_ticket.charAt(i);
            }
        }
        cost = Integer.parseInt(str);
    }

    public static void type_ticket() {
        for (int i = 0; i < cost_ticket.length(); i++) {
            if (cost_ticket.charAt(i) == '(') {
                type_of_ticket = cost_ticket.substring(0, i);
                break;
            }
        }
    }

    public static void checking_baggage() {
        if (baggage.charAt(0) == 'Y') {
            baggage = "Yes";
            baggage_cost = 45;
        } else {
            baggage = "No";
            baggage_cost = 0;
        }
    }

    public static void data_time() {
        for (int i = 0; i < time.length(); i++) {
            if (time.charAt(i) == ' ') {
                date = time.substring(0, i);
                boarding_time = time.substring(i + 3, time.length());
                break;
            }
        }
    }

    public static void create_random_data() {
        Random rnd = new Random();
        flight = "";
        seat = "";
        gate = 1;
        for (int i = 0; i < 3; i++) {
            flight += (char) ('a' + rnd.nextInt(26));
        }
        for (int i = 0; i < 2; i++) {
            seat += Integer.toString(rnd.nextInt(1, 9));
        }
        for (int i = 0; i < 4; i++) {
            flight += Integer.toString(rnd.nextInt(9));
        }
        seat += (char) ('a' + rnd.nextInt(8));
        gate = rnd.nextInt(1, 20);
        flight = flight.toUpperCase();
        seat = seat.toUpperCase();
    }

    Ticket() {
        calc_cost();
        type_ticket();
        checking_baggage();
        data_time();
        create_random_data();

        frame.setTitle("Boarding Pass");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(550, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.add(label_boardpass);
        frame.add(label_flight);
        frame.add(label_boarding_time);
        frame.add(label_gate);
        frame.add(label_seat);
        frame.add(label_passenger);
        frame.add(label_from);
        frame.add(label_to);
        frame.add(label_date);
        frame.add(label_class);
        frame.add(label_baggage);

        frame.add(label_data_flight);
        frame.add(label_data_boarding_time);
        frame.add(label_data_gate);
        frame.add(label_data_seat);
        frame.add(label_data_passenger);
        frame.add(label_data_from);
        frame.add(label_data_to);
        frame.add(label_data_date);
        frame.add(label_data_class);
        frame.add(label_data_baggage);

        //Boarding pass label
        {
            label_boardpass.setBounds(0, 0, 550, 30);
            label_boardpass.setOpaque(true);
            label_boardpass.setBackground(new Color(42, 103, 219));
            label_boardpass.setForeground(Color.WHITE);
            label_boardpass.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 18));
        }
        //Flight label
        {
            label_flight.setBounds(50, 40, 50, 20);
            label_flight.setFont(new Font("Arial", Font.BOLD, 12));
        }
        //Boarding time label
        {
            label_boarding_time.setBounds(175, 40, 100, 20);
            label_boarding_time.setFont(new Font("Arial", Font.BOLD, 12));
        }
        //Gate label
        {
            label_gate.setBounds(350, 40, 50, 20);
            label_gate.setFont(new Font("Arial", Font.BOLD, 12));
        }
        //Seat label
        {
            label_seat.setBounds(450, 40, 50, 20);
            label_seat.setFont(new Font("Arial", Font.BOLD, 12));
        }

        //Passenger label
        {
            label_passenger.setBounds(30, 120, 120, 20);
            label_passenger.setFont(new Font("Arial", Font.BOLD, 12));
        }

        //From label
        {
            label_from.setBounds(30, 150, 50, 20);
            label_from.setFont(new Font("Arial", Font.BOLD, 12));
        }

        //Date label
        {
            label_date.setBounds(30, 180, 50, 20);
            label_date.setFont(new Font("Arial", Font.BOLD, 12));
        }

        //Class label
        {
            label_class.setBounds(350, 120, 70, 20);
            label_class.setFont(new Font("Arial", Font.BOLD, 12));
        }

        //To label
        {
            label_to.setBounds(280, 150, 50, 20);
            label_to.setFont(new Font("Arial", Font.BOLD, 12));
        }

        //Baggage label
        {
            label_baggage.setBounds(280, 180, 70, 20);
            label_baggage.setFont(new Font("Arial", Font.BOLD, 12));
        }
        //Data Labels

        //Flight data label
        {
            label_data_flight.setText(flight);
            label_data_flight.setBounds(30, 50, 150, 40);
            label_data_flight.setFont(new Font("Arial", Font.BOLD, 24));
        }
        //Boarding time data label
        {
            label_data_boarding_time.setText(boarding_time);
            label_data_boarding_time.setBounds(175, 50, 100, 40);
            label_data_boarding_time.setFont(new Font("Arial", Font.BOLD, 24));
        }
        //Gate data label
        {
            label_data_gate.setText(Integer.toString(gate));
            label_data_gate.setBounds(350, 50, 50, 40);
            label_data_gate.setFont(new Font("Arial", Font.BOLD, 24));
        }
        //Seat data label
        {
            label_data_seat.setText(seat);
            label_data_seat.setBounds(450, 50, 50, 40);
            label_data_seat.setFont(new Font("Arial", Font.BOLD, 24));
        }
        //Passenger data label
        {
            label_data_passenger.setText(name + "/" + surname);
            label_data_passenger.setBounds(150, 120, 200, 20);
            label_data_passenger.setFont(new Font("Arial", Font.BOLD, 16));
        }
        //From data label
        {
            label_data_from.setText(departure_place);
            label_data_from.setBounds(80, 150, 100, 20);
            label_data_from.setFont(new Font("Arial", Font.BOLD, 16));
        }
        //Date data label
        {
            label_data_date.setText(date);
            label_data_date.setBounds(80, 180, 100, 20);
            label_data_date.setFont(new Font("Arial", Font.BOLD, 16));
        }
        //Class data label
        {
            label_data_class.setText(type_of_ticket);
            label_data_class.setBounds(410, 120, 100, 20);
            label_data_class.setFont(new Font("Arial", Font.BOLD, 16));
        }
        //To data label
        {
            label_data_to.setText(arrival_place);
            label_data_to.setBounds(320, 150, 100, 20);
            label_data_to.setFont(new Font("Arial", Font.BOLD, 16));
        }
        //Baggage data label
        {
            label_data_baggage.setText(baggage);
            label_data_baggage.setBounds(350, 180, 70, 20);
            label_data_baggage.setFont(new Font("Arial", Font.BOLD, 16));
        }
    }
}

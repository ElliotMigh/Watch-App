import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static java.lang.Thread.*;

public class Clock_Frame {

    //Create Frame for Watch app
    JFrame ClockFrame = new JFrame("Elliot Digital Watch");

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel labelTime;
    JLabel labelDay;
    JLabel labelDate;
    String time;
    String day;
    String date;

    //constructor
    public Clock_Frame() {
        //for exit
        ClockFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockFrame.setResizable(false);
        //type of layout
        ClockFrame.setLayout(new FlowLayout());
        ClockFrame.setSize(350, 200);
        //*
        //set time format
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMM M dd, yyyy");
        labelTime = new JLabel();
        labelDay = new JLabel();
        labelDate = new JLabel();

        //set font
        labelTime.setFont(new Font("Verdana", Font.PLAIN, 50));
        labelDay.setFont(new Font("Ink Free", Font.PLAIN, 35));
        labelDate.setFont(new Font("Ink Free", Font.PLAIN, 25));

        //set foreground
        labelTime.setForeground(Color.GREEN);

        //set background
        labelTime.setBackground(Color.BLACK);
        labelTime.setOpaque(true);

        //add label on frame
        ClockFrame.add(labelTime);
        ClockFrame.add(labelDay);
        ClockFrame.add(labelDate);
        ClockFrame.setVisible(true);

        SetTimeAndDay();
    }

    public void SetTimeAndDay() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            day = dayFormat.format(Calendar.getInstance().getTime());
            date = dateFormat.format(Calendar.getInstance().getTime());
            //set time and day on label
            labelTime.setText(time);
            labelDay.setText(day);
            labelDate.setText(date);
        }
    }
}

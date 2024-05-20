//package college;

import java.util.Scanner;

public class question1 {
    private int hour;
    private int minute;
    private int second;

    // Constructor to initialize instance variables with values
    public question1(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Constructor to initialize instance variables with default values (0)
    public question1() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    // Method to take time as input in 24-hour format
    public void setTime24Format(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("Invalid time format. Please provide valid values.");
        }
    }

    // Method to display the time in AM/PM format
    public void displayTimeInAMPM() {
        String amPm;
        int hourInAmPm = hour % 12;
        if (hourInAmPm == 0) {
            hourInAmPm = 12;
        }

        if (hour < 12) {
            amPm = "AM";
        } else {
            amPm = "PM";
        }

        System.out.printf("%02d:%02d:%02d %s%n", hourInAmPm, minute, second, amPm);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the time in 24-hour format (HH:MM:SS):");
        String inputTime = scanner.nextLine();

        int hour = 0, minute = 0, second = 0;

    
            String[] timeParts = inputTime.split(":");
            if (timeParts.length == 3) {
                hour = Integer.parseInt(timeParts[0]);
                minute = Integer.parseInt(timeParts[1]);
                second = Integer.parseInt(timeParts[2]);
            } else {
                throw new NumberFormatException();
            }
        

        question1 timeObj = new question1();
        timeObj.setTime24Format(hour, minute, second);

        System.out.println("Time in AM/PM format:");
        timeObj.displayTimeInAMPM();

        scanner.close();
    }
}

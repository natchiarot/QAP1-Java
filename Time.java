import java.time.LocalTime;  // Represents a time.
import java.time.format.DateTimeFormatter;  // Formatter for displaying and parsing date-time objects.

public class Time {

    // Private instance variables.
    private int hour;
    private int minute;
    private int second;

    // LocalTime instance represents the time, storing the hour, minute and second components.
    private LocalTime lt;

    // Constructor to initialize a Time object with hour, minute and second.
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        updateLocalTime();
    }

    // Getter method to retrieve hour individually.
    public int getHour(){
        return lt.getHour();
    }

    // Getter method to retrieve minute individually.
    public int getMinute(){
        return lt.getMinute();
    }

    // Getter method to retrieve second individually.
    public int getSecond(){
        return lt.getSecond();
    }

    // Setter method to update hour individually.
    public void setHour(int hour){
        this.hour = hour;
        updateLocalTime();
    }

    // Setter method to update minute individually.
    public void setMinute(int minute){
        this.minute = minute;
        updateLocalTime();
    }

    // Setter method to update second individually.
    public void setSecond(int second) {
        this.second = second;
        updateLocalTime();
    }

    // Method to set the time.
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        updateLocalTime();
    }

    // Method that goes to the next second and updates the LocalTime.
     public int nextSecond(){
        this.second++;
        updateLocalTime();
        return this.second;
        }
    
    // Method that goes to the previous second and updates the LocalTime.
    public int previousSecond(){
        this.second--;
        updateLocalTime();
        return this.second;
    }

    // Helper method to update the LocalTime instance.
    private void updateLocalTime() {
        this.lt = LocalTime.of(hour, minute, second);
    }

    // Method to convert the time to a formatted string.
    public String toString() {

       // Formats with the pattern "HH:mm:ss".
       DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");

       // Formats LocalTime instance to a string and returns it.
       return lt.format(formatTime);
}
}
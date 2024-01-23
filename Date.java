import java.time.LocalDate;  // Represents a date.
import java.time.format.DateTimeFormatter;  // Formatter for displaying and parsing date-time objects.

public class Date {

    // Private instance variables.
    private int day;
    private int month;
    private int year;

    // Initializing LocalDate.
    private LocalDate ld;

    // Constructor to initialize a Date object with day, month and year.
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        // Initializing ld with the LocalDate object.
        this.ld = LocalDate.of(year, month, day);
    }

    // Getter method to retrieve day individually.
    public int getDay(){
        return day;
    }

    // Getter method to retrieve month individually.
    public int getMonth(){
        return month;
    }

    // Getter method to retrieve year individually.
    public int getYear(){
        return year;
    }

    // Setter method to update day individually.
    public void setDay(int day){
        this.day = day;
    }

    // Setter method to update month individually.
    public void setMonth(int month) {
        this.month = month;
    }

    // Setter method to update year individually.
    public void setYear(int year) {
        this.year = year;
    }

    // Method to set date.
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Method to convert the date to a formatted string.
    public String toString() {

        // Formats with the pattern "dd/MM/yyyy".
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formats LocalDate instance to a string and returns it.
        return ld.format(formatDate);
    }
}
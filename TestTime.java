public class TestTime {
    public static void main (String[]args){

    // Creating two Time objects with initial time values.
    Time t1 = new Time(21, 10, 15);
    Time t2 = new Time(10, 20, 25);
    
    // Going to the next second for t1.
    t1.nextSecond();

    // Going to the previous second for t2.
    t2.previousSecond();

    // Displaying the formatted time after the next second and previous second methods have been called on the Time objects. 
    System.out.println("Formatted Time 1 of next second: " + t1.toString());
    System.out.println("Formatted Time 2 of previous second: " + t2.toString());
    }
}

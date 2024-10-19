import java.time.LocalTime; // Having the time.
import java.util.Scanner;  // Enabling user to enter.

public class Main {
    public static void main(String[] args) {
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);
        Scanner Location = new Scanner(System.in);
        // Creating the scanner object.
        System.out.println("Enter Location: " + Location.next());
    }
}

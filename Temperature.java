import java.util.Scanner; // imports the Scanner class

public class Temperature {

    double fTemp;

    public Temperature () {
        Scanner sc = new Scanner(System.in); // creates Scanner object for user input
        System.out.println("Please enter the Fahrenheit temperature: ");
        fTemp = sc.nextDouble(); // instructs Scanner object to read the user's input as a double
    }

    double toKelvin() { // method to calculate user's Fahrenheit temperature to Kelvin
        double kTemp = ((fTemp + 459.67) * 5)/9; // F to K formula
        return kTemp;
    }

    double toCelsius() { // method to calculate user's Fahrenheit temperature to Celsius
        double cTemp = ((fTemp - 32) * 5)/9; // F to C formula
        return cTemp;

    }
}






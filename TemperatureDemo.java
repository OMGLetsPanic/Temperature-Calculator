public class TemperatureDemo { // created second class for main method

    public static void main(String[] args) {
        // constructs instance of Temperature object
        Temperature t = new Temperature();

        // new variable that calls upon toCelsius and toKelvin methods
        double tCTemp = t.toCelsius();
        double tKTemp = t.toKelvin();

        // prints final calculations in Print statements
        System.out.printf("Celsius temperature: %.2f", + tCTemp);
        System.out.printf("\nKelvin temperature: %.2f", + tKTemp);

    }
}

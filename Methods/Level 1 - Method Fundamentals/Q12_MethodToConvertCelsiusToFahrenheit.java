// Q12 — Method to Convert Celsius to Fahrenheit
// Create a method named convertToFahrenheit() that accepts temperature in Celsius and returns the 
// temperature in Fahrenheit.
public class Q12_MethodToConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.print("Temperature = "+convertToFahrenheit(41.2)+"F");
    }

    static double convertToFahrenheit(double celsius){
        return (celsius*(9.0/5))+32;
    }
}
// OUTPUT
// Temperature = 106.16000000000001F
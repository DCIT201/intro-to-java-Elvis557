import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

 
        System.out.println("Welcome to temperature Converter! ");
        System.out.println("Choose an option");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        //Get the user's choice
        System.out.println("Enter your choice (1 or 2): ");
        int option = input.nextInt();

        // Perform the conversion based on the option
        switch (option){
            case 1:
                System.out.println("Enter temperature in Celsius: ");
                double Celsius = input.nextDouble();
                double Fahrenheit = (Celsius * 9/5) + 32;
                System.out.printf("The temperature in Fahrenheit is: %.2f`F%n",Fahrenheit);
                break;

            case 2:
                System.out.println("Enter temperature in Fahrenheit: ");
                double fahrenheit = input.nextDouble();
                double celsius = (fahrenheit - 32) * 5/9;
                System.out.printf("The temperature in Celsius is: %.2f`C%n", celsius);
                break;

            default:
                System.out.println("Invalid choice. Please run the program again and choose 1 or 2 :)");
        }
        input.close();


    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

/*Calculator
1. Ask user to enter a number and validate
2. Ask user to select a symbol
3. Ask user to select another number  and validate 
4. Perfom calculation and print output to the user 
*/ 
public class Calculator {
    public static double add(double num1, double num2){
        double answer = num1 + num2;
        return answer;
    }

    public static double subtract(double num1, double num2){
        double answer = num1 - num2;
        return answer;
    }

    public static double multiply(double num1, double num2){
        double answer = num1 * num2;
        return answer;
    }

    public static double divide(double num1, double num2){
        double answer = num1 / num2;
        return answer;
    }

    public static void main(String [] args){
        //Scanner object to read user input
        try(Scanner myObject = new Scanner(System.in)) {
            double num1, num2 = 0;
            String sign = "";
            try{
            System.out.println("Enter number");
            // Try to read the first number form user 
            num1 = myObject.nextInt();
            //Handle invalid input
            } catch (InputMismatchException e){
                System.out.println("You entered an invalid number");
                return;
            }

            // Read the operation symbol
            System.out.println("Enter operation symbol");
            sign = myObject.next();

            try{
            System.out.println("Enter next number");
            // Try to read the next number form user 
            num2 = myObject.nextInt();
            //Handle invalid input
            }catch (InputMismatchException e){
                System.out.println("You entered an invalid number");
                return;
            }


            // Perform Calculations based on the operational symbol
            switch (sign){
                case "+" -> System.out.println(num1 + " + " + num2 + " = " + add(num1,num2));
                case "-" -> System.out.println(num1 + " - " + num2 + " = " + subtract(num1,num2));
                case "*" -> System.out.println(num1 + " * " + num2 + " = " + multiply(num1,num2));
                case "/" -> {
                    // Handle division by 0 
                    if (num2 == 0){
                        System.out.println("Cannot divide by 0");
                        break;
                    }
                    System.out.println(num1 + " /  " + num2 + " = " + divide(num1,num2));
                    }
                default -> System.out.println("Invalid operation symbol");
                }
        }
    }
    
}

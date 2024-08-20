import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator {
    public static void main(String [] args){
        try(Scanner myObject = new Scanner(System.in)) {
            int num1, num2 = 0;
            String sign = "";
            try{
            System.out.println("Enter the first number");
            num1 = myObject.nextInt();
            } catch (InputMismatchException e){
                System.out.println("You entered an invalid number");
                return;
            }

            System.out.println("Enter the the operation symbol");
            sign = myObject.next();

            try{
            System.out.println("Enter the second number");
            num2 = myObject.nextInt();
            }catch (InputMismatchException e){
                System.out.println("You entered an invalid number");
                return;
            }


            switch (sign){
                case "+" -> System.out.println(num1 + " +  " + num2 + " = " + (num1 + num2));
                case "-" -> System.out.println(num1 + " -  " + num2 + " = " + (num1 - num2));
                case "*" -> System.out.println(num1 + " *  " + num2 + " = " + (num1 * num2));
                case "/" -> {
                    if (num2 == 0){
                        System.out.println("Cannot divide by 0");
                    }
                    System.out.println(num1 + " /  " + num2 + " = " + (num1 / num2));
                    }
                default -> System.out.println("Invalid operation symbol");

                }
        }
    }
    
}

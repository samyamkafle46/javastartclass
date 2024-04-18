package lesson1CodingAssesments;

import java.util.Scanner;

/*
* Assessment 2
* */
public class SimpleCalculator {
    public static float total;
    public static float number1;
    public static float number2;

    public static void main(String[] args) {
        char redoOperations = 'N';
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter the First Number...");
            String firstNumber = input.nextLine();
            validateFloat(firstNumber);
            System.out.println("Enter the Second Number...");
            String secondNumber = input.nextLine();
            validateFloat(secondNumber);
            System.out.println("Enter the operation you want to perform (+,-,*,/)");
            String operatorSymbol = input.next();
            validateInputOperator(operatorSymbol);
            setNumbers(firstNumber,secondNumber);
            performCalculations(operatorSymbol);
            System.out.println("Result : " + total);
            System.out.println("Do you want to perform any other calculations ? Please Type Y for Yes or N for No !");
            char userRedoOperations = input.next().charAt(0);
            if (userRedoOperations == 'Y' || userRedoOperations == 'N') {
                redoOperations = userRedoOperations;
                input.nextLine();
            } else {
                System.out.println("Invalid Input!");
                System.exit(0);
            }
        } while(redoOperations == 'Y');

    }

    private static void setNumbers(String firstNumber, String secondNumber) {
        number1 = Float.parseFloat(firstNumber);
        number2 = Float.parseFloat(secondNumber);
    }

    private static void performCalculations(String operatorSymbol) {
        switch (operatorSymbol) {
            case "+" -> addition();
            case "-" -> substraction();
            case "*" -> multiplication();
            case "/" -> division();
        }
    }

    private static void division() {
        boolean cantDivide = (number2 == 0) ? true : false;
        if (cantDivide) {
            System.out.println("The dividing value cannot be 0");
            total = 0;
            System.exit(0);
        }
        total = (number1/number2);
    }

    private static void multiplication() {
        total = (number1*number2);
    }

    private static void substraction() {
       total = (number1-number2);
    }

    private static void addition() {
        total = (number1+number2);
    }

    private static void validateFloat(String numericValue) {
        try{
            Float.parseFloat(numericValue);
        } catch(NumberFormatException e) {
            System.out.println("Invalid Value Provided! The value Should be a numeric value");
            System.exit(0);
        }
    }

    public static void validateInputOperator(String operatorSymbol) {
        // Check if the operator symbol is valid
        if (!isValidOperator(operatorSymbol)) {
            System.out.println("Invalid operator symbol. Please enter +, -, *, or /");
            System.exit(0);
        }

    }

    public static boolean isValidOperator(String operatorSymbol) {
        return operatorSymbol.equals("+") || operatorSymbol.equals("-") || operatorSymbol.equals("*") || operatorSymbol.equals("/");
    }
}

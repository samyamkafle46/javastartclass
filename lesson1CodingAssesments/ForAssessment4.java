package lesson1CodingAssesments;

import java.util.Scanner;

public class ForAssessment4 {
    /*
    * Note : Armstrong number is a number whose summation of the individual number is equal to the number itself.
    * Eg: 125 = (1^3)+(2^3)+(5^3) should be equal to 125 if not then it is not an armstrong number
    * 153 is an Armstrong number because (1^3)+(5^3)+(3^3) = (1+125+27) = 153
    *
    * `Prime Number` : the sum of all the positive divisors of the number (excluding the number itself) is equal to the number.
    * eg : 6 is a perfect number because its proper divisors are 1, 2, and 3, and  1+2+3=6.
    * 8 is not a perfect number because : it's proper divisors are : 1, 2, 4 and the sum is 1+2+4 = 7 which is not equal to the number so it is not a perfect number.
    *
    * */

    private static Scanner scanner = new Scanner(System.in);
    private static int userChoice;
    private static int userInputForLoop;
    private static String output = "";
    private static int total = 0;


    public static void main(String[] args) {
        System.out.println("Welcome to the loop demonstration program!!!");
        System.out.println("---------------------------------------------");
        System.out.println("Please Select the Operation Number you want to execute from the provided list");
        getProgramDetails();
        setProgramChoice();
        setUserInputNumber();
        performOperation();
        System.out.println("---------------------------------------------------");
        System.out.println("The desired Output Is:");
        System.out.println(output);
    }

    private static void performOperation() {
        switch (userChoice) {
            case 1,9 -> printNaturalNumbers();
            case 2,3,4,5 -> printGeneralOddEvenProblem();
            case 6,7,8 -> performGeneralInNumberCalculations();
            case 10,11,12 -> primeNumbersGeneralFunction();
        }
    }

    private static void primeNumbersGeneralFunction() {
        /*
        10 : Java program to check whether a given number is Prime or not using
            for loop.
            if the number is divisible by 1 and itself only then it is a prime number else it is not a prime number
        11. Java program to print all Prime numbers between 1 to n using for loop.
        12. Java program to find sum of all prime numbers between 1 to n using
            for loop.
        */
        if (userChoice == 10) {
            checkIfNumberIsPrime();
        } else if (userChoice == 11) {
            getNumbersInTheRangeIfPrime(false);
        } else if (userChoice == 12) {
            getNumbersInTheRangeIfPrime(true);
        }
    }

    private static void getNumbersInTheRangeIfPrime(boolean needSum) {
        int sum = 0;
        for (int j = 2; j <= userInputForLoop; j++) {
            boolean isPrime = true;
            for (int i=2; i<=Math.sqrt(j);i++ ) {
                if (j % i == 0) {
                   isPrime = false;
                   break;
                }
            }
            if (isPrime) {
                if (needSum) {
                    sum += j;
                } else {
                    if  (j > 2) {
                        output += ",";
                    }
                    output += j;
                }

            }
        }
        if (needSum)
            output = String.valueOf(sum);

    }

    private static void checkIfNumberIsPrime() {
        output = "The given number is a prime number";

        if(userInputForLoop <= 1){
            output = "The given number is not prime";
        }
        // since the prime number is divisible by itself and 1 we can start the loop from the index 2
        for (int i=2; i<=Math.sqrt(userInputForLoop);i++ ) {
            if (userInputForLoop % i == 0) {
                // it is not a prime number since it is divisible by any other number
                output = "The given number is not a prime number";
            }
        }
    }

    private static void performGeneralInNumberCalculations() {
        if (userChoice == 6) {
            multiplyGivenNumber();
        } else if (userChoice == 7) {
            getDigitCount();
        } else {
            getSumOfDigits();
        }
    }

    private static void getSumOfDigits() {
        String enteredNumberString = Integer.toString( userInputForLoop) ;
        int sum = 0;
        for (int i = 0; i< enteredNumberString.length(); i++ ) {
            char individualNumber = enteredNumberString.charAt(i);
            int individualNumberToInt = Character.getNumericValue(individualNumber);
            sum += individualNumberToInt;
        }
        output = "The Sum of the provided number is : " + sum ;
    }

    private static void getDigitCount() {
        int count = 0;
        String enteredNumberString = Integer.toString( userInputForLoop);
        for (int i = 0; i< enteredNumberString.length(); i++ ) {
            count++;
        }
        output = "The Count is : " + count ;

    }

    private static void multiplyGivenNumber() {
        System.out.println("Multiplication Table for " + userInputForLoop + " is:");
        for (int i = 1; i<=10; i++) {
            System.out.println(userInputForLoop + " * " + i + " = " + userInputForLoop*i);
        }
    }

    // Methods used for Q1-Q5
    private static void printGeneralOddEvenProblem() {
        if (userChoice == 2) {
            getAllEvenNumberInRange();
        } else if (userChoice == 3) {
            getAllOddNumberInRange();
        } else if (userChoice == 4) {
            getAllEvenNumberInRangeSum();
        } else {
            getAllOddNumberInRangeSum();
        }
    }
    private static void getAllEvenNumberInRangeSum() {
        for (int i = 1; i<= userInputForLoop; i++){
            if ( i % 2 == 0) {
               total += i;
            }
        }
        output = String.valueOf(total);
    }
    private static void getAllOddNumberInRangeSum() {
        for (int i = 1; i<= userInputForLoop; i++){
            if ( i % 2 != 0) {
                total += i;
            }
        }
        output = String.valueOf(total);
    }

    private static void getAllEvenNumberInRange() {
        for (int i = 1; i<= userInputForLoop; i++){
            if ( i % 2 == 0) {
                if  (i > 2) {
                    output += ",";
                }
                output += i;
            }
        }
    }
    private static void getAllOddNumberInRange() {
        for (int i = 1; i<= userInputForLoop; i++){
            if ( i % 2 != 0) {
                if  (i > 1) {
                    output += ",";
                }
                output += i;
            }
        }
    }

    private static void printNaturalNumbers() {
       char order = (userChoice == 9) ? 'D' : 'A';
       if (order == 'A') {
           for (int i = 1; i<= userInputForLoop; i++){
               if  (i > 1) {
                   output += ",";
               }
               output += i;
           }
       } else {
           for (int i = userInputForLoop; i >= 1; i--){
               if  (i < userInputForLoop) {
                   output += ",";
               }
               output += i;
           }
       }

    }

    private static void setUserInputNumber() {
        System.out.println("---------------------------------------");
        System.out.println("Please enter the number range");
        userInputForLoop = (scanner.hasNextInt()) ? scanner.nextInt() : 0;
        if (userInputForLoop < 0 ) {
            System.out.println("Invalid range provided. Please enter again!");
            setUserInputNumber();
        }
    }

    private static void setProgramChoice() {
        System.out.println("---------------------------------------");
        System.out.println("Please enter the choice");
        userChoice = (scanner.hasNextInt()) ? scanner.nextInt() : 0;
        if (userChoice == 0 || userChoice > 36) {
            System.out.println("Invalid operation number please enter the number again!");
            setProgramChoice();
        }
    }

    private static void getProgramDetails() {
        String options = "1. Java program to print all natural numbers from 1 to n using for loop.\n" +
                "2. Java program to print all even numbers between 1 to 100 using for\n" +
                "loop.\n" +
                "3. Java program to print all odd number between 1 to 100 using for loop.\n" +
                "4. Java program to print sum of all even numbers between 1 to n using\n" +
                "for loop.\n" +
                "5. Java program to print sum of all odd numbers between 1 to n using for\n" +
                "loop.\n" +
                "6. Java program to print multiplication of any number using for loop.\n" +
                "7. Java program to count the digits of a given number using for loop.\n" +
                "8. Java program to print the sum of digits of a given number using for\n" +
                "loop.\n" +
                "9. Java program to print all natural numbers in reverse order using for\n" +
                "loop.\n" +
                "10.Java program to check whether a given number is Prime or not using\n" +
                "for loop.\n" +
                "11.Java program to print all Prime numbers between 1 to n using for loop.\n" +
                "12.Java program to find sum of all prime numbers between 1 to n using\n" +
                "for loop.\n" +
                "13.Java program to check a given number is Armstrong or not using for\n" +
                "loop.\n" +
                "14.Java program to print all Armstrong numbers between 1 to n using for\n" +
                "loop.\n" +
                "15.Java program to check a given number is Perfect or not using for loop.\n" +
                "16.Java program to check all Perfect numbers between 1 to n using for\n" +
                "loop.\n" +
                "17.Java program to check a given number is Strong number or not using\n" +
                "for loop.\n" +
                "18.Java program to print all Strong numbers between 1 to n using for\n" +
                "loop.\n" +
                "19.Write a program in Java to swap first and last digit of number using for\n" +
                "loop.\n" +
                "20.Java program to swap values using third variable using for loop.\n" +
                "21.Java program to swap values without using third variable using for\n" +
                "loop.\n" +
                "22.Java program to calculate power of a number without using pow\n" +
                "method using for loop.\n" +
                "23.Java program to find power of a number without using pow method\n" +
                "using for loop.\n" +
                "24.Java program to calculate power of a number using pow method using\n" +
                "for loop.\n" +
                "25.Java program to check number is palindrome or not using for loop.\n" +
                "26.Java program to print Fibonacci series of a given number using for\n" +
                "loop.\n" +
                "27.Java program to print Fibonacci series of a given number using\n" +
                "recursion using for loop.\n" +
                "28.Java program to print the frequency of digits in given number using for\n" +
                "loop.\n" +
                "29.Write a program in Java to print ASCII character with values using for\n" +
                "loop.\n" +
                "30.Java program to print all alphabets from a to z using for loop.\n" +
                "31.Java program to print all uppercase alphabets using for loop.\n" +
                "32.Java program to print all lowercase alphabets using for loop.\n" +
                "33.Java program to print all factors of a number using for loop.\n" +
                "34.Java program to print HCF (GCD) of two numbers using for loop.\n" +
                "35.Java program to print LCM of two numbers using for loop.\n" +
                "36.Write a Java program to find all prime factors of a number using for\n" +
                "loop.";
        System.out.println(options);

    }
}

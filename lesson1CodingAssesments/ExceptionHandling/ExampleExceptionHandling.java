package lesson1CodingAssesments.ExceptionHandling;


import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleExceptionHandling {
    public static void main(String[] args) {
        Scanner numberValue = new Scanner(System.in);
        try {
            // the code that might get an error
            System.out.println("Enter a number");
            int num = numberValue.nextInt();
            double number = checkCustomException(num);

            int result = divideNumbers(20,1);
            System.out.println("After the divide operation the Output is: " + result);
            // trying to open a file which might not exist.
            File file = new File("xyz.txt");
            Scanner scanner = new Scanner(file);

            numberValue.close();
        } catch (ArithmeticException arithmeticException){
            // it's used to handle the exception that is caught.
            System.out.println("exception Trace: " + arithmeticException);
        } catch (FileNotFoundException fileNotFoundException) {
            // write the logic to handle the exception if occured.
            System.out.println("Reached to file not found catch block.");
            System.out.println("Exception Trace: "+ fileNotFoundException.getMessage());

        } catch (NumberFormatException numberFormatException) {
              // write the logic to handle the exception if occured.
            System.out.println("Exception Trace: "+ numberFormatException.getMessage());
        } catch (TestCustomException customException){
            System.out.println("Custom Error: " + customException);
        } catch (Exception exception) {
            // logic for handling such exception
            System.out.println("Trace :" + exception.getMessage());
        } finally {
            // it ts the block of code that works / executes despite the exception we get.
            System.out.println("Reached Finally.");
            numberValue.close();
            System.out.println("Closed Scanner!");
            // the finally block is used to clean up the task
        }
    }

    private static double checkCustomException(int num) throws TestCustomException {
        if(num == 0) {
            throw new TestCustomException("This is a custom exception messsage!");
        }
        return 10.33;
    }

    private static int divideNumbers(int divident, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divided by zero");
        }
        return divident/divisor;
    }
}

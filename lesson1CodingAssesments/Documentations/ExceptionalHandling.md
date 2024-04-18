Exceptional Handling
Exception : An exception is an error that happens in a code.
some of the exceptions are predicted and some are unpredicted.

Catching an exception:
An exception is caught first by creating a code block around the code that might get the error.

Try catch statements.

try {
//statements that might get the error

}
catch(<Type of exception class> e) {
// where code to handle the exception is written.

}


Eg:

public class ExceptionExample {
public static void main(String[] args) {

try {
int output = divide(5,0);
System.out.println("result" + output);

} catch (ArithmeticException e) {
// we handle the exception
System.out.println("Exception Message: " + e.getMessage());
// write some logic if any error occures.
log the errors in a file for debugging or keeping the issues track.

}
}
}

try, catch, finally, throw, throws

try {
//cantains the code that might give an exception / error
} catch(Exception e) {
// used to handle any exception that occurs.
} finally {
// the code that needs to be performed regardess of the exception that occurs is written in the finally block

}

try {
int result = divide(10,0);
} catch(Exception e) {
system.out.println(e.getMessage());
}
finally {
System.out.println("Need this block of code even if any exception occurs.");
}

output :
cannot be divided by 0
Need this block of code even if any exception occurs.


divide(int firstNumber, int DividingNumber){
if (DividingNumber == 0){
throw new ArithmeticException("Cannot be divided by 0 <message>");
}
return firstNumber/DividingNumber;
}

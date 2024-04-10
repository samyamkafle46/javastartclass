package lesson1CodingAssesments;

import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to convert the value from ? \n 1: C - F \n 2: F - C \n");
        int userOption = input.nextInt();
        System.out.println("Enter the temperature to be converted.");
        double temp = input.nextDouble();
        if (userOption == 1) {
            convertTemp(temp,true);
        } else {
            convertTemp(temp,false);
        }
    }
    private static void convertTemp(double temp, boolean isF) {
        System.out.println("Converting ...");
        double convertedValue = 0d;
        if (isF) {
            convertedValue = (9/5) * (temp+32);
        } else {
            convertedValue = (5/9) * (temp-32);
        }
        System.out.println("The converted value is : " + convertedValue );
    }
}

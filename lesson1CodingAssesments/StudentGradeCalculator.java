package lesson1CodingAssesments;

import java.util.Scanner;

/*
* Assessment 2
* */
public class StudentGradeCalculator {
    public static void main(String[] args) {
        /*
        * I need the marks for the subject which i need to find the average of.
        * a float for marks since that can come in a decimal point
        * ask for the user's name to keep track of the data.
        * find the average depending upon the marks provided.
        * output the result.
        */
        String studentName = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student name : \n");
        studentName = scanner.nextLine();

        float math = 0f;
        System.out.println("Enter the marks for math : \n");
        math = scanner.nextFloat();
        boolean valid = validateMarks(math);

        float science = 0f;
        System.out.println("Enter the marks for Science : \n");
        science = scanner.nextFloat();
        valid = validateMarks(science);

        float english = 0f;
        System.out.println("Enter the marks for english : \n");
        english = scanner.nextFloat();
        valid = validateMarks(english);

        if (!valid) {
            System.exit(0);
        }
        float average = (math + science + english) / 3f;
        String averageWithTwoDecimal = String.format("%.2f",average);
        System.out.println(studentName+" Mark Sheet");
        System.out.println("The average is : "+ averageWithTwoDecimal );
        checkGrade(average);
    }

    private static void checkGrade(float average) {
        char Grade;
        if (average >= 90 && average <= 100) {
            Grade = 'A';
        } else if (average >= 80 && average <= 89) {
            Grade = 'B';
        } else if (average >= 70 && average <= 79) {
            Grade = 'C';
        } else if (average >= 60 && average <= 69) {
            Grade = 'D';
        } else {
            Grade = 'F';
        }
        System.out.println("The grade is : " + Grade);
    }

    private static boolean validateMarks(float marks) {
        boolean valid = false;
        if(marks <= 100 || marks >= 0){
            valid = true;
        }
        return valid;
    }
}

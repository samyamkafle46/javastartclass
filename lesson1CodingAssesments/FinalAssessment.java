package lesson1CodingAssesments;

import java.util.Scanner;

/*
* Assessment 3
* Task 1: User Input and Output
* Prompt the user to enter their name and age.
* Read the user input for name (String) and age (int).
* Print a greeting message including the user's name and age.
* ------------------------------------------------------------
* Task 2: String Manipulation
* Given a string variable sentence, which contains a sentence with mixed cases, spaces, and punctuation.
* Convert the sentence to lowercase and print it.
* Count the number of vowels (a, e, i, o, u) in the sentence and print the count.
* ---------------------------------------------------------------
* Task 3: Float Calculation and Output Formatting
* Given two float numbers num1 and num2.
* Calculate the average of these two numbers.
* Print the average with exactly two decimal places.
* ----------------------------------------------------------------
* Character Analysis
* Given a character ch.
* Determine if the character is a vowel (a, e, i, o, u) or a consonant.
* Print the result.
* */
public class FinalAssessment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1: Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hello, " + name + "! \nYou are " + age + " years old.");

        // Task 2: String Manipulation
        System.out.println("----------------------------------------------");
        System.out.println("Enter the Mixed case text that needs to be lower cased: ");
        String sentence = scanner.nextLine();
        System.out.println("Got the text Processing.....");
        System.out.println("----------------------------------------------");
        System.out.println("Entered Text: \n" + sentence);

        String lowercaseSentence = sentence.toLowerCase();
        System.out.println("----------------------------------------------");
        System.out.println("Converted Text: \n" + lowercaseSentence);
        System.out.println("----------------------------------------------");

        int vowelCount = countVowels(lowercaseSentence);
        System.out.println("Vowel Count: " + vowelCount);

        // Task 3: Float Calculation and Output Formatting
        System.out.println("----------------------------------------------");
        System.out.println("Enter the two numbers;");

        float num1 = scanner.nextFloat(), num2 = scanner.nextFloat();
        float average = (num1 + num2) / 2;

//         System.out.printf("Task 3: Average: %s.2f%n", average);
        System.out.printf("Task 3: Average: "+ String.format("%.2f%n", average));

        // Task 4: Character Analysis
        System.out.println("----------------------------------------------");
        System.out.println("Enter the Character which is to be checked if it's a vowel.");
        char ch = scanner.next().charAt(0);
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
    }
    /*
     * Method which counts the number of vowels in the sentence
     * */
    public static int countVowels(String str) {
        // total count = 60
        // counter = 0 - 59
        // 2nd round : 0-1-2-3-....-59, 60
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char check = str.charAt(i);
            if (isVowel(check)) {
                count++;
            }
        }
        return count;
    }

    /*
    * Method which checks if the provided character is a vowel or not.
    * */
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);
        return (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u');
    }

}



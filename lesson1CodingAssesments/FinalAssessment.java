package lesson1CodingAssesments;

import java.util.Scanner;

public class FinalAssessment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1: Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello, " + name + "! \nYou are " + age + " years old.");

        // Task 2: String Manipulation
        String sentence = "THIS text Is TO BE CoNverTed iNtO LoWeRCaSE! ";
        String lowercaseSentence = sentence.toLowerCase();
        System.out.println("Task 2: Lowercase Sentence: " + lowercaseSentence);

        int vowelCount = countVowels(lowercaseSentence);
        System.out.println("Vowel Count: " + vowelCount);

        // Task 3: Float Calculation and Output Formatting
        float num1 = 10.5f, num2 = 8.3f;
        float average = (num1 + num2) / 2;
        System.out.printf("Task 3: Average: %.2f%n", average);

        // Task 4: Character Analysis
        char ch = 'X';
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



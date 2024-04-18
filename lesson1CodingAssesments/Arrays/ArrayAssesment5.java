package lesson1CodingAssesments.Arrays;

import java.util.Arrays;

public class ArrayAssesment5 {
    /*
    * Write a program which finds the average of the provided int array and print it then
    * check if the array which we found the average of has any duplicate values in it if so remove
    * the duplicate value but before deleting save the array of duplicate values and display it to the user.
    * once the process is done the array with no duplicate values in it reverse it and show the reversed array
    * then finally sort the array in ascending order / descending order and display the output.
    * */
/*
     you can define a static int array with multiple values say 10 int[10] original = {10,98,10,....}
     1st : find the average of the items in that array: -> sum of all values we have in the array / array size (10)
     2nd: define a new array which stores the duplicate value in the original array.
     -> from the main array check if the same number / value exists more than 1 time -> put the data in a new created array which is in our case duplicate.
     -> display the duplicate/ repeated values in the array and then delete the repeated value from the original array.
     3rd: original array -> we should not have any duplicate values ->
     4th : reverse the original array -> eg [10,12,98,0,3,5] {original array} -> [5,3,0,98,12,10] {should be printed}
     5th :  [5,3,0,98,12,10] use the reversed array to shot the elements in it in like ascending or descending order.
     aesc -> [0,3,5,10,12,98]
     desc -> [98,12,10,5,3,0]

*/
    public static void main(String[] args) {
        int[] originalArr = {10,5,8,97,0,4,5,6,77,23,8,75};
        int total = 0;
        for (int each: originalArr) {
            total += each;
        }
        double avg = getAvg(total,originalArr.length);
        System.out.println("Average for given array is : "+ avg);
        int[] duplicateValues = new int[originalArr.length];
        int duplicateIndex = 0;
        for (int i = 0; i < originalArr.length ; i++) {
            int value = originalArr[i];
            for (int j = i+1; j < originalArr.length ; j++) {
                if (value == originalArr[j]) {
                    duplicateValues[duplicateIndex++] = originalArr[j];
                    removeDuplicateFromOriginal(originalArr,j);
                    j--;
                }
            }
        }
//        duplicateValues = Arrays.copyOf(duplicateValues, duplicateIndex);
        originalArr = Arrays.copyOf(originalArr, originalArr.length - duplicateIndex);

        System.out.println("Original array after removing duplicates:");
        for (int val : originalArr) {
            System.out.print(val + " ");
        }
        System.out.println("\nDuplicate values array:");
        for (int val : duplicateValues) {
            System.out.print(val + " ");
        }
    }

    private static void removeDuplicateFromOriginal(int[] originalArr, int j) {
        for (int i = j; i < originalArr.length - 1; i++) {
            originalArr[i] = originalArr[i + 1];
        }
    }

    private static double getAvg(int total, int elementSize) {
        return total/elementSize;
    }
}

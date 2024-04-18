package lesson1CodingAssesments.Arrays;

public class StarPatternSimple {
    public static void main(String[] args) {
        /* Write a Java program that takes an integer n as input and prints the following star pattern but rather than directly printing it it should be stored in a one dimensional array.
        expected output :
        *****
        ****
        ***
        **
        *
        *
        **
        ***
        ****
        ***** */
        int number = 2;

        String[] starPattern = new String[number];
        String[] starPatternAdvanced = new String[number];

        for(int i=0;i<number;i++){
            starPattern[i] = "";
            for (int j=0;j<=i;j++){
                starPattern[i] += "* ";
            }
        }
        int counter = 0;
        for (int i = starPattern.length-1; i >= 0; i-- ) {
            starPatternAdvanced[counter] = starPattern[i];
            counter++;
        }


        for (String individual: starPatternAdvanced) {
            System.out.println(individual);
        }
        for (String individual: starPattern) {
            System.out.println(individual);
        }
    }
}

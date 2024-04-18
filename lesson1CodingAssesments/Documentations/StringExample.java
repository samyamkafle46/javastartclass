package lesson1CodingAssesments.Documentations;

public class StringExample {
    public static void main(String[] args) {
        String name = "Takeo";
        System.out.println("orignal text: " + name);

        // concatination
        // When the operation is being performed it creates a new string object
        name = name + " Tech"; // we are doing a concatination so what java does here is it creates a new string object and stores the modified content in the variable.
        System.out.println("Modified Text or string: " + name);


    }
}

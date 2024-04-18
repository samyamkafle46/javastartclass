package lesson1CodingAssesments.Documentations;

public class StringBuffers {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("xyz ");
        System.out.println("Initially => " + stringBuffer);

        // since it is a java class which gives us multiple functions or methods to work with so we can utilize those predefined functions in the class to achieve the output we need.
        // also string buffer won't create a new object as string when we make some changes in the function.
        stringBuffer.append("Hello World from takeo");

        System.out.println("Buffer Output after append : " + stringBuffer );

    }
}

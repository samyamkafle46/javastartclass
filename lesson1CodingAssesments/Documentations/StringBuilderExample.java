package lesson1CodingAssesments.Documentations;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello There! ");
        System.out.println("Previously : " + builder);

        builder.append(" How are you today! ");
        System.out.println("Modified: " + builder);

    }
}

package Head04_JCF.example19;

import java.util.Arrays;
import java.util.List;

public class LambdaPracticeRefactored {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.forEach(System.out::println);

        names.stream()
                .filter(s -> s.length() >= 5)
                .forEach(System.out::println);

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}

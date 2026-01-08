package Head04_JCF.example21;

import java.util.Arrays;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 8, 2, 9);

        numbers.stream()
                .sorted()
                .forEach(num -> System.out.print(num + " "));
    }
}

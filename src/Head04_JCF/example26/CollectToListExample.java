//collect문을 가장 많이 사용할 예정
package Head04_JCF.example26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToListExample {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("a", "b", "c", "b");

        List<String> result = data.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Result list: " + result);
    }
}

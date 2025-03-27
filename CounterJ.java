import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;

public class CounterJ {
    public static Map<Integer, Integer> countElementsClassic(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }
    public static Map<Integer, Long> countElementsStream(int[] array) { // Решение с помощью стрима
        return Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 3, 4, 5, 1, 5, 4};
        System.out.println("Classic approach: " + countElementsClassic(inputArray));
        System.out.println("Stream approach: " + countElementsStream(inputArray));
    }
}

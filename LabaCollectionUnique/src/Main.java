
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> array = Arrays.asList("black", "white", "red", "blue", "orange", "white", "purple", "pink", "car", "wish", "black", "airplane", "sky", "mars");


        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : array) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);

        }
        wordsCount.entrySet().forEach(System.out::println);

        System.out.println("Only unique");
        Set<String> unique = new HashSet<>(array);
        unique.forEach(System.out::println);


    }
}
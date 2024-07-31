package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("krishna", "nayak", "hello", "hi", "bye");
        Predicate<String> lengthGreaterThanFive = t -> t.length() >= 5;
        Predicate<String> concat = f -> f.contains("a");

        Predicate<String> combineCondition = lengthGreaterThanFive.and(concat);


        List<String> collect = list.stream().filter(combineCondition).collect(Collectors.toList());
        System.out.println(collect);

    }
}

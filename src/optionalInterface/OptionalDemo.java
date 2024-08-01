package optionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compareTo);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 6);
        List<Integer> emptyArr = Arrays.asList(); // List.of();

        Optional<Integer> max = findMax(list);
        Optional<Integer> maxOnEmpty = findMax(emptyArr);

        max.ifPresentOrElse(t -> System.out.println("Print value " + t),
                () -> System.out.println("Empty Array"));

        maxOnEmpty.ifPresentOrElse(t -> System.out.println("Print value " + t),
                () -> System.out.println("Empty Array"));

        System.out.println(max);
    }
}

package Filter_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

//    using this as a method reference
    public static boolean filterMethod(String name) {
        return name.startsWith("a");
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("krishna", "nayak", "ABC", "Ab");

        List<String> a = list.stream()
                .map(String::toLowerCase)
                .filter(Filter::filterMethod) // --> implementation of method reference.
                .collect(Collectors.toList());

        System.out.println(a);

    }
}

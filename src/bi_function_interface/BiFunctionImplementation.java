package bi_function_interface;

import java.util.function.BiFunction;

public class BiFunctionImplementation {
    public static void main(String[] args) {
        BiFunction<String, String, String> concat = (s1, s2) -> s1 + " "+ s2;

        String first = "krishna";
        String second = "nayak";

        String concate_string = concat.apply(first, second);
        System.out.println(concate_string);

    }
}

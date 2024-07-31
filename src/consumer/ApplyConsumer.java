package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ApplyConsumer {

    public static void Print(List<String> list) {
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("krishna", "nayak", "hello", "hi", "bye");

        Consumer<List<String>> consumer = ApplyConsumer::Print;
        consumer.accept(list);
    }
}

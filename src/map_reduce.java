import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class map_reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 2, 5);

        Integer sumofSquareOfInteger = list.stream()
                .filter(i -> i % 2 == 0).map(i -> i * i)
                .reduce(0, (subtotal, el) -> subtotal + el);


        System.out.println(sumofSquareOfInteger);

    }
}

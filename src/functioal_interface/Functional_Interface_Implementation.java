package functioal_interface;

import java.util.Arrays;
import java.util.List;

public class Functional_Interface_Implementation {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);

        IOperation op = list -> {
            int sum = 0;
            for (int i : list) sum += i;
            return sum;
        };

        int sum = op.sum(l);

        System.out.println("Sum: " + sum);
    }

}

package customFuntional;

@FunctionalInterface
public interface IOperation {

    int calcSquare(int number);

    default void print(int number) {
        int squareNumber = calcSquare(number);
        System.out.println("square of " + number + " is: " + squareNumber);
    }
}

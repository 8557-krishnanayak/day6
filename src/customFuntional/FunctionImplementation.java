package customFuntional;

public class FunctionImplementation {
    public static void main(String[] args) {
        IOperation operation = num -> num * num;

        operation.print(12);
    }
}

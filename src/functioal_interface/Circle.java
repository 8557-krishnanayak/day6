package functioal_interface;

public class Circle {
    public static void main(String[] args) {
        IShape iShape = r -> System.out.println(Math.PI * 2 * r * r);
        iShape.area(2);
    }
}

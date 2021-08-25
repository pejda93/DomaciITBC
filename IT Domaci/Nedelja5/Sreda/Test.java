public class Test {

    public static void main(String[] args) {

        Rectangle r = new Rectangle("Rect", 5, 4);
        Square s = new Square("Square", 5,5);
        Circle c = new Circle("Circ", 5);
        Triangle t = new Triangle("Triangle", 3, 3, 3);
        System.out.println(s);
        System.out.println(r);
        System.out.println(s);
        System.out.println(c);
        System.out.println(t);

    }
}
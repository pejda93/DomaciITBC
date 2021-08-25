public class Rectangle extends Shape {
    private double a, b;

    /*Constructor*/

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }
    /*Methods*/

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double circumference() {
        return 2*(a+b);
    }

    //Shape: {name}
    //Circumference: {circumference()}
    //Area: {area()}
    //-----------------
    @Override
    public String toString() {
        return super.toString();
    }
}
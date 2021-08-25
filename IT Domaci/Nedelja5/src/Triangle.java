public class Triangle extends Shape{
    private double a, b, c;

    /*Constructor*/

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /*Methods*/


    @Override
    public double circumference() {
        return a+b+c;
    }

    @Override
    public double area() {
        double s = 0.5*(a+b+c);
        double p = s*(s-a)*(s-b)*(s-c);

        return Math.pow(p,0.5);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
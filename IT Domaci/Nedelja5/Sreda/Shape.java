public abstract class Shape {
    private String name;

    /*Constructor*/

    public Shape(String name) {
        this.name = name;
    }

    /*Methods*/
    public abstract double circumference();

    public abstract double area();

    //Shape: {name}
    //Circumference: {circumference()}
    //Area: {area()}
    //-----------------
    @Override
    public String toString() {
        return "Shape: "+this.name+"\n"+
                "Circumference: "+ circumference()+"\n"+
                "Area: "+ area();
    }


}
package Shape;

public class Rectangle implements Shape{
    private double height;
    private double width;

    public Rectangle(double h, double w){
        this.height = h;
        this.width = w;
    }

    @Override
    public double area(){
        return height * width;
    }
}

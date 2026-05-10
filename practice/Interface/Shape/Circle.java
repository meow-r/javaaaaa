package Shape;

public class Circle implements Shape{
    private double r;

    @Override
    public double area(){
        return Math.PI * r * r;
    }

    public Circle(double r){
        this.r = r;
    }
}
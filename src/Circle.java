import static java.lang.Math.*;

public class Circle {
    private Double radius;

    public Circle(){
        this(1.0);

    }//no arg ctor
    public Circle(Double radius){
        this.radius = radius;
    }//end ctor

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    public double Circumference(){
        return 2* PI +radius;
    }
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }
}

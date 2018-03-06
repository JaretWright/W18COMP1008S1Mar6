package w18comp1008s1mar6;

/**
 *
 * @author JWright
 */
public class Circle implements TwoDimensionalShape
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    
    
    @Override
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    
}

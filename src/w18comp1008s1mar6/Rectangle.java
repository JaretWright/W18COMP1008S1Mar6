package w18comp1008s1mar6;

/**
 *
 * @author JWright
 */
public class Rectangle implements TwoDimensionalShape
{
    private double width, height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }
    

    @Override
    public double getArea()
    {
        return width * height;
    }
    
}

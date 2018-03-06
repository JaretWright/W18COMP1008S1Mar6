package w18comp1008s1mar6;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class W18COMP1008S1Mar6
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(15,20);
        
        ArrayList<TwoDimensionalShape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        
        for (TwoDimensionalShape shape:shapes)
            System.out.printf("Shape class: %s, area: %.1f cm squared%n",
                                            shape.getClass(), shape.getArea());
    }
    
}

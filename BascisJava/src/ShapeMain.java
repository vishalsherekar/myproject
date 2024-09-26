import static Shapes.Circle.*;

import Shapes.Circle;

public class ShapeMain {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        
        //Circle.getPI();
        
        System.out.println("The PI VALUE is: " +  circle.PI);
        
        System.out.println("getPI() Value is: " +  Circle.getPI());
        
        
       // System.out.println("The area of the circle is: " + circle.getArea());
       // System.out.println("The circumference of the circle is: " + circle.getCircumference());
    }
}

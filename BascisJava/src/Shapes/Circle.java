package Shapes;

public class Circle {

    private double radius;
    
	public static float PI=3.14f;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public static float getPI() {
		return PI;
	}

	public static void setPI(float pI) {
		PI = pI;
	}


    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }
}

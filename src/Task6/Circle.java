package Task6;

public class Circle {
	private double radius;

    // 1. No-argument 
    public Circle() {
        radius = 1.0;  // default radius
    }

    // 2. one argument
    public Circle(double r) {
        radius = r;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter (optional, to check radius)
    public double getRadius() {
        return radius;
    }
}

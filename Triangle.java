// Triangle class
public class Triangle 
	extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	/** Construct default Triangle object */
	Triangle() {
		side1 = side2 = side3 = 1.0;
	}

	/** Parameterized constructor */
	Triangle(double side1, double side2, double side3) { 
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/** Get side1 */
	public double getSide1() {
		return side1;
	}

	/** Get side2 */
	public double getSide2() {
		return side2;
	}

	/** Get side3 */
	public double getSide3() {
		return side3;
	}

	/** Get area of this triangle */
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	/** Get perimeter of this triangle */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	/** String description of the triangle */
	public String toString() {
		return "Triangle output:\n" + 
    "side1 = " + side1 + " side2 = " + side2 +
			" side3 = " + side3;
	}
}
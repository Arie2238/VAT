package Domain;

public class Cone extends Shape {
	private double radius;
	private double height;


	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	/**
	 * Methode getHeight
	 * @return
	 */

	public double getHeight() {
		return height;
	}

	/**
	 * Methode getRadius
	 * @return
	 */

	public double getRadius() {
		return radius;
	}

	/**
	 * Methode setHeight
	 * @param height
	 */

	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Methode set Radius
	 * @param radius
	 */

	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * Methode CalculateVolume
	 * @return
	 */

	@Override
	public double calculateVolume() {
		// TODO - implement Cone.calculateVolume
		return 1.0 / 3.0 * Math.PI * radius * radius * height;
	}
}
package Domain;

public class Sphere extends Shape {
	private double radius;

	public Sphere(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String toString() {
		return this.getType() + " " + this.getRadius() + " (" + String.format("%.2f", this.calculateVolume()) + ")";
	}

	@Override
	public double calculateVolume() {
		// TODO - implement Sphere.calculateVolume
		return 3.0 / 4.0 * Math.PI * Math.pow(radius, 3);
	}
}


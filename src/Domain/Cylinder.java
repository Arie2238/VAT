package Domain;

public class Cylinder extends Shape {


	private double radius;
	private double height;


	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}
	public double getHeight() {
		return height;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setHeight(double height){
		this.height = height;
	}

	@Override
	public double calculateVolume() {
		// TODO - implement Cylinder.calculateVolume
		return 3.0 / 4.0 * Math.PI * radius * height;
	}
}
package Domain;

public class RectangularPrism extends Shape {

	private double length;
	private double width;
	private double height;

	public RectangularPrism(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeigth(double height) {
		this.height = height;
	}

	@Override
	public double calculateVolume() {
		// TODO - implement RecangularPrism.calculateVolume
		return length * width * height;
	}
}

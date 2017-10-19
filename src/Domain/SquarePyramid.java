package Domain;

public class SquarePyramid extends Shape{
	private double length;
	private double height;

	public SquarePyramid(double length, double height) {
		this.length = length;
		this.height = height;
	}

	public double getLength() {
		return this.length;
	}

	/**
	 * 
	 * @param length
	 */
	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return this.height;
	}

	/**
	 * 
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double calculateVolume() {
		// TODO - implement SquarePyramid.calculateVolume
		return length * length * height /3;
		//throw new UnsupportedOperationException();
	}

}
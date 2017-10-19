package Domain;

public abstract class Shape {

	private int id;

	public String getType() {
		return this.getClass().getSimpleName();
	}

	public abstract double calculateVolume();

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
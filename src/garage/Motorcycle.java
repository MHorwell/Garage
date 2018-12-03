package garage;

public class Motorcycle extends Vehicle {
	// Attributes
	private String model;

	// Constructors
	public Motorcycle(int vId, String vColour, String vManufacturer, String vModel) {
		super(vId, vColour, vManufacturer);
		this.model = vModel;
	}

	// method
	public int servicePrice() {
		return 200;
	}


}

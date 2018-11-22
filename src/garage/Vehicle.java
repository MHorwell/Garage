package garage;

public abstract class Vehicle {
	
	// Attributes
	private int id;
	private String colour;
	private String manufacturer;
	private int numberOfWheels;

	// Constructors
	public Vehicle(int vId, String vColour, String vManufacturer) {
		this.id = vId;
		this.colour = vColour;
		this.manufacturer = vManufacturer;
	}

	public Vehicle(int vID, String vColour) {
		this.id = vID;
		this.colour = vColour;
	}

	// Methods

}

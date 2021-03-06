package garage;

public abstract class Vehicle {
	
	// Attributes
	private int id;
	private String colour;
	private String manufacturer;

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
	public int returnID() {
		return this.id;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	public void setManufacturer(String input) {
		this.manufacturer = input;
	}
	
	public abstract int servicePrice();
	



}

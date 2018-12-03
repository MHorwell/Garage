package garage;

public class Car extends Vehicle {

	// Attributes
	private String model;

	// Constructors
	public Car(int vId, String vColour, String vManufacturer, String vModel) {
		super(vId, vColour, vManufacturer);
		this.model = vModel;
	}


	// Methods
	public int servicePrice() {
		return 300;
	}
	
	public String getmodel() {
		return this.model;
	}
	

}

package garage;

public class Bicycle extends Vehicle{
	//Attributes
	
	private String type;
	
	

	//Constructors
	public Bicycle(int vId, String vColour, String vManufacturer, String type) {
		super(vId, vColour, vManufacturer);
		this.type = type;
	}
	
	//Methods
	public int servicePrice() {
		return (20);
	}

}
	

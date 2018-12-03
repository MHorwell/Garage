package garage;

public class Bicycle extends Vehicle{
	//Attributes
	
	private String type;
	
	
	//Constructors
	public Bicycle(int vId, String vColour, String vManufacturer, String vType) {
		super(vId, vColour, vManufacturer);
		this.type = vType;
	}
	
	//Methods
	public int servicePrice() {
		return 20;
	}
	
	public String getType() {
		return this.type;
	}
	
}
	

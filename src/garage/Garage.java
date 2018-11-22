package garage;

import java.util.ArrayList;

public class Garage {
	public static void main(String args[]) {
	
	Car bVauxhall = new Car(003, "Black", "Vauxhall", "Agila");
	Bicycle SEBike = new Bicycle(004, "Blue", "SE Bikes", "BMX");
	ArrayList<Vehicle> garage = new ArrayList<Vehicle>();
	garage.add(bVauxhall);
	garage.add(SEBike);
	
		for(Vehicle V : garage) {
			
			System.out.println(V);
		}
			 
	}
}

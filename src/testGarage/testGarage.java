package testGarage;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import garage.Bicycle;
import garage.Car;

public class testGarage {
	
	@Test
	public void testCarModel() {
		Car testCar = new Car(004, "Blue", "Vauxhall", "Agila");
		assertEquals("Agila", testCar.getmodel());
	}
	
	public void testVehicleID() {
		Bicycle testBike = new Bicycle()
	}
	

}

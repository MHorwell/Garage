package testGarage;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import garage.Bicycle;
import garage.Car;

public class testGarage {
	
	Car testCar = new Car(004, "Blue", "Vauxhall", "Agila");
	
	@Test
	public void testCarModel() {
		assertEquals("Agila", testCar.getmodel());
	}
	
	@Test
	public void testBikeType() {
		Bicycle testBike = new Bicycle(001, "Blue", "Yamaha", "BMX");
				assertEquals("BMX", testBike.getType());
	}
	
	@Test
	public void testVColour() {
		assertEquals("Blue", testCar.getColour());
	}

}

package logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.CarCompany;
import model.PassengerCar;
import model.Truck;

public class PriceCalculatorTest {

	@Test
	public void testToCalculateTotalPrice() {

		// Arrange
		CarCompany carComp = new CarCompany();
		PassengerCar tiguan = new PassengerCar("Tiguan", 28, "SUV");
		Truck amarok = new Truck("Amarok", 32, 3.5);
		carComp.add(amarok);
		carComp.add(tiguan);

		PriceCalculator priceCalc = new PriceCalculator();

		// Act
		int result = priceCalc.calculatorTotalPrice(carComp);

		// Assert

		assertEquals(60, result);
	

	}

}

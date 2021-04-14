package model;

import java.util.ArrayList;
import java.util.List;

public class CarCompany {

	private List<AbstractCar> cars;

	public CarCompany() {
		cars = new ArrayList<AbstractCar>();
	}

	public void add(AbstractCar car) {
		cars.add(car);

	}

	public List<AbstractCar> getCars() {
		return cars;
	}

}
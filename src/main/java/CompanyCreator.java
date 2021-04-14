import model.CarCompany;
import model.ElectricCar;
import model.PassengerCar;
import model.Truck;

public class CompanyCreator {

	public CarCompany creatCarCompany() {
		
		PassengerCar rx = new PassengerCar("Lexus RX", 59750, "SUV");
		PassengerCar ls = new PassengerCar("Lexus LS500", 97800,  "Sedan");
		PassengerCar lc = new PassengerCar("Lexus LC", 107500, "Cupe");
		ElectricCar uxe = new ElectricCar("Lexus UX300e", 85000, "SUV", 55, 150);
		Truck hx = new Truck("Toyota Hillux", 29900, 3.5);
		
		
		CarCompany carCompany = new CarCompany();
		carCompany.add(rx);
		carCompany.add(ls);
		carCompany.add(lc);
		carCompany.add(uxe);
		carCompany.add(hx);
		
		return carCompany;
	}
	
}

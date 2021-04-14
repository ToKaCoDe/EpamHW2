import model.CarCompany;
import view.Printer;

public class MainApp {

	public static void main(String[] args) {

		
		
		CompanyCreator companyCreator = new CompanyCreator();; 
		
		
		
		
		CarCompany carComp = companyCreator.creatCarCompany();
		
		
		
		Printer printer = new Printer();
		printer.printPriceList(carComp);
		
		
		
		
		
		
		
	}

}

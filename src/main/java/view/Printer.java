package view;

import logic.PriceCalculator;
import model.CarCompany;

public class Printer {

	public void printPriceList(CarCompany company) {

		System.out.println("Model \t \t price (eur)");

		for (int i = 0; i < company.getCars().size(); i++) {

			String model = company.getCars().get(i).getModel();
			int price = company.getCars().get(i).getPrice();
			System.out.println(model + "\t" + price);
		}

		PriceCalculator priceCalc = new PriceCalculator();
		int total = priceCalc.calculatorTotalPrice(company);

		System.out.println("\nTotal price: " + total + (" eur"));

	}
}
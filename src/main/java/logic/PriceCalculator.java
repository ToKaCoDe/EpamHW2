package logic;

import model.CarCompany;

public class PriceCalculator {

	public int calculatorTotalPrice(CarCompany company) {
		int totalPrice = 0;

		for (int i=0; i<company.getCars().size(); i++) {
			totalPrice = totalPrice + company.getCars().get(i).getPrice();
			
		}
		
		return totalPrice;
	}

}

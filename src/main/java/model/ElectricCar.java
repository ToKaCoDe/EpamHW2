package model;

public class ElectricCar extends PassengerCar {

	private int bateryCapacity;
	private int enginePower;

	public ElectricCar(String model, int price, String bodyType, int bateryCapacity, int enginePower) {
		super(model, price, bodyType);
		this.bateryCapacity = bateryCapacity;
		this.enginePower = enginePower;
	}

	public int getBateryCapacity() {
		return bateryCapacity;
	}

	public void setBateryCapacity(int bateryCapacity) {
		this.bateryCapacity = bateryCapacity;
	}

	public int getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + bateryCapacity;
		result = prime * result + enginePower;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectricCar other = (ElectricCar) obj;
		if (bateryCapacity != other.bateryCapacity)
			return false;
		if (enginePower != other.enginePower)
			return false;
		return true;
	}

}

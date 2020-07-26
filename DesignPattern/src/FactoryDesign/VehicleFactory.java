package FactoryDesign;

public class VehicleFactory {

	public Vehicle getVehicle(String vehicleName) {

		if (vehicleName.equalsIgnoreCase("car"))
			return new Car();

		if (vehicleName.equalsIgnoreCase("plane"))
			return new Plane();

		return null;
	}
}

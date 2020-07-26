package FactoryDesign;



/**
 * It is an example of Factory design pattern. Factory design pattern is a creational pattern.

The Factory pattern is mostly used when:
i. We need to create objects but we don�t have the details of how they�re created.
ii. Usability and refactoring both need to be maintained for multiple subclasses.
iii. All objects need to go through the same creation process.
 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VehicleFactory vehicleFactory = new VehicleFactory();

		// get an object of Car class and set its values by method.
		Vehicle vehicle1 = vehicleFactory.getVehicle("car");
		vehicle1.set_num_of_passengers();
		vehicle1.set_num_of_wheels();
		vehicle1.has_gas();

		// print the values of Car
		System.out.println(vehicle1.toString());

		// get an object of Plane class and set its values by method.
		Vehicle vehicle2 = vehicleFactory.getVehicle("plane");
		vehicle2.set_num_of_passengers();
		vehicle2.set_num_of_wheels();
		vehicle2.has_gas();

		// print the values of Plane
		System.out.println(vehicle2.toString());
	}
}
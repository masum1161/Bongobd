package PrototypeDesign;

import java.util.Hashtable;

public class VehicleCache {

	  private static Hashtable<String, Vehicle> vehicleMap  = new Hashtable<>();

	    public static Vehicle getVehicle(String vehicleName) {
	        Vehicle cachedVehicle = vehicleMap.get(vehicleName);
	        return (Vehicle) cachedVehicle.clone();
	    }

	    public static void loadCache() {
	        Car car = new Car();
	        car.set_num_of_wheels(4);
	        car.set_num_of_passengers(4);
	        car.has_gas(true);
	        vehicleMap.put("car",car);

	        Plane plane = new Plane();
	        plane.set_num_of_wheels(14);
	        plane.set_num_of_passengers(550);
	        plane.has_gas(false);
	        vehicleMap.put("plane",plane);
	    }
	}

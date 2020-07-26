package PrototypeDesign;




/**
 * Here we can use Prototype design pattern to achieve the same goal. Prototype design 
 * also popular design pattern.
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

	        VehicleCache.loadCache();

	        Vehicle clonedVehicle1 = VehicleCache.getVehicle("car");
	        System.out.println(clonedVehicle1.toString());

	        Vehicle clonedVehicle2 = VehicleCache.getVehicle("plane");
	        System.out.println(clonedVehicle2.toString());
	    }


}

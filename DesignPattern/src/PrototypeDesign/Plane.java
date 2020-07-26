package PrototypeDesign;

public class Plane extends Vehicle {

    @Override
    public void set_num_of_wheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void set_num_of_passengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public void has_gas(boolean hasGas) {
        this.hasGas = hasGas;
    }
}
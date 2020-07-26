package FactoryDesign;

public class Plane implements Vehicle {
    @Override
    public int set_num_of_wheels() {
        return 14;
    }

    @Override
    public int set_num_of_passengers() {
        return 550;
    }

    @Override
    public boolean has_gas() {
        return false;
    }
}
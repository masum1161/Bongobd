package PrototypeDesign;

public abstract  class Vehicle implements Cloneable {
    protected int wheels, passengers;
    protected boolean hasGas;

    abstract void set_num_of_wheels(int wheels);
    abstract void set_num_of_passengers(int passengers);
    abstract void has_gas(boolean hasGas);

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", passengers=" + passengers +
                ", hasGas=" + hasGas +
                '}';
    }
}
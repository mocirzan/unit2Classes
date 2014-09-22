

/**
 * The Car class tracks the fuel remaining in the car
 * as it is driven based on the feul efficiency.
 * 
 * @author (Max Cirzan) 
 * @version (Version 1, 9/12/14)
 */
public class Car
{
    /** The fuel efficiency of this car measured in miles per gallon */
    private double fuelEfficiency;
    
    /** The number of gallons of fuel left in this car's tank */
    private double fuelInTank;

    /**
     * Constructor for a car of the specified fuel efficiency
     */
    public Car(double fuelEff)
    {
        this.fuelEfficiency = fuelEff;
        fuelInTank = 0;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        Specified number of gallons doesn't exceed tank capacity
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    gallons   number of gallons of fuel to add to this car's tank
     */
    public void addGas(double gallons)
    {
        this.fuelInTank = this.fuelInTank + gallons;
    }
    

    /**
     * The drive method updated this car's
     * tank based on the specified number of miles driven and this car's fuel efficiency
     *  
     *
     * @pre     The drive method updated this car
     * 
     * s tank based on the specified number of miles driven and this car's fuel efficiency
     *          (what the method assumes about the method's parameters and class's state)
     *          
     * @post    the specified number of miles doesn't consume more than the fuel in the cars tank
     * @param   miles      number of miles this car has driven
     * 
     */
    public void drive(double miles)
    {
        double gallonsBurned = miles / this.fuelEfficiency;
        this.fuelInTank = this.fuelInTank - gallonsBurned;
    }


    /**
     * Returns the number of gallons of fuel left in the car's tank
  
     * The number of gallons of fuel in the cars tank
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }

}


/**
 * An object of the class VendingMachine can hold soda, have the soda be bought,
 * 
 * Max Cirzan) 
 * Version 1
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int totalCans;
    private int totalTokens;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int initialCans)
    {
        this.totalCans = initialCans;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void insertToken()
    {
        this.totalTokens += 1;
        this.totalCans -= 1;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @return  description of the return value
     */
    public void fillUp(int numberCans)
    {
        this.totalCans += numberCans;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @return  description of the return value
     */
    public int getTotalCans()
    {
        return this.totalCans;
    }
    
     /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @return  description of the return value
     */
    public int getTotalTokens()
    {
        return this.totalTokens;
    }
}

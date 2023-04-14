/**
 * Code Template Authors: Dr. Stephen Roehrig
 *                        and David G. Cooper
 * Purpose: A leaf class for Arithmetic evaluation
 *          representing a constant number
 */
public class Const extends Node {
    /** the constant value */
    private double value;
    /**
     * @param d the value to set the constant to.
     */
    public Const(double d) {
        value = d;
    }
    /**
     * @return the value of the constant.
     */
    public double eval() {
        return value;
    }
    public String toString() {
        return "" + value;
    }
}

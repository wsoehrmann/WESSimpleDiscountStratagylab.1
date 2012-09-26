/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author Wesley
 */
public class FourthOfJulySaleStratagy implements DiscountStrategy{
    
    private final double FIFTYPERCENTOFF = .50;
    
    @Override
    public double getDiscountInDollars(double price){
        return price * FIFTYPERCENTOFF;
    }
    
}

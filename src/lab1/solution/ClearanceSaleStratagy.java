/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author Wesley
 */
public class ClearanceSaleStratagy implements DiscountStrategy {
    
    private final double SEVENTYPERCENTOFF = .75;
    
    @Override
    public double getDiscountInDollars(double price){
        return price *SEVENTYPERCENTOFF ;
    }
    
}

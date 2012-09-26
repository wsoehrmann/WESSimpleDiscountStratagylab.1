/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author wsoehrmann
 */
public class ZeroDiscountStratagy implements DiscountStrategy {
    
    
    private final double ZEROPERCENTOFF = 0;
    
    @Override
    public final double getDiscountInDollars(double price){
        return price * ZEROPERCENTOFF;
    }
    
    
}

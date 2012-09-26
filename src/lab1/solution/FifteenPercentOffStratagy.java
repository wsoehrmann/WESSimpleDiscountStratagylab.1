/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author wsoehrmann
 */
public class FifteenPercentOffStratagy implements DiscountStrategy {
    private final double FIFTEENPERCENTOFF = .15;
    
    @Override
    public double getDiscountInDollars(double price){
        return price * FIFTEENPERCENTOFF;
    }
    
}

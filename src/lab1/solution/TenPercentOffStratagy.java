/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author wsoehrmann
 */
public class TenPercentOffStratagy implements DiscountStrategy{
    private final double TENPERCENTOFF = .10;

    @Override
    public final double getDiscountInDollars(double price) {
        return price * TENPERCENTOFF;
    }
    
}

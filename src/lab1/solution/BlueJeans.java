/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author Wesley
 */
public class BlueJeans extends Product {
    
     
    public BlueJeans() {
        this.setDiscount(new FourthOfJulySaleStratagy());
    }

    /**
     *
     * @param partName
     * @param partNumber
     * @param price
     */
    public BlueJeans(String partName, String partNumber, double price) {
        this.setPartName(partName);
        this.setPartNumber(partNumber);
        this.setPrice(price);
        
    }
    
}

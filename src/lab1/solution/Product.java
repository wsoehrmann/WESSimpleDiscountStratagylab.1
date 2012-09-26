package lab1.solution;

import lab1.*;

/**
 * This sample class and its sub-classes do not follow the Strategy Pattern.
 * Revise the program in the lab1.solution package to use the pattern correctly.
 * Just copy the classes from the current package to the target package, and
 * then revise.
 *
 * Use the word "Strategy" in your strategy pattern class.
 *
 * @author jlombardo
 */
public abstract class Product {

    private static final String UNDEFINED = "undefined";
    private String partName;
    private String partNumber;
    private String description;
    private double price;
    DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy ds) {
        discountStrategy = ds;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    private DiscountStrategy discount;

    public final String getPartName() {
        return partName;
    }

    public final void setPartName(final String partName) {
        if (partName == null || partName.length() == 0) {
            this.partName = UNDEFINED;
        }
        this.partName = partName;
    }

    public final String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(final String partNumber) {
        if (partNumber == null || partNumber.length() == 0) {
            this.partNumber = UNDEFINED;
        }
        this.partNumber = partNumber;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(final String description) {
        // No need to validate, optional
        this.description = description;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        if (price < 0) {
            this.price = 0;
        }
        this.price = price;
    }

    public double getDiscountInDollars() {
        return discount.getDiscountInDollars(price);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ratid6445
 */
public class Cookie extends DessertItem{

    // create the variables that are not in the super class
    private int pricePer12;
    private int number;
    
    public Cookie(String name, int number, int pricePer12) {
        // name from super Class
        super(name);
        // initialize the remaining variables
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    @Override
    public String toString() {
        // get the cookie name from the superClass
        String fromDessertItem = super.getName();
        // convert the cost form cents to dollars and cents
        String theCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // convert the cost for 12 cookies to dollars and cents
        double convertPricePer12 = pricePer12 * 0.01;
        // figure out the spacing between the cookie name and the cost
        String spaces = "";
        // create a for loop to insert the specific amount of spaces between the name and cost
        for (int i = 0; i < (DessertShoppe.RECEIPT_WIDTH - super.getName().length() - theCost.length()); i++) {
            // insert the spaces
            spaces = spaces + " ";
        }
        // return the format shown in the example
        return number + " @ $" + convertPricePer12 + " /dz" + "\n" + fromDessertItem + spaces + theCost;
    }

    @Override
    public int getCost() {
        // calculation to get the cost for the cookie
        double cost = (number / 12.0) * pricePer12;
        // round the double to two decimal places
        cost = Math.round(cost);
        // return the cost as a number 
        return (int)cost;
    }

}

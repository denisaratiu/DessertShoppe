/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ratid6445
 */
public class Candy extends DessertItem {

    // create the variables that are not in the super class
    private int pricePerLbs;
    private double weight;
    
    public Candy(String name, double weight, int pricePerLbs) {
        // inherit the name from the superclass
        super(name);
        // initialize the variables
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    @Override
    public String toString() {
        // inherit dessert name from the super class
        String fromDessertItem = super.getName();
        // convert cents to dollars and cents for the total price of the dessert
        String theCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // convert cents to dollars for the price per pound
        double convertPricePerLbs = pricePerLbs * 0.01;
        // insert the spaces for the recept width so the money can appear on the far side
        String spaces = "";
        // use a for loop to insert the specific amount of spaces
        for (int i = 0; i < (DessertShoppe.RECEIPT_WIDTH - super.getName().length() - theCost.length()); i++) {
            // output the spaces
            spaces = spaces + " ";
        }
        // output the specified format shown in example 
        return weight + " lbs. @ $" + convertPricePerLbs + " /lb." + "\n" + fromDessertItem + spaces + theCost;
    }
    
    @Override
    public int getCost() {
        // calculation to get the cost for the candy
        double cost = this.weight * this.pricePerLbs;
        // round the cost of the candy to two decimal points
        cost = Math.round(cost);
        // return the cost as a number
        return (int)cost;
    }
}

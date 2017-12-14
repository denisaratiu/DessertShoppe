/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ratid6445
 */
public class Sundae extends DessertItem{

    // create the variables in this class
    private int icCost;
    private String toppingName;
    private int toppingCost;
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        // get the name of the item from the super class
        super(icName);
        // initialize the variables
        this.icCost = icCost;
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    @Override
    public String toString() {
        // get the dessert name from the super class
        String fromDessertItem = super.getName();
        // convert cents to dollars and cents for the total price of the dessert
        String theCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // create the spaces inbetween the name and cost in order to get the format correct
        String spaces = "";
        // use a for loop to get the amount of spaces needed
        for (int i = 0; i < (DessertShoppe.RECEIPT_WIDTH - super.getName().length() - theCost.length()); i++) {
            // output the spaces needed
            spaces = spaces + " ";
        }
        // output the format shown on the example with all the variables included
        return toppingName + " Sundae with " +  "\n" + fromDessertItem + spaces + theCost;
    }

    @Override
    public int getCost() {
        // calculate the cost of the icecream with the toppings
        int cost = icCost + toppingCost;
        // round the cost to two decimal places
        cost = Math.round(cost);
        // return the cost
        return cost;
    }
}

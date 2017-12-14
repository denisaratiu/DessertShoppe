/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ratid6445
 */
public class IceCream extends DessertItem {

    // create the variables not in the super class
    private int cost;
    
    public IceCream(String name, int cost) {
        // inherit the name
        super(name);
        // initialize the varible cost
        this.cost = cost;
    }

    @Override
    public String toString() {
        // get the dessert name from the super class
        String fromDessertItem = super.getName();
        // convert cents to dollars and cents for the total price of the dessert
        String theCost = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // create the spaces between the cost and the ice cream name
        String spaces = "";
        // use a for loop to get the amount of spaces between 
        for (int i = 0; i < (DessertShoppe.RECEIPT_WIDTH - super.getName().length() - theCost.length()); i++) {
            // output the spaces
            spaces = spaces + " ";
        }
        // return the name of the dessert, the spaces and the cost just like in Mr.Lamont's example
        return fromDessertItem + spaces + theCost;
    }

    @Override
    public int getCost() {
        // return the cost
        return cost;
    }

}

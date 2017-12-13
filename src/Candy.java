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

    private int pricePerLbs;
    private double weight;
    
    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    @Override
    public String toString() {
        String fromDessertItem = super.toString();
        fromDessertItem += "\nDessertItem: Candy";
        return fromDessertItem;
    }

    @Override
    public int getCost() {
        // calculation to get the cost
        double cost = weight * pricePerLbs;
        cost = (int)Math.round(cost);
        return (int)cost;
    }
}

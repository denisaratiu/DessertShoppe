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

    private int cost;
    
    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public String toString() {
        String fromDessertItem = super.toString();
        fromDessertItem += "\nDessertItem: Ice Cream";
        return fromDessertItem;

    }

    @Override
    public int getCost() {
        
    }

}

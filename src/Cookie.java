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

    private int pricePer12;
    private int number;
    
    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    @Override
    public String toString() {
        String fromDessertItem = super.toString();
        fromDessertItem += "\nDessertItem: Cookie";
        return fromDessertItem;
    }

    @Override
    public int getCost() {
        
    }

}

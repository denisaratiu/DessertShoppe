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

    private int icCost;
    private String toppingName;
    private int toppingCost;
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName);
        this.icCost = icCost;
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    @Override
    public String toString() {
        String fromDessertItem = super.toString();
        fromDessertItem += "\nDessertItem: Sundae";
        return fromDessertItem;
    }

    @Override
    public int getCost() {
        
    }
}

package org.launchcode.java.exercises.Restaurant;

/**
 * Created by max on 5/2/17.
 */
public class MenuItem {

    private String item;
    private String category;
    private double price;
    private boolean itemNew;

    public MenuItem(String aItem, String aCategory, double aPrice, boolean aItemNew){
        this.item = aItem;
        this.category = aCategory;
        this.price = aPrice;
        this.itemNew = aItemNew;
    }

    public MenuItem(String aItem, String aCategory, double aPrice){
        this(aItem, aCategory, aPrice, true);
    }

    public void setItem(String aItem){
        this.item = aItem;
    }

    public void setCategory(String aCategory){
        this.category = aCategory;
    }

    public void setNew(boolean aItemNew){
        this.itemNew = aItemNew;
    }

    public String getItem(){
        return this.item;
    }

    public String getCategory(){
        return this.category;
    }

    public boolean isNew(){
        return this.itemNew;
    }
}

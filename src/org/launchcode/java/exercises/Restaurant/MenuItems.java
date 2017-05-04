package org.launchcode.java.exercises.Restaurant;

/**
 * Created by max on 5/2/17.
 */
public class MenuItems {

    private String item;
    private String category;
    private boolean itemNew;

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

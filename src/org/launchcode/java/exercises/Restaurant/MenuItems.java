package org.launchcode.java.exercises.Restaurant;

/**
 * Created by max on 5/2/17.
 */
public class MenuItems {

    private String item;
    private String category;
    private boolean isNew;

    public void setItem(String item){
        this.item = item;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setNew(boolean isNew){
        this.isNew = isNew;
    }

    public String getItem(){
        return this.item;
    }

    public String getCategory(){
        return this.category;
    }

    public boolean getNew(){
        return this.isNew;
    }
}

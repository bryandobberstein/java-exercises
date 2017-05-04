package org.launchcode.java.exercises.Restaurant;

/**
 * Created by max on 5/2/17.
 */

import java.util.Date;
import java.util.HashMap;

public class Menu {

    private Date date;
    private String updated;
    private HashMap<String, String> items;

    public void setUpdated(){
        this.updated = date.toString();
    }

    public String getUpdated(){
        return updated;
    }

    public void setItems(MenuItem aItem){
        items.put(aItem.getItem(), aItem.getCategory());
    }

    public HashMap getItems(){
        return items;
    }

}

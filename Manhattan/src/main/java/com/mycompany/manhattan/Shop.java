package com.mycompany.manhattan;

public class Shop extends Place {
    private ItemList items;
    private Time workingHours;

    public Shop(Location location, String name, ItemList items, Time workingHours) {
        super(location, name);
        this.setItems(items);
        this.setWorkingHours(workingHours);
    }

    public ItemList getItems() {
        return items;
    }

    public void setItems(ItemList items) {
        this.items = items;
    }

    public Time getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Time workingHours) {
        this.workingHours = workingHours;
    }
}

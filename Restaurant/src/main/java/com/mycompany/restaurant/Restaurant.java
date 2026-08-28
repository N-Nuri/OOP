package com.mycompany.restaurant;

/**
 *
 * @author Nuri
 */
public class Restaurant {
    private String name;
    private String cuisine;
    private String priceRange;
    private Intersection location;

    public Restaurant(String name, String cuisine, String priceRange, Intersection location) {
        this.name = name;
        this.cuisine = cuisine;
        this.priceRange = priceRange;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public Intersection getLocation() {
        return location;
    }
}

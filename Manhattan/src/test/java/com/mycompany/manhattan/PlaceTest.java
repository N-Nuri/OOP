package com.mycompany.manhattan;

import junit.framework.TestCase;

public class PlaceTest extends TestCase {

    public void testConstructor() {
        Location shopLocation = new Location("Vo Van Ngan", 1);
        Location museumLocation = new Location("Le Van Viet", 484);
        Location restaurantLocation = new Location("Vo Thi Sau", 12);

        Time shopWorkingHour = new Time(8, 30);
        Empty empty = new Empty();
        Items itemList = new Items("Co ca ngua", empty);

        Shop shop1 = new Shop(shopLocation, "Shop1", itemList, shopWorkingHour);
        Museum museum1 = new Museum(museumLocation, "Sieu Viet", 90000);
        Restaurant restaurant1 = new Restaurant(restaurantLocation, "Pho 24");

        assertTrue(shop1 instanceof Place);
        assertTrue(museum1 instanceof Place);
        assertTrue(restaurant1 instanceof Place);
    }
}

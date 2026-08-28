package com.mycompany.realestate;

import junit.framework.TestCase;

public class TestHouse extends TestCase {

    House ranch = new House("Ranch", 7, new Address(23, "Maple Street", "Brookline"), 375000);
    House colonial = new House("Colonial", 9, new Address(5, "Joye Road", "Newton"), 450000);
    House cape = new House("Cape", 6, new Address(83, "Winslow Road", "Waltham"), 235000);

    public void testHasMoreRooms() {
        assertTrue(colonial.hasMoreRooms(cape));
        assertFalse(cape.hasMoreRooms(ranch));
    }

    public void testInThisCity() {
        assertTrue(ranch.inThisCity("Brookline"));
        assertFalse(ranch.inThisCity("Newton"));
    }

    public void testSameCity() {
        assertFalse(ranch.sameCity(colonial));
        House anotherInBrookline = new House("Condo", 4, new Address(1, "Main St", "Brookline"), 300000);
        assertTrue(ranch.sameCity(anotherInBrookline));
    }
}

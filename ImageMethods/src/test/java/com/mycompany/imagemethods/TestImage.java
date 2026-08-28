package com.mycompany.imagemethods;

import junit.framework.TestCase;

public class TestImage extends TestCase {

    public void testIsPortrait() {
        assertTrue(new Image(100, 200).isPortrait());
        assertFalse(new Image(200, 100).isPortrait());
        assertFalse(new Image(100, 100).isPortrait());
    }

    public void testSize() {
        assertEquals(new Image(100, 200).size(), 20000);
        assertEquals(new Image(50, 50).size(), 2500);
    }

    public void testIsLarger() {
        Image big = new Image(1000, 1000);
        Image small = new Image(10, 10);
        assertTrue(big.isLarger(small));
        assertFalse(small.isLarger(big));
    }

    public void testSizeString() {
        assertEquals(new Image(100, 100).sizeString(), "small");
        assertEquals(new Image(100, 5000).sizeString(), "medium");
        assertEquals(new Image(2000, 2000).sizeString(), "large");
    }
}

package com.mycompany.coffeereceipt;

import junit.framework.TestCase;

public class TestCoffeeReceipt extends TestCase {
    public void testConstructor() {
	new CoffeeReceipt("Hawaiian Kona", 15.95, 100);
	new CoffeeReceipt("Ethiopian", 8.00, 1000);
	new CoffeeReceipt("Colombian Supreme ", 9.50, 1700);
    }
    public void testSellingCost() {
	CoffeeReceipt hk = new CoffeeReceipt("Hawaiian Kona", 15.95, 100);
	assertEquals(hk.sellingCost(), 1595.00, 0.001);
	CoffeeReceipt e = new CoffeeReceipt("Ethiopian", 8.00, 1000);
	assertEquals(e.sellingCost(), 8000.00, 0.001);
	CoffeeReceipt cs = new CoffeeReceipt("Colombian Supreme ", 9.50, 1700);
	assertEquals(cs.sellingCost(), 16150.00, 0.001);
    }
    
    public void testWeighsMore() {
	assertFalse(new CoffeeReceipt("Hawaiian Kona", 15.95, 100).weighsMore(200));
	assertFalse(new CoffeeReceipt("Ethiopian", 8.00, 1000).weighsMore(1000));
	assertTrue(new CoffeeReceipt("Columbian", 9.50, 200).weighsMore(100));
    }
    public void testIsCheaperThan() {
	assertTrue(new CoffeeReceipt("Hawaiian Kona", 15.95, 100).isCheaperThan(new CoffeeReceipt("Ethiopian", 20.00, 100)));
	assertFalse(new CoffeeReceipt("Hawaiian Kona", 15.95, 200).isCheaperThan(new CoffeeReceipt("Ethiopian", 15.95, 100)));
	assertFalse(new CoffeeReceipt("Hawaiian Kona", 15.95, 300).isCheaperThan(new CoffeeReceipt("Ethiopian", 8.00, 100))); 
    }
    public void testCostLessThan () {
        CoffeeReceipt hk = new CoffeeReceipt("Hawaiian Kona", 15.95, 100);
	CoffeeReceipt e = new CoffeeReceipt("Ethiopian", 8.00, 1000);
	CoffeeReceipt cs = new CoffeeReceipt("Colombian Supreme ", 9.50, 1700);
	assertTrue(hk.costsLessThan(e));
	assertFalse(e.costsLessThan(e));
	assertFalse(cs.costsLessThan(e));

    }

    // 3.1.6: kiem tra sellingCost() ap dung dung muc giam gia theo so luong
    public void testSellingCostBulkDiscount() {
	CoffeeReceipt noDiscount = new CoffeeReceipt("Bulk Coffee", 10.00, 4999);
	assertEquals(noDiscount.sellingCost(), 49990.00, 0.001);

	CoffeeReceipt discount10 = new CoffeeReceipt("Bulk Coffee", 10.00, 5000);
	assertEquals(discount10.sellingCost(), 45000.00, 0.001);

	CoffeeReceipt discount25 = new CoffeeReceipt("Bulk Coffee", 10.00, 20000);
	assertEquals(discount25.sellingCost(), 150000.00, 0.001);
    }
}

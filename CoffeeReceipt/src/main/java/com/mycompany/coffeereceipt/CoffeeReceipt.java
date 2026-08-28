package com.mycompany.coffeereceipt;

/**
 *
 * @author Nuri
 */
public class CoffeeReceipt {
    private String kind;
    private double pricePerPound;
    private double weight;

    public CoffeeReceipt(String kind, double pricePerPound, double weight) {
        this.kind = kind;
        this.pricePerPound = pricePerPound;
        this.weight = weight;
    }
    // 3.1.6: sellingCost co tinh giam gia theo so luong (bulk discount)
    // < 5000 pound: khong giam gia
    // 5000 - 20000 pound: giam 10%
    // >= 20000 pound: giam 25%
    public double sellingCost() {
        double fullPrice = this.pricePerPound * this.weight;
        if (this.weight >= 20000) {
            return fullPrice * 0.75;
        } else if (this.weight >= 5000) {
            return fullPrice * 0.90;
        } else {
            return fullPrice;
        }
    }
    
    public boolean weighsMore(double amount) {
		return this.weight > amount;
    }
    
    public boolean isCheaperThan(CoffeeReceipt that) {
		return this.pricePerPound < that.pricePerPound;
	}
    public boolean costsLessThan(CoffeeReceipt that) {
		return this.sellingCost() < that.sellingCost();
	}
}

// Refines the earlier Restaurant class (which took "food" as a constructor
// parameter) into a hierarchy: each subclass fixes its own cuisine instead
// of receiving it as an argument.
public abstract class Restaurant {
    protected String name;
    protected String priceRange;

    protected Restaurant(String name, String priceRange) {
        this.name = name;
        this.priceRange = priceRange;
    }
}

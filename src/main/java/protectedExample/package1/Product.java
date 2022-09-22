package protectedExample.package1;

public class Product {
    protected String name;

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }
}

package privateExample;

public class Product {
    private String name;

    public Product(){
    this.name = "unknown";
    }

    public Product(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

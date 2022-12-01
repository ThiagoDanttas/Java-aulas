public class Product {

    private String name;
    private Double price;

    // Constructors
    public Product(){}

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    // Methods
    public String getName(){
        return this.name;
    }

    public Double getPrice(){
        return this.price;
    }

    public String priceTag(){
        return this.name + "$ " + this.getPrice();
    }

}

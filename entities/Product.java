public class Product {

    private String name;
    private double price;
    private int quantity;


    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters & Setters
    public String getName(){return this.name;}

    public void setName(String name){this.name = name;}

    public double getPrice(){return this.price;}

    public void setPrice(double price){this.price = price;}

    public int getQuantity(){return this.quantity;}

    // methods
    public double totalValueInStock(){
        return this.price * this.quantity;
    }

    public  void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }


}

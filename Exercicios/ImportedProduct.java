public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){

        return this.getName()
                + "$ " + this.getPrice()
                + "(Customs fee: $ "
                + this.customsFee + ")";
    }
}

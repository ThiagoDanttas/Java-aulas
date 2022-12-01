package Exercicios;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class UsedProduct extends Product{

    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return this.getName()
                + "(used) $ "
                + this.getPrice()
                + "(Manufacture date:  "
                + sdf.format(manufactureDate)
                + ")";
    }



}

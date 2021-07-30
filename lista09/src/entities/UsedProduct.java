package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    SimpleDateFormat model = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    //Constructors
    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    //Getters ands setters
    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    //Methods

    @Override
    public String priceTag(){
        return super.getName()+ " (used) " + " $ "
                + super.getPrice()
                + " (Manufacture date:"+ model.format(manufactureDate)
                + " )";
    }


}

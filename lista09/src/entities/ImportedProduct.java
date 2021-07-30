package entities;

public class ImportedProduct extends Product{
    private Double customsFee;


    //Constructor
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    //Getters and setters
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return getPrice()+customsFee;
    }

    //Methods
    @Override
    public String priceTag(){
        return super.getName() + " $ "
                + totalPrice()
                + " (Customs fee: $" + customsFee
                + " )";

    }

}

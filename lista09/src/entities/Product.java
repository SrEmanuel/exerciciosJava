package entities;

public class Product {
    private String name;
    private Double price;

    //Constructor
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    //opcional
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    //Methods
    public String priceTag(){
        return (name + " $ " + price);
    }

}

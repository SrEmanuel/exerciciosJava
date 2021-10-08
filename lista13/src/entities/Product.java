package entities;

public class Product {
    private String name;
    private double unitPrice;
    private Integer quantity;

    public Product(String name, double price, Integer quantity) {
        this.name = name;
        this.unitPrice = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

}

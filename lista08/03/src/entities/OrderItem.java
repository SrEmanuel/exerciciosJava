package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    //toString


    @Override
    public String toString() {
        return product.getName() + ", " +
                product.getPrice() + ", " +
                "Quantity: " +
                quantity + "," +
                "Subtotal: " + subTotal();
    }

    //METHODS
    public Double subTotal(){
        return product.getPrice() * quantity;
    }

    //GETTER AND SETTERS
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price * quantity;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

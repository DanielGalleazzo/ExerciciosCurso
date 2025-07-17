public class OrderItem {
    protected int quantity;
    protected double price;
    protected Product product;

    public OrderItem (int quantity, double price){
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double subTotal (){
        return price * quantity;
    }

}

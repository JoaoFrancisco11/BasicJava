package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueStock(){
        return quantity*price;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
    return "Product: " + this.name + ", Price: $ " + String.format("%.2f", this.price) + ", Quantity: " + this.quantity
            + " units, " + "Total: $ " + String.format("%.2f", totalValueStock());
    }

}

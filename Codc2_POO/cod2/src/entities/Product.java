package entities;

public class Product {
    public String product;
    public double price;
    public int quantity;

    public double TotalValueStock(){
        return 0.0;
    }

    public void AddProducts(int quantity){
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }

}

package product.concreteProducts;

import product.Product;
import visitor.VisitorInterface;

public class Book implements Product {
    private double price;

    public Book(double price) {
        this.price = price;
    }

    @Override
    public void accept(VisitorInterface visitor){
        visitor.visitBook(this);
    }

    public double getPrice(){
        return price;
    }
}

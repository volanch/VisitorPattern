package product.concreteProducts;

import product.Product;
import visitor.VisitorInterface;

public class Clothes implements Product {
    private double price;

    public Clothes(double price) {
        this.price = price;
    }

    @Override
    public void accept(VisitorInterface visitor) {
        visitor.visitClothes(this);
    }

    public double getPrice() {
        return price;
    }
}

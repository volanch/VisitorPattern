package product.concreteProducts;

import product.Product;
import visitor.VisitorInterface;

public class Electronics implements Product {
    private double price;

    public Electronics(double price) {
        this.price = price;
    }

    @Override
    public void accept(VisitorInterface visitor) {
        visitor.visitElectronics(this);
    }

    public double getPrice() {
        return price;
    }
}

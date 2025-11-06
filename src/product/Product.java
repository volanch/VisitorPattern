package product;

import visitor.VisitorInterface;

public interface Product {
    void accept(VisitorInterface visitor);
}

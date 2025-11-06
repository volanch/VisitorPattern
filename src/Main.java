import product.Product;
import product.concreteProducts.Book;
import product.concreteProducts.Clothes;
import product.concreteProducts.Electronics;
import visitor.VisitorInterface;
import visitor.concreteVisitor.DiscountVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(1000);
        Clothes clothes = new Clothes(5000);
        Electronics electronics = new Electronics(20000);
        List <Product> products = new ArrayList<>();
        products.add(book);
        products.add(clothes);
        products.add(electronics);

        DiscountVisitor visitor = new DiscountVisitor();
        System.out.println("Prices of products with discount: ");
        for (Product product : products) {
            product.accept(visitor);
            System.out.println(visitor.getTotalPrice());
        }

    }
}
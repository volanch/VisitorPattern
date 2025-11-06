package visitor;

import product.concreteProducts.Book;
import product.concreteProducts.Clothes;
import product.concreteProducts.Electronics;

public interface VisitorInterface {
    void visitBook(Book book);
    void visitElectronics(Electronics electronics);
    void visitClothes(Clothes clothes);
}
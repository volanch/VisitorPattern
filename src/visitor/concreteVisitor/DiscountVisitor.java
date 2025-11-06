package visitor.concreteVisitor;

import product.concreteProducts.Book;
import product.concreteProducts.Clothes;
import product.concreteProducts.Electronics;
import visitor.VisitorInterface;

public class DiscountVisitor implements VisitorInterface {

    @Override
    public void visitBook(Book book){
        double bookPrice = book.getPrice();
        System.out.println("total book price: " + (bookPrice - (bookPrice * 0.10)));
    }

    @Override
    public void visitClothes(Clothes clothes){
        double clothesPrice = clothes.getPrice();
        System.out.println("total clothes price: " + (clothesPrice - (clothesPrice * 0.20)));
    }

    @Override
    public void visitElectronics(Electronics electronics){
        double electronicsPrice = electronics.getPrice();
        System.out.println("total electronics price: " + (electronicsPrice - (electronicsPrice * 0.15)));
    }
}

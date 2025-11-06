package visitor.concreteVisitor;

import product.concreteProducts.Book;
import product.concreteProducts.Clothes;
import product.concreteProducts.Electronics;
import visitor.VisitorInterface;

public class DiscountVisitor implements VisitorInterface {
    private double totalPrice;


    @Override
    public void visitBook(Book book){
        double bookPrice = book.getPrice();
        totalPrice += bookPrice - (bookPrice * 0.10);
        System.out.println("book visited");
    }

    @Override
    public void visitClothes(Clothes clothes){
        double clothesPrice = clothes.getPrice();
        totalPrice += clothesPrice - (clothesPrice * 0.20);
        System.out.println("clothes visited");
    }

    @Override
    public void visitElectronics(Electronics electronics){
        double electronicsPrice = electronics.getPrice();
        totalPrice += electronicsPrice - (electronicsPrice * 0.15);
        System.out.println("electronics visited");
    }

    public double getTotalPrice(){
        return totalPrice;
    }
}

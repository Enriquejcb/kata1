package software.ulpgc.kata1;

public class Main {
    public static void main(String[] args) {
        Shop bookShop = new Shop("Librería Vegueta", 12.5, 40);
        System.out.println(bookShop.getName() + " ha ingresado " + bookShop.calculateRevenue() + " €");
    }
}

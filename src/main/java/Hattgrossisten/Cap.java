package Hattgrossisten;

public class Cap extends Product {

    Cap(int id, String name, int price, String size, int grade, int quantity) {
        super(id, name, price, size, grade, quantity);

    }

    @Override
    public String toString() {
        return "name: " + name + ", price: " + price + ", size: " + size + ", grade: " + grade + ", category: "
                + quantity;
    }

}

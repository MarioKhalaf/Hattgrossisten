package Hattgrossisten;

public class Cap extends Product {

    Cap(String name, int price, String size, int grade, String category) {
        super(name, price, size, grade, category);

    }

    @Override
    public String toString() {
        return "name: " + name + ", price: " + price + ", size: " + size + ", grade: " + grade + ", category: "
                + category;
    }

}

package Hattgrossisten;

public class Product implements ProductInterface {

    public String name;
    public int price;
    public String size;
    public int grade;
    public String category;

    Product(String name, int price, String size, int grade, String category) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.grade = grade;
        this.category = category;

    }

    @Override
    public int price() {
        return this.price;

    }

    @Override
    public void size() {
        // generates the size

    }

    @Override
    public String name() {
        return this.name;

    }
}

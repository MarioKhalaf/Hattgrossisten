package Hattgrossisten;

public class Hat extends Product {

    Hat(String name, int price, String size, int grade, String category) {
        super(name, price, size, grade, category);

    }

    @Override
    public String name() {
        return super.name();
    }
}

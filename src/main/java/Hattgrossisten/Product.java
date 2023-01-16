package Hattgrossisten;

public class Product implements ProductInterface {

    public int id;
    public String name;
    public int price;
    public String size;
    public int grade;
    public int quantity;

    Product() {
    }

    Product(int id, String name, int price, String size, int grade, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.grade = grade;
        this.quantity = quantity;
        setGrade(grade);
    }

    @Override
    public int price() {
        return this.price;

    }

    @Override
    public int setGrade(int gradeInput) { //adds argument to the list of all ratings and then gets
        if (gradeInput > 0 && gradeInput <= 5) {
            this.gradeList.add(gradeInput);
            this.grade = (int)Math.round(calcListAverage(gradeList));
            return this.grade;
        }
        else {
            System.out.println("Please insert a rating between 1-5.");
            return 0;
        }
    }

    @Override
    public String name() {
        return this.name;

    }
}

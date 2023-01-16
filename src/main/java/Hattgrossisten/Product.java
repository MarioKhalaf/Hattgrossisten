package Hattgrossisten;

import java.util.ArrayList;
import java.util.List;

public class Product implements ProductInterface {

    public int id;
    public String name;
    public int price;
    public String size;
    public int grade;
    public int quantity;
    public List<Integer> gradeList = new ArrayList<Integer>();

    Product(int id, String name, int price, String size, int grade, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.grade = grade;
        this.quantity = quantity;
        setGrade(grade);
    }

    Product() {
    }

    @Override
    public void setName(String nameInput) {
        this.name = nameInput;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public int setGrade(int gradeInput) { // adds argument to the list of all ratings and then gets
        if (gradeInput > 0 && gradeInput <= 5) {
            this.gradeList.add(gradeInput);
            this.grade = (int) Math.round(calcListAverage(gradeList));
            return this.grade;
        } else {
            System.out.println("Please insert a rating between 1-5.");
            return 0;
        }
    }

    @Override
    public int getGrade() {
        return this.grade;
    }

    @Override
    public double calcListAverage(List<Integer> inputList) {
        int sum = 0;
        for (int i : inputList) {
            sum += i;
        }
        return inputList.size() > 0 ? sum / inputList.size() : 0;
    }

}

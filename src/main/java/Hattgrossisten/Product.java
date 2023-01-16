package Hattgrossisten;

import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

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
    }

    // @Override
    // public void setPrice(int newPrice) {
    //     this.price = newPrice;
    // }

    // @Override
    // public int getPrice() {
    //     return this.price;
    // }


    // @Override
    // public int getGrade() {
    //     return this.grade;
    // }

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

package Hattgrossisten;

import java.util.List;

public interface ProductInterface {

    void setName(String nameInput);

    String getName();

    void setPrice(int priceInput);

    int getPrice();

    void setGrade(int gradeInput);

    int getGrade();

    double calcListAverage(List<Integer> inputList);

    String toString();

}
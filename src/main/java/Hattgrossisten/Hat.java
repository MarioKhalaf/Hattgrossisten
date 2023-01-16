package Hattgrossisten;

import java.util.ArrayList;
import java.util.List;

public class Hat extends Product {
  
    public Hat(int id, String name, int price, String size, int grade, int quantity) {
        super(id, name, price, size, grade, quantity);

    }

    public Hat() {
    }

    @Override
    public String toString() {
        return "Name  " + name + ", Price: " + price + ", Size: " + size + ", Grade: " + grade + ", Quantity: "
                + quantity;
    }

    public List<Hat> addHats() {
        Hat a = new Hat(1, "Black Hat ", 50, "M", 3, 1);
        Hat b = new Hat(2, "Red Hat   ", 80, "L", 1, 8);
        Hat c = new Hat(3, "Blue Hat  ", 60, "S", 5, 7);
        Hat d = new Hat(4, "Yellow Hat", 90, "M", 4, 4);
        Hat e = new Hat(5, "Green Hat ", 75, "S", 3, 0);
        List<Hat> hatList = new ArrayList<>();
        hatList.add(a);
        hatList.add(b);
        hatList.add(c);
        hatList.add(d);
        hatList.add(e);
        return hatList;

    }

}

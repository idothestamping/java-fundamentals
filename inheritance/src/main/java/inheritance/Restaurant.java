package inheritance;

import java.util.List;
import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int star;
    private String price;

    public Restaurant(String name, int star, String price){
        this.name = name;
        this.star = star;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStar() {
        return star;
    }

    public String getPrice() {
        return price;
    }

    public String toString() {
        return String.format("A restaurant: %s with %s stars and price: %s", this.name, this.star, this.price);
    }

    public void addReview(String res, String rev) {

        ArrayList<Object> resReview = new ArrayList<>();

        System.out.println(res);
        System.out.println(rev);
    }
}



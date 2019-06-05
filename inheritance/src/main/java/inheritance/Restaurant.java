package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int rating;
    private String price;
    ArrayList<Review> reviews;

    public Restaurant(String name, int rating, String price){
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    public String getName() { return name; }

    public int getRating() { return rating; }

    public String getPrice() { return price; }

    public String toString() {
        return String.format("Restaurant: %s \n" +
                "Rating: %s \n" +
                "Price: %s", this.name, this.rating, this.price);
    }

    public void addReview(Review newReview) {

        if (newReview.getRestaurant() != this) newReview.setRestaurant(this);
        reviews.add(newReview);
        int newRating = 0;

        for (Review r : reviews) {
            newRating = newRating + r.getRating();
        }
        this.rating = newRating / reviews.size();
    }
}



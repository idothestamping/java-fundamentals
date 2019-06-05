package inheritance;

public class Review {
    public String body;
    public String author;
    public int rating;
    public Restaurant restaurant;

    public Review(String body, String author, int rating, Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.rating = rating;
        this.restaurant = restaurant;
        if (this.restaurant != null) restaurant.addReview(this);
    }

    // Get methods
    public String getBody() {
        return this.body;
    }

    public String getAuthor() {
        return author;
    }

    public int getRating() {
        return rating;
    }

    public Restaurant getRestaurant() { return restaurant; }

    // Set methods
    public void setRestaurant(Restaurant restaurant) {}

    public String toString() {
        return String.format("%s \n" +
                        "Review: %s \n" +
                        "Author: %s",
                this.getRestaurant(), this.getBody(), this.getAuthor());
    }
}
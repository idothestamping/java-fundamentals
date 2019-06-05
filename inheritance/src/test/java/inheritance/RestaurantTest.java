package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testRestaurantConstructorName() {
        Restaurant newRestaurant = new Restaurant("Korean BBQ", 5, "$$");
        assertEquals("Should create a restaurant named Korean BBQ",
                "Korean BBQ", newRestaurant.getName());
    }
    @Test
    public void testRestaurantConstructorStar() {
        Restaurant newRestaurant = new Restaurant("Korean BBQ", 5, "$$");
        assertEquals("Should have 5 rating", 5, newRestaurant.getRating());
    }
    @Test
    public void testRestaurantConstructorPrice() {
        Restaurant newRestaurant = new Restaurant("Korean BBQ", 5, "$$");
        assertEquals("Should have 2 dollar signs", "$$", newRestaurant.getPrice());
    }

    @Test
    public void testRestaurantToString() {
        Restaurant newRestaurant = new Restaurant("Korean BBQ", 5, "$$");
        assertEquals(
                "should return a string",
                "Restaurant: Korean BBQ \n" +
                        "Rating: 5 \n" +
                        "Price: $$",
                newRestaurant.toString());
    }

    @Test
    public void testAddReview() {
        Restaurant newRestaurant = new Restaurant("Dick's", 4, "$");
        Review newReview = new Review("best burgers", "doug", 5, newRestaurant);
        System.out.println(newRestaurant.reviews.get(0).toString());
        assertEquals(
                "should return a string",
                "Restaurant: Dick's \n" +
                        "Rating: 5 \n" +
                        "Price: $ \n" +
                        "Review: best burgers \n" +
                        "Author: doug",
                newRestaurant.reviews.get(0).toString());
    }
}

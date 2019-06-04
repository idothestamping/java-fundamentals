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
        assertEquals("Should have 5 stars", 5, newRestaurant.getStar());
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
                "A restaurant: Korean BBQ with 5 stars and price: $$",
                newRestaurant.toString());
    }

    @Test
    public void testAddReview() {
        Restaurant newRestaurant = new Restaurant("Dick's", 4, "$");
        Review newReview = new Review("best burgers", "doug", 5);
        newRestaurant.addReview(newRestaurant.toString(), newReview.toString());
    }
}

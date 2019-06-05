package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testReviewConstructorBody() {
        Restaurant restaurant = new Restaurant("Korean BBQ", 5, "$$");
        Review newReview = new Review("Bad Service", "Paolo", 1, restaurant);
        assertEquals("Body should equal expected", "Bad Service", newReview.getBody());
    }
    @Test
    public void testReviewConstructorAuthor() {
        Restaurant restaurant = new Restaurant("Korean BBQ", 5, "$$");
        Review newReview = new Review("Tasty", "Doug", 5, restaurant);
        assertEquals("Author name should equal expected", "Doug", newReview.getAuthor());
    }
    @Test
    public void testReviewConstructorRating() {
        Restaurant restaurant = new Restaurant("Korean BBQ", 5, "$$");
        Review newReview = new Review("Tasty", "Doug", 5, restaurant);
        assertEquals("Return int should equal expected", 5, newReview.getRating());
    }

    @Test
    public void testReviewToString() {
        Restaurant newrestaurant = new Restaurant("Korean BBQ", 5, "$$");
        Review newReview = new Review("Best service in time", "Doug", 5, newrestaurant);
        assertEquals(
                "should return a string",
                "Restaurant: Korean BBQ \n" +
                        "Rating: 5 \n" +
                        "Price: $$ \n" +
                        "Review: Best service in time \n" +
                        "Author: Doug",
                newrestaurant.reviews.get(0).toString());
    }
}

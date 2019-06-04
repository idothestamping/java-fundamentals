package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testReviewConstructorBody() {
        Review newReview = new Review("Bad Service", "Paolo", 1);
        assertEquals("Body should equal expected", "Bad Service", newReview.getBody());
    }
    @Test
    public void testReviewConstructorAuthor() {
        Review newReview = new Review("Tasty", "Doug", 5);
        assertEquals("Author name should equal expected", "Doug", newReview.getAuthor());
    }
    @Test
    public void testReviewConstructorStars() {
        Review newReview = new Review("Tasty", "Doug", 5);
        assertEquals("Return int should equal expected", 5, newReview.getStar());
    }

    @Test
    public void testReviewToString() {
        Review newReview = new Review("Best service in time", "Rilke", 5);
        assertEquals(
                "should return a string",
                "Best service in time \n" +
                        "Author: Rilke Stars: 5",
                newReview.toString());
    }
}
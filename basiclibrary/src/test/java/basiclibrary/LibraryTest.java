/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import org.junit.Before;
import org.junit.Test;
import static basiclibrary.Library.*;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testDiceRolls() {
        int[] result = roll(22);
        assertTrue("Dice rolled:", result.length == 22);
    }

    @Test
    public void testContainsDuplicates() {
        int[] inputArr = {66, 66, 58, 65, 71, 57, 60};
        assertTrue("Contain Duplicates.", containsDuplicates(inputArr));
    }

    @Test
    public void testNoDuplicates() {
        int[] inputArr = {66, 67, 58, 65, 71, 57, 60};
        assertFalse("Does not Contain Duplicates.", containsDuplicates(inputArr));
    }

    @Test
    public void testCalculateAvg() {
        int[] inputArr = {1, 2, 3, 4, 5, 6};
        double average = averageCalc(inputArr);
        assertTrue("Avg is: ", average == 3.5);
    }

    @Test
    public void testAverageCalcNestedArray() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        double average = averageCalcNestedArray(weeklyMonthTemperatures);
        assertEquals("LowsestAvg is: ", 57.0, average, 0.01);

    }

    @Test
    public void weatherData_testMethod(){
        Library library = new Library();

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        library.analyzeWeatherData(weeklyMonthTemperatures);

        assertEquals("High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69\n", outContent.toString() );
    }

    @Test
    public void tally_testToReturnMostVotesInTally() {
        Library library = new Library();

        List<String> votes = new ArrayList<>();

        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = library.tally(votes);

        assertTrue("The most tally is Bush", "Bush" == winner);
    }
}


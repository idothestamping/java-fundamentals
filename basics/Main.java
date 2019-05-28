import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
  public static void main (String[] args) {
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(1);
    clock();
  }

  // Pluralize function
  public static String pluralize(String word, int count) {
    String plural = word;
    if(count == 0 || count > 1){
      plural = word + "s";
    }
    return plural;
  }

  // Flipping Coins function
  public static void flipNHeads(int num){
    int flips = 0;
    int numOfHeads = 0;
    while(numOfHeads < num){
      double rand = Math.random();
      flips++;
      if (rand < 0.5) {
        System.out.println("tails");
        numOfHeads = 0;
      } else if (rand >= 0.5){
        System.out.println("heads");
        numOfHeads++;
      }
    }
    System.out.println("It took " + flips + " flips to flip " + num + " head in a row.");
  }

  // Clock function
  public static void clock() {
    int prevSec = 0;
    while(true){
      LocalDateTime now = LocalDateTime.now();
      int second = now.getSecond();
      String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      if(prevSec != second){
        System.out.println(time);
        prevSec = second;
      }
    }
  }
}

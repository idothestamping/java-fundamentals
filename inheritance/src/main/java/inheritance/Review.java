package inheritance;

public class Review {
    public String body;
    public String author;
    public int star;

    public Review(String body, String author, int star) {
        this.body = body;
        this.author = author;
        this.star = star;
    }

    public String getBody() {
        return this.body;
    }
    
    public String getAuthor() {
        return author;
    }

    public int getStar() {
        return star;
    }

    public String toString() {
        return String.format("Review: %s \n" +
                "Author: %s Stars: %s", this.body, this.author, this.star);
    }
}
public class Book {
    private String author;
    private String title;
    private int pageCount;

    public Book(String tAuthor, String tTitle, int tPages) {
        this.author = tAuthor;
        this.title = tTitle;
        this.pageCount = tPages;
    }

    public String getAuthor() {
        return this.author;
    }
    public String getName() {
        return this.title;
    }
    public int getPages() {
        return this.pageCount;
    }

    public String toString() {
        return this.author + ", " + this.title + ", " + this.pageCount + " pages";
    }
}

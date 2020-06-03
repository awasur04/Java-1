public class Book {
    private String name;
    private int pages;
    private int publicationYear;

    public Book(String tempName, int tempPages, int tempPubYear) {
        this.name = tempName;
        this.pages = tempPages;
        this.publicationYear = tempPubYear;
    }

    public int getPages() {
        return this.pages;
    }
    public int getPubYear() {
        return this.publicationYear;
    }
    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.publicationYear;
    }
}

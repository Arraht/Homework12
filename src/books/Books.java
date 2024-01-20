package books;


import authors.Author;

public class Books {
    private int year;
    private String author;

    public Books(Author author, int year) {
        this.year = year;
        this.author = author.getName();
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
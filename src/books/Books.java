package books;


import authors.Author;

public class Books {
    private int year;
    private Author author;
    private String name;

    public Books(Author author, String name, int year) {
        this.year = year;
        this.author = author;
        this.name = name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
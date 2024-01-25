package books;


import authors.Author;

import java.util.Objects;

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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
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

    public String toString() {
        return author + ", Название книги -- " + this.name + ", Год издания -- " + this.year;
    }

    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return year == books.year && Objects.equals(author, books.author) && Objects.equals(name, books.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
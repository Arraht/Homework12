package main;

import authors.Author;
import books.Books;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("John", "Dhou");
        Author authorTwo = new Author("Sarah", "Jein");
        Books book = new Books(author, 1965);
        Books bookTwo = new Books(authorTwo, 2000);
        System.out.println("Автор книги = " + author.getName() + ", год издания книги = " + book.getYear());
        System.out.println("Автор книги = " + authorTwo.getName() + ", год издания книги = " + bookTwo.getYear());
        author.setName("Ghost", "Rider");
        book.setYear(2015);
        System.out.println("Автор книги = " + author.getName() + ", год издания книги = " + book.getYear());
    }
}
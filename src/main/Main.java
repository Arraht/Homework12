package main;

import authors.Author;
import books.Books;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("John", "Dhou");
        Author authorTwo = new Author("Sarah", "Jein");
        Books book = new Books(author, "Song", 1965);
        Books bookTwo = new Books(authorTwo, "Sleep", 2000);
        System.out.println("Автор книги = " + book.getName() + ", "
                + author.getName() + ", год издания книги = " + book.getYear());
        System.out.println("Автор книги = " + bookTwo.getName() + ", "
                + authorTwo.getName() + ", год издания книги = " + bookTwo.getYear());
        author.setName("Ghost", "Rider");
        book.setYear(2015);
        book.setName("Time");
        System.out.println("Автор книги = " + book.getName() + ", "
                + author.getName() + ", год издания книги = " + book.getYear());
        author.setLastName("Gras");
        System.out.println("Автор книги = " + book.getName() + ", "
                + author.getLastName() + ", год издания книги = " + book.getYear());
                author.setFirstName("Jan");
        System.out.println("Автор книги = " + book.getName() + ", "
                + author.getFirstName() + ", год издания книги = " + book.getYear());
        book.setAuthor(authorTwo);
        System.out.println(book.getAuthor());
    }
}
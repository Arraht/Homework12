package program;

import authors.Author;
import books.Books;

import static print.Print.*;

import static comparison.comparison.comparison;

public class ProgramCode {
    public static void operationProgram() {
        Author author = new Author("John", "Dhou");
        Author authorTwo = new Author("Sarah", "Jein");
        Books book = new Books(author, "Song", 1965);
        Books bookTwo = new Books(authorTwo, "Sleep", 2000);
        printFullCode(book, author);
        printFullCode(bookTwo, authorTwo);
        author.setName("Ghost", "Rider");
        book.setYear(2015);
        book.setName("Time");
        printFullCode(book, author);
        author.setLastName("Gras");
        printCodeLastName(book, author);
        author.setFirstName("Jan");
        printCodeFirstName(book, author);
        Author authorThree = new Author("Александр", "Третьяков");
        Books bookThree = new Books(authorThree, "Космос", 2023);
        printAuthor(authorThree);
        printBook(bookThree);
        authorThree.setName("Rita", "Jein");
        bookTwo.setName("Космос");
        comparison(bookTwo, bookThree, authorTwo, authorThree);
    }
}

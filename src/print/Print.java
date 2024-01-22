package print;

import authors.Author;
import books.Books;

public class Print {
    public static void printFullCode(Books book, Author author) {
        System.out.println("Автор книги " + book.getName() + ", "
                + author.getName() + ", год издания книги = " + book.getYear() + "\n");
    }

    public static void printCodeLastName(Books book, Author author) {
        System.out.println("Автор книги " + book.getName() + ", "
                + author.getLastName() + ", год издания книги = " + book.getYear() + "\n");
    }

    public static void printCodeFirstName(Books book, Author author) {
        System.out.println("Автор книги " + book.getName() + ", "
                + author.getFirstName() + ", год издания книги = " + book.getYear() + "\n");
    }

    public static void printAuthor(Author author) {
        System.out.println(author + "\n");
    }

    public static void printBook(Books book) {
        System.out.println(book + "\n");
    }
}
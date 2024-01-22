package program;

import authors.Author;
import books.Books;

import static comparison.comparison.comparison;

public class ProgramCode {
    public static void operationProgram() {
        Author author = new Author("John", "Dhou");
        Author authorTwo = new Author("Sarah", "Jein");
        Books book = new Books(author, "Song", 1965);
        Books bookTwo = new Books(authorTwo, "Sleep", 2000);
        System.out.println("Автор книги " + book.getName() + ", "
                + author.getName() + ", год издания книги = " + book.getYear() + "\n");
        System.out.println("Автор книги " + bookTwo.getName() + ", "
                + authorTwo.getName() + ", год издания книги = " + bookTwo.getYear() + "\n");
        author.setName("Ghost", "Rider");
        book.setYear(2015);
        book.setName("Time");
        System.out.println("Автор книги " + book.getName() + ", "
                + author.getName() + ", год издания книги = " + book.getYear() + "\n");
        author.setLastName("Gras");
        System.out.println("Автор книги " + book.getName() + ", "
                + author.getLastName() + ", год издания книги = " + book.getYear() + "\n");
        author.setFirstName("Jan");
        System.out.println("Автор книги " + book.getName() + ", "
                + author.getFirstName() + ", год издания книги = " + book.getYear() + "\n");
        Author authorThree = new Author("Александр", "Третьяков");
        Books bookThree = new Books(authorThree, "Космос", 2023);
        System.out.println(authorThree);
        System.out.println(bookThree + "\n");
        authorThree.setName("Rita", "Jein");
        bookTwo.setName("Космос");
        comparison(bookTwo, bookThree, authorTwo, authorThree);
    }
}

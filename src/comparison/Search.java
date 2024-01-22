package comparison;

import authors.Author;
import books.Books;

public class Search {
    public static void comparison(Books book, Books bookTwo, Author author, Author authorTwo) {
        comparisonBookName(book, bookTwo);
        comparisonExactBook(book, bookTwo);
        comparisonAuthorLastName(author, authorTwo);
        comparisonExactAuthor(author, authorTwo);
    }
    public static void comparisonBookName(Books book, Books bookTwo) {
        System.out.println("Проверка названий книг: ");
        if (book.hashCode() == bookTwo.hashCode()) {
            System.out.println("Книги называются одинаково!");
        } else {
            System.out.println("У книг разное название!");
        }
    }

    public static void comparisonExactBook(Books book, Books bookTwo) {
        System.out.println("Полная проверка идентичности книг: ");
        if (book.equals(bookTwo)) {
            System.out.println("Книги однинаковые!");
        } else {
            System.out.println("Книги разные, у них только одинаковые названия!");
        }
    }

    public static void comparisonAuthorLastName(Author author, Author authorTwo) {
        System.out.println("Проверка совпадения фамилий авторов: ");
        if (author.hashCode() == authorTwo.hashCode()) {
            System.out.println("Фамилии авторов одинаковые!");
        } else {
            System.out.println("Фамилии авторов разные!");
        }
    }

    public static void comparisonExactAuthor(Author author, Author authorTwo) {
        System.out.println("Полная проверка авторов на идентичность: ");
        if (author.equals(authorTwo)) {
            System.out.println("Автор один и тот же!");
        } else {
            System.out.println("Это разные авторы!");
        }
    }
}
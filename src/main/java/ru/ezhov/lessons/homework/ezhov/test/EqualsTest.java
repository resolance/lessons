package ru.ezhov.lessons.homework.ezhov.test;

public class EqualsTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBook("Java 7");
        Book book2 = new Book();
        book2.setBook("Java 7");
        if (book1.equals(book2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        Object o = new Object();
        o.getClass();
    }
}


class Book {
    private String book;

    public void setBook(String b) {
        book = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book1 = (Book) o;

        return book != null ? book.equals(book1.book) : book1.book == null;
    }

    @Override
    public int hashCode() {
        return book != null ? book.hashCode() : 0;
    }
}


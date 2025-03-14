package fr.ensai.library;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");
        String csvFilePath = "books.csv";

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing.toString());

        Library mabibliotheque = new Library("Ma bete de biblio");
        mabibliotheque.loadBooksFromCSV(csvFilePath);

        mabibliotheque.displayItems();

    }
}
package fr.ensai.library;

public class Magazine extends Item{
    // Attributes
    private int issn;
    private int issueNumber;

    /**
     * Constructs a new Book object.
     */
    public Magazine(int issn, int issueNumber, String title, int year, int pageCount) {
        super(title, year, pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber;
    }

}

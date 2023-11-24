package com.mycompany.librarysystem;



public class Magazine extends Book {
    private String issueNumber;
    private String releaseDate;

   
    public Magazine(String title, Author author, String number, String genre, String version, String publicationDate, String issueNumber, String releaseDate) {
        super(title, author, number, genre, version, publicationDate);
        this.issueNumber = issueNumber;
        this.releaseDate = releaseDate;
    }

    
    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    
}

package com.mycompany.librarysystem;

public abstract class Book implements Display {
    private String title;
    private Author author;
    private String number;
    private String genre;
    private String version;
    private String publicationDate;
    private boolean isLoaned;

    // Constructor
    public Book(String title, Author author, String number, String genre, String version, String publicationDate) {
        this.title = title;
        this.author = author;
        this.number = number;
        this.genre = genre;
        this.version = version;
        this.publicationDate = publicationDate;
        this.isLoaned = false;
    }

   
  
    @Override
    public String getInfo() {
        
        return "Title: " + title + ", Author: " + author.getName() + 
               ", Genre: " + genre + ", Edition: " + version + 
               ", Publication Date: " + publicationDate;
    }

  
    @Override
    public boolean inLoan() {
        return isLoaned;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean getIsLoaned() {
        return isLoaned;
    }

    public void setIsLoaned(boolean isLoaned) {
        this.isLoaned = isLoaned;
    }
}

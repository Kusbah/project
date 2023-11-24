package com.mycompany.librarysystem;



public class Journal extends Book {
    private String conferenceName;
    private String conferenceNumber;

  
    public Journal(String title, Author author, String number, String genre, String version, String publicationDate, String conferenceName, String conferenceNumber) {
        super(title, author, number, genre, version, publicationDate);
        this.conferenceName = conferenceName;
        this.conferenceNumber = conferenceNumber;
    }

   
    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public String getConferenceNumber() {
        return conferenceNumber;
    }

    public void setConferenceNumber(String conferenceNumber) {
        this.conferenceNumber = conferenceNumber;
    }

    
}

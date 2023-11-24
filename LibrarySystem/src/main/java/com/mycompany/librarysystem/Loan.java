package com.mycompany.librarysystem;

import java.time.LocalDate;

public class Loan {
    private Book book;
    private LocalDate dueDate;
    private boolean isReturned;

    
    public Loan(Book book) {
        this.book = book;
        this.dueDate = LocalDate.now().plusDays(5); 
        this.isReturned = false;
    }

   
    public void markAsReturned() {
        isReturned = true;
        book.setIsLoaned(false); 
    }

  
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setIsReturned(boolean isReturned) {
        this.isReturned = isReturned;
    }
}

package com.mycompany.librarysystem;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private String address;
    private String birthDate;
    private String major;
    private List<Loan> currentLoans;

    
    public Student(String id, String name, String address, String birthDate, String major) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.major = major;
        this.currentLoans = new ArrayList<>();
    }

    
    public void borrowBook(Book book) {
        if (currentLoans.size() < 3 && !book.inLoan()) {
            Loan newLoan = new Loan(book);
            currentLoans.add(newLoan);
            book.setIsLoaned(true);
        } else {
             System.out.println("Book not found in current loans");
        }
    }

    
    public void returnBook(Book book) {
        Loan loanToRemove = null;
        for (Loan loan : currentLoans) {
            if (loan.getBook().equals(book)) {
                loan.markAsReturned();
                loanToRemove = loan;
                break;
            }
        }
        if (loanToRemove != null) {
            currentLoans.remove(loanToRemove);
        } else {
            System.out.println("Book not found in current loans");
        }
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public List<Loan> getCurrentLoans() {
        return currentLoans;
    }

    public void setCurrentLoans(List<Loan> currentLoans) {
        this.currentLoans = currentLoans;
    }
}

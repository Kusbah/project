package com.mycompany.librarysystem;
import java.util.Scanner;


public class LibrarySystem {
    private static final Librarian librarian = new Librarian();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    borrowBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n--- Library System Menu ---");
        System.out.println("1. Add Book");
        System.out.println("2. Add Student");
        System.out.println("3. Borrow Book");
        System.out.println("4. Return Book");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addBook() {
    System.out.println("Select book type (1 for Book, 2 for Magazine, 3 for Journal):");
    int bookType = scanner.nextInt();
    scanner.nextLine();  

    System.out.print("Enter book title: ");
    String title = scanner.nextLine();
    System.out.print("Enter author name: ");
    String authorName = scanner.nextLine();
    System.out.print("Enter book number: ");
    String number = scanner.nextLine();
    System.out.print("Enter genre: ");
    String genre = scanner.nextLine();
    System.out.print("Enter version (edition): ");
    String version = scanner.nextLine();
    System.out.print("Enter publication date: ");
    String publicationDate = scanner.nextLine();

    Author author = new Author("AuthorID", authorName, "AuthorAddress", "AuthorBirthDate");  // Simplified for demonstration

    Book book;

    switch (bookType) {
        case 1:  
            book = new Book(title, author, number, genre, version, publicationDate) {};
            break;
        case 2:  
            System.out.print("Enter issue number: ");
            String issueNumber = scanner.nextLine();
            System.out.print("Enter release date: ");
            String releaseDate = scanner.nextLine();
            book = new Magazine(title, author, number, genre, version, publicationDate, issueNumber, releaseDate);
            break;
        case 3:  
            System.out.print("Enter conference name: ");
            String conferenceName = scanner.nextLine();
            System.out.print("Enter conference number: ");
            String conferenceNumber = scanner.nextLine();
            book = new Journal(title, author, number, genre, version, publicationDate, conferenceName, conferenceNumber);
            break;
        default:
            System.out.println("Invalid book type selected.");
            return;
    }

    librarian.addBook(book);
    System.out.println("Book added successfully.");
}


    private static void addStudent() {
    System.out.print("Enter student ID: ");
    String id = scanner.nextLine();
    System.out.print("Enter student name: ");
    String name = scanner.nextLine();
    System.out.print("Enter student address: ");
    String address = scanner.nextLine();
    System.out.print("Enter student birth date (e.g., 2000-01-01): ");
    String birthDate = scanner.nextLine();
    System.out.print("Enter student major: ");
    String major = scanner.nextLine();

    Student student = new Student(id, name, address, birthDate, major);
    
    librarian.addStudent(student);

    System.out.println("Student added successfully.");
}


    private static void borrowBook() {
    System.out.print("Enter student ID: ");
    String studentId = scanner.nextLine();
    System.out.print("Enter book number: ");
    String bookNumber = scanner.nextLine();

    
    Student student = librarian.getStudent(studentId);
    if (student == null) {
        System.out.println("Student not found.");
        return;
    }

    
    Book book = librarian.getBook(bookNumber);
    if (book == null) {
        System.out.println("Book not found.");
        return;
    }

   
    if (book.inLoan()) {
        System.out.println("Book is currently loaned out.");
        return;
    }

    
    student.borrowBook(book);
    System.out.println("Book borrowed successfully.");
}


    private static void returnBook() {
    System.out.print("Enter student ID: ");
    String studentId = scanner.nextLine();
    System.out.print("Enter book number: ");
    String bookNumber = scanner.nextLine();

   
    Student student = librarian.getStudent(studentId);
    if (student == null) {
        System.out.println("Student not found.");
        return;
    }

    
    Book book = librarian.getBook(bookNumber);
    if (book == null) {
        System.out.println("Book not found.");
        return;
    }

   
    student.returnBook(book);
    System.out.println("Book returned successfully.");
}

}

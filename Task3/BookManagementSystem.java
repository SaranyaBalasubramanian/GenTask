package GenTask.Task3;
//Management System
//1.Design a java program that uses oop principle to model the book.create two classes : book and library
//the book class should have attribute such as bookID ,title,author and is available.
//the library class should include an array to store book objects.
// 2.Provide method to add book,remove book search book(using id) and display books.
//
//write a java program that demonstrates the use of these classes and methods by allowing the user to interact with the library system.

import GenTask.Task1.PrintNumber;

import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

class Book{
 private int bookID;
 private String title;
 private String author;
 private boolean isAvailable;

    public Book(int bookid, String title, String author) {

    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean available) {
        this.isAvailable = available;
    }

    //Constructor
    public void Book(int BookID,String title,String author,String isAvailable){
        this.bookID = BookID;
        this.title= title;
        this.author= author;
        this.isAvailable= true;

    }
    //method to add a book to the library
    public void displayBookDetails(){
        System.out.println("BookID:"+bookID);
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("IsAvailable:"+isAvailable);
    }
}


class library{
private Book[]books;
private int size;
private static final int MAX_SIZE = 5;

public library(){
    this.books = new Book[MAX_SIZE];
    size= 0;
}
//method to add book to library
    public void addBook(Book book){
    if(size<MAX_SIZE){
        books[size++]=book;
        System.out.println("Book added successfully");
    }else{
        System.out.println("Library full.Cannot add more books");
    }
    }
    //method to remove book from library
    public void removeBook(int bookId){
    boolean found = false;
        for (int i = 0; i < size; i++) {
            if(books[i].getBookID()==bookId) {
                books[i] = null;
                found = true;
                System.out.println("books removed successfully");
                break;
            }
            
        }
        if(!found){
            System.out.println("Book with ID "+bookId+"not found");
        }
    }
    // Method to search for a book by bookID
    public void searchBook(int bookID){
    boolean found = false;
        for (int i = 0; i < size; i++) {
            if(books[i].getBookID()==bookID){
                books[i].displayBookDetails();
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("Book with ID " + bookID + " not found.");
        }
    }
    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (int i = 0; i < size; i++) {
            books[i].displayBookDetails();
            System.out.println("---------------------");
        }
    }
}


public class BookManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        library library = new library();

        int choice;
        do{
            System.out.println("\n Library Management");
            System.out.println("1.Add Book");
            System.out.println("2.Remove Book");
            System.out.println("3.Search Book");
            System.out.println("4.Display Book");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Book ID");
                    int bookid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter title");
                    String title = scanner.nextLine();
                    System.out.println("Enter Author");
                    String author = scanner.nextLine();
                    Book book = new Book(bookid,title,author);
                    library.addBook(book);
                    break;
                case 2 :
                    System.out.println("Enter Book ID to remove");
                    int idTorRemove = scanner.nextInt();
                    library.removeBook(idTorRemove);
                    break;
                case 3:
                    System.out.println("Enter Book ID to search");
                    int idtosearch = scanner.nextInt();
                    library.searchBook(idtosearch);
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.out.println("Existing");
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }while (choice!=5);
        scanner.close();

    }
}

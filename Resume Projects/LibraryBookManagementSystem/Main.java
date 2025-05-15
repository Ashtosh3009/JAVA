import java.io.*;
import java.util.*;

class Book implements Serializable {
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isIssued() { return isIssued; }

    public void issue() { isIssued = true; }
    public void returnBook() { isIssued = false; }

    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Author: " + author + ", Issued: " + (isIssued ? "Yes" : "No");
    }
}

class LibraryManager {
    private List<Book> books = new ArrayList<>();
    private final String fileName = "books.dat";

    public LibraryManager() {
        loadFromFile();
    }

    public void addBook(Book b) {
        books.add(b);
        saveToFile();
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public Book searchBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public Book searchBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public boolean issueBook(int id) {
        Book b = searchBookById(id);
        if (b != null && !b.isIssued()) {
            b.issue();
            saveToFile();
            return true;
        }
        return false;
    }

    public boolean returnBook(int id) {
        Book b = searchBookById(id);
        if (b != null && b.isIssued()) {
            b.returnBook();
            saveToFile();
            return true;
        }
        return false;
    }

    public boolean deleteBook(int id) {
        Book b = searchBookById(id);
        if (b != null) {
            books.remove(b);
            saveToFile();
            return true;
        }
        return false;
    }

    private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(books);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    private void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            books = (ArrayList<Book>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            books = new ArrayList<>();
        }
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryManager lm = new LibraryManager();

        while (true) {
            System.out.println("\n--- Library Book Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Search Book by Title");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Delete Book");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    lm.addBook(new Book(id, title, author));
                    break;
                case 2:
                    lm.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID to search: ");
                    Book byId = lm.searchBookById(sc.nextInt());
                    System.out.println(byId != null ? byId : "Book not found.");
                    break;
                case 4:
                    System.out.print("Enter Book Title to search: ");
                    Book byTitle = lm.searchBookByTitle(sc.nextLine());
                    System.out.println(byTitle != null ? byTitle : "Book not found.");
                    break;
                case 5:
                    System.out.print("Enter Book ID to issue: ");
                    if (lm.issueBook(sc.nextInt())) System.out.println("Book issued.");
                    else System.out.println("Cannot issue book.");
                    break;
                case 6:
                    System.out.print("Enter Book ID to return: ");
                    if (lm.returnBook(sc.nextInt())) System.out.println("Book returned.");
                    else System.out.println("Cannot return book.");
                    break;
                case 7:
                    System.out.print("Enter Book ID to delete: ");
                    if (lm.deleteBook(sc.nextInt())) System.out.println("Book deleted.");
                    else System.out.println("Book not found.");
                    break;
                case 8:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

import java.util.ArrayList;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;
    private String category;
    private double price;

    public Book(int bookId, String bookName, String authorName, String category, double price) {
        this.bookId = bookId;
        this.setBookName(bookName);
        this.authorName = authorName;
        this.category = category;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void getDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + getBookName());
        System.out.println("Author Name: " + authorName);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }
}

class Account {
    private int accountId;
    private String accountType;
    private String username;
    private String password;

    public Account(int accountId, String accountType, String username, String password) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.username = username;
        this.password = password;
    }

    public void createAccount() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Type: " + accountType);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}

class Category {
    private int categoryId;
    private String categoryName;

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public void addCategory() {
        System.out.println("Category ID: " + categoryId);
        System.out.println("Category Name: " + categoryName);
    }
}

class Bookshop {
	public static void main(String []args){
    private ArrayList<Book> books;
    private ArrayList<Account> accounts;
    private ArrayList<Category> categories;

    public Bookshop(ArrayList<Book> books, ArrayList<Account> accounts, ArrayList<Category> categories) {
        this.books = books;
        this.accounts = accounts;
        this.categories = categories;
    }

    /**
     * @param bookId
     */
    public void viewBookDetails(int bookId) {
        for (Book book : books) {
            if (bookName() == bookId) {
                book.getDetails();
            } else {
                break;
            }
        }
    }

    private int bookName() {
        return 0;
    }

    /**
     * @param bookName
     */
    public void searchStockDetails(String bookName) {
        for (Book book : books) {
            if (book.getBookName().equals(bookName))
                book.getDetails();
            break;

        }

    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }
}
}


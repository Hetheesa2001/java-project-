
// Java Program to Illustrate Application CLass
// To Create The Menu For the Program

// Importing required classes
import java.util.Scanner;

// Class
public class Librarymanagement {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating object of Scanner class
        // to take input from user
        Scanner scanner = new Scanner(System.in);
        String adminUsername = "admin";
        String adminPassword = "admin1234";
        String userUsername = "user";
        String userPassword = "user1234";

        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            System.out.println("Welcome, Manager!");
            // Admin code here
        } else if (username.equals(userUsername) && password.equals(userPassword)) {
            System.out.println("Welcome, Cashier!");
            // User code here
        } else {
            System.out.println("Invalid username or password.");
        }

        // this username for password upper coding
        Scanner input = new Scanner(System.in);

        // Displaying menu
        System.out.println
                ("----------------------Welcome to the Jaffna Library Management System!----------------------");
        System.out.println
                ("                    Select From The Following Options:                  ");
        System.out.println
                ("------------------------------------------------------------------------");

        // Creating object of book class
        books ob = new books();
        // Creating object of students class
       

        int choice;
        int searchChoice;

        // Creating menu
        // using do-while loop
        do {

            ob.dispMenu();
            choice = input.nextInt();

            // Switch case
            switch (choice) {

                // Case
                case 1:
                    book b = new book();
                    ob.addBook(b);
                    break;

                // Case
                case 2:
                    ob.upgradeBookstock();
                    break;

                // Case
                case 3:

                    System.out.println(
                            " press 1 to Search with Book id.");
                    System.out.println(
                            " Press 2 to Search with Book's Author Name.");
                    System.out.println(
                            " Press 2 to Search with Book's Catagory Name.");
					System.out.println(
                            " Press 2 to Search with Book's Isbn Number.");
                    searchChoice = input.nextInt();


                    // Nested switch
                    switch (searchChoice) {

                        // Case
                        case 1:
                            ob.searchBySno();
                            break;

                        // Case
                        case 2:
                            ob.searchByAuthorName();

                    break;

                    //Case
                case 3:
                    ob.searchByCatagory();
                }
                break;

					//Case
                case 4:
                    ob.borrowBook();
					break;
					
					//Case
                case 5:
                    ob.returnBook();
					break;

                // Case
                case 6:
                    ob.showAllBooks();
                    break;


                // Default case that will execute for sure
                // if above cases does not match
                default:

                    // Print statement
                    System.out.println("ENTER BETWEEN 0 TO 5.");
            }

        }

        // Checking condition at last where we are
        // checking case entered value is not zero
        while (choice != 0);
    }
}

// Java Program to Illustrate books class
// To Do all the Operations related to Books such as
// add, check-in, check-out,Valid books,Update books

// Importing required classes
import java.util.Scanner;

// CLass
public class books {

    // Class data members
    book theBooks[] = new book[50];
    public static int count;

    Scanner input = new Scanner(System.in);

    // Method 1
    //  To compare books
    public int compareBookObjects(book b1, book b2)
    {

        // If book name matches
        if (b1.bookName.equalsIgnoreCase(b2.bookName)) {

            // Printing book exists
            System.out.println(
                    "Book of this Name Already Exists.");
            return 0;
        }

        // if book serial matches
        if (b1.sNo == b2.sNo) {

            // Print book exists
            System.out.println(
                    "Book of this Serial No Already Exists.");

            return 0;
        }
        return 1;
    }

    // Method 2
    // To add book
    public void addBook(book b)
    {

        for (int i = 0; i < count; i++) {

            if (this.compareBookObjects(b, this.theBooks[i])
                    == 0)
                return;
        }

        if (count < 50) {

            theBooks[count] = b;
            count++;
        }
        else {

            System.out.println
                    ("No Space to Add More Books.");
        }
    }

    // Method 3
    // To search book by serial number
    public void searchBySno()
    {

        // Display message
        System.out.println(
                "\t\t\t\tSEARCH BY SERIAL NUMBER\n");

        // Class data members
        int sNo;
        System.out.println("Enter Serial No of Book:");
        sNo = input.nextInt();

        int fit = 0;
        System.out.println(
                "S.No\t\tName\t\tAuthor\t\tcatagory\t\tAvailable Qty\t\tTotal Qty");

        for (int i = 0; i < count; i++) {
            if (sNo == theBooks[i].sNo) {
                System.out.println(
                        theBooks[i].sNo + "\t\t"
                                + theBooks[i].bookName + "\t\t"
                                + theBooks[i].authorName + "\t\t"
                                + theBooks[i].catagoryName + "\t\t"
								+ theBooks[i].isbn + "\t\t"
                                + theBooks[i].bookQtyCopy + "\t\t"
                                + theBooks[i].bookQty);
                fit++;
                return;
            }
        }
        if (fit == 0)
            System.out.println("No Book for Serial No "
                    + sNo + " Found.");
    }

    // Method 4
    // To search author by name
    public void searchByAuthorName()
    {

        // Display message
        System.out.println(
                "\t\t\t\tSEARCH BY AUTHOR'S NAME");

        input.nextLine();

        System.out.println("Enter Author Name:");
        String authorName = input.nextLine();

        int fit = 0;

        System.out.println(
                "S.No\t\tName\t\tAuthor\t\tCatagory\t\tisbn\t\tAvailable Qty\t\tTotal Qty");

        for (int i = 0; i < count; i++) {

            // if author matches any of its book
            if (authorName.equalsIgnoreCase(
                    theBooks[i].authorName)) {

                // Print below corresponding credentials
                System.out.println(
                        theBooks[i].sNo + "\t\t"
                                + theBooks[i].bookName + "\t\t"
                                + theBooks[i].authorName + "\t\t"
                                + theBooks[i].catagoryName + "\t\t"
								+ theBooks[i].isbn + "\t\t"
                                + theBooks[i].bookQtyCopy + "\t\t"
                                + theBooks[i].bookQty);
                fit++;
            }
        }

        // Else no book matches for author
        if (fit== 0)
            System.out.println("No Books of " + authorName
                    + " Found.");
    }
    //------------------------------------start
    public void searchByCatagory()
    {

        // Display message
        System.out.println(
                "\t\t\t\tSEARCH BY Catagory");

        input.nextLine();

        System.out.println("Enter Catagory:");
        String catagoryName = input.nextLine();

        int fit= 0;

        System.out.println(
                "S.No\t\tName\t\tAuthor\t\tCatagory\t\tisbn\t\tAvailable Qty\t\tTotal Qty");

        for (int i = 0; i < count; i++) {

            // if author matches any of its book
            if (catagoryName.equalsIgnoreCase(
                    theBooks[i].catagoryName)) {

                // Print below corresponding credentials
                System.out.println(
                        theBooks[i].sNo + "\t\t"
                                + theBooks[i].bookName + "\t\t"
                                + theBooks[i].authorName + "\t\t"
                                + theBooks[i].catagoryName + "\t\t"
								+ theBooks[i].isbn + "\t\t"
                                + theBooks[i].bookQtyCopy + "\t\t"
                                + theBooks[i].bookQty);
                fit++;
            }
        }

        // Else no book matches for author
        if (fit== 0)
            System.out.println("No Books of " + catagoryName
                    + " Found.");
    }

    //----------------------------------end

    // Method 5
    // To display all books
    public void showAllBooks()
    {

        System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
        System.out.println(
                "S.No\t\tName\t\tAuthor\t\tCatagory\t\tisbn\t\tAvailable Qty\t\tTotal Qty");

        for (int i = 0; i < count; i++) {

            System.out.println(
                    theBooks[i].sNo + "\t\t"
                            + theBooks[i].bookName + "\t\t"
                            + theBooks[i].authorName + "\t\t"
                            + theBooks[i].catagoryName + "\t\t"
							+ theBooks[i].isbn + "\t\t"
                            + theBooks[i].bookQtyCopy + "\t\t"
                            + theBooks[i].bookQty);
        }
    }

    // Method 6
    // To edit the book
    public void upgradeBookstock()
    {

        System.out.println(
                "\t\t\t\tUPGRADE QUANTITY OF A BOOK\n");
        System.out.println("Enter Serial No of Book");

        int sNo = input.nextInt();

        for (int i = 0; i < count; i++) {

            if (sNo == theBooks[i].sNo) {

                // Display message
                System.out.println(
                        "Enter No of Books to be Added:");

                int addingQty = input.nextInt();
                theBooks[i].bookQty += addingQty;
                theBooks[i].bookQtyCopy += addingQty;

                return;
            }
        }
    }

    // Method 7
    // To create menu
    public void dispMenu()
    {

        // Displaying menu
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println("Press 1 to Add new Book.");
        System.out.println("Press 2 to Upgrade Stock of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Borrow a Books.");
		System.out.println("Press 5 to Return a Book.");
        System.out.println("Press 6 to Show all Book.");
        System.out.println("Press 0 to Exit Application.");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------");
    }

    // Method 8
    // To search the Bookshop
    public int isAvailable(int sNo)
    {

        for (int i = 0; i < count; i++) {
            if (sNo == theBooks[i].sNo) {
                if (theBooks[i].bookQtyCopy > 0) {

                    System.out.println(
                            "Book is Available.");
                    return i;
                }
                System.out.println("Book is Unavailable");
                return -1;
            }
        }

        System.out.println("No Book of Serial Number "
                + " Available in Bookshop.");
        return -1;
    }
	
	// Method 9
    // To borrow a book
    public void borrowBook() {
        System.out.println("\nBORROW A BOOK\n");
        System.out.println("Enter Serial No of Book:");
        int sNo = input.nextInt();
        int bookIndex = isAvailable(sNo);
		    if (bookIndex != -1) {
        theBooks[bookIndex].bookQtyCopy--;
        System.out.println("Book Borrowed Successfully.");
    }
}

	// Method 11
	// To return a book
	public void returnBook() {
    System.out.println("\nRETURN A BOOK\n");
    System.out.println("Enter Serial No of Book:");
    int sNo = input.nextInt();

    for (int i = 0; i < count; i++) {
        if (sNo == theBooks[i].sNo) {
            if (theBooks[i].bookQtyCopy < theBooks[i].bookQty) {
                theBooks[i].bookQtyCopy++;
                System.out.println("Book Returned Successfully.");
                return;
            } else {
                System.out.println("Invalid Book Return.");
                return;
            }
        }
    }
    System.out.println("No Book with Serial No " + sNo + " Found.");
}

    // Method 12
    // To remove the book from the Bookshop

            }



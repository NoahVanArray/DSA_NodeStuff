import java.util.*;



class BookNode{

    public final String[] deweyDecimalSystem = 
    {
        "000 - 099 ~ General Works, Computer Science, and Information",
        "100 - 199 ~ Philosophy and psychology", 
        "200 - 299 ~ Religion", 
        "300 - 399 ~ Social sciences",
        "400 - 499 ~ Language", 
        "500 - 599 ~ Science and mathematics ", 
        "600 - 699 ~ Technology", 
        "700 - 799 ~ Arts and recreation", 
        "800 - 899 ~ Literature", 
        "900 - 999 ~ History and geography"
    };

    List<BookNode> bookList = new ArrayList<>();
    
    public String title, author;
    public int deweyClass, yearPublished;
    
    BookNode(){}
    BookNode(String title, String author, int deweyClass, int yearPublished){
        this.title = title;
        this.author = author;
        this.deweyClass = deweyClass;
        this.yearPublished = yearPublished;
    }

}

public class Main {
    public static boolean exitTheUser = false;
    public static Scanner bookScan = new Scanner(System.in);
    public static void viewBooks()
    {
        BookNode book = new BookNode();
        forEach (BookNode bookItem : bookList) {
            System.out.println(bookItem.book.title);
            System.out.println(book.author);
            System.out.println(book.deweyClass);
            System.out.println(book.yearPublished);
        }
    }
    
    public static void editBook()
    {
    
    }   

    public static void deleteBook()
    {
    
    }  
    
    public static void addBook(){
        String bookTitle = "", bookAuthor = "";
        int bookClass = 0, bookYear = 0;
        
        System.out.print("Enter title: ");
        if(bookScan.hasNextLine() ){
            bookTitle = bookScan.nextLine();
        }
        else {bookTitle = "";}
        
        System.out.print("Enter author name: ");
        if(bookScan.hasNextLine() ){
            bookAuthor = bookScan.nextLine();
        }
        else {bookAuthor = "";}
        
        System.out.print("Enter Dewey Decimal class: ");
        if(bookScan.hasNextInt() ){
            bookClass = bookScan.nextInt();    
        }
        else {bookClass = 0;}
        
        System.out.print("Enter year published: ");
        if(bookScan.hasNextInt() ){
            bookYear = bookScan.nextInt();    
        }
        else {bookYear = 0;}
        

        BookNode addedBook = new BookNode(bookTitle, bookAuthor, bookClass, bookYear);
        addedBook.bookList.add(addedBook);

        System.out.println("\nBook added successfully.\n\n");
    }
    
    public static void userExit(boolean exit){
        if(exit)
        {
            exitTheUser = true;
        }
    }
    
    public static void main(String[] args){
        int choice = 0;
        System.out.println("Welcome to the Library.");
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("What do you want to do: \n1.) View Books \n2.) Add Book \n3.) Edit Book \n4.) Delete Book \n5.) Exit");
            System.out.print("Your choice: ");
            if(scan.hasNextInt() ){
                choice = scan.nextInt();    
            }
            switch (choice){
                case 1:
                viewBooks();
                break;
                
                case 2:
                addBook();
                break;

                case 3:
                editBook();
                break;
                case 4:
                deleteBook();
                break;
            
                case 5:
                userExit(true);
                break;

                default:
                System.out.print("Skill issue... try again.");
                }
          
        } while(exitTheUser == false);
        bookScan.close();
        
    System.out.print("Bye bye...");
    }
}



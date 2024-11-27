import java.util.Scanner;

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

    List<String> bookList = new ArrayList<>();
    
    private String title, author;
    private int deweyClass, yearPublished;
    

    BookNode(String title, String author, int deweyClass, int yearPublished){
        this.title = title;
        this.author = author;
        this.deweyClass = deweyClass;
        this.yearPublished = yearPublished;
    }

    public void setNextNode(Node node){
        this.next = node;
    }
    
    public Node getNextNode(){
        return this.next;
    }
}

public class Main {
    public static boolean exitTheUser = false;


    public void addBook(BookNode book){
        Scanner bookScan = new Scanner(System.in);
        String bookTitle, bookAuthor, bookClass, bookYear;
        System.out.print("Enter title: ");
        bookTitle = bookScan.nextLine();
        System.out.print("Enter author name: ");
        bookAuthor = bookScan.nextLine();
        System.out.print("Enter Dewey Decimal class: ");
        bookClass = bookScan.nextInt();
        System.out.print("Enter year published: ");
        bookYear = bookScan.nextInt();
        

        BookNode addedBook = new BookNode(bookTitle, bookAuthor, bookClass, bookYear0);
        addedBook.bookList.Add(addedBook);
        
        bookScan.Close();
    }

    public static void userExit(boolean exit){
        if(exit)
        {
            exitTheUser = true;
        }
}

    public static void main(String[] args){
        
            System.out.println("Welcome to the Library.");
            do{
                Scanner scan = new Scanner(System.in);
                System.out.println("\n1.) View Books \n2.) Add Book \n3.) Edit Book \n4.) Delete Book \n5.) Exit");
                System.out.print("Your choice: ");
                int choice = scan.nextInt();
                switch (choice){
                    case 1:
                        //viewBooks();
                        break;
    
                    case 2:
                        //addBook();
                        break;
    
                    case 3:
                        //editBook();
                        break;

                    case 4:
                        //deleteBook();
                        break;
                    
                    case 5:
                        userExit(true);
                    break;
                default:
                System.out.print("Skill issue... try again.");
                }
                scan.close();
            } while(exitTheUser == false);
        
        
        System.out.print("Bye bye...");
    }
}



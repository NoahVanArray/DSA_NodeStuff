import org.w3c.dom.Node;
import java.util.Scanner;



class BookNode{

    public final String[] deweyDecimalSystem = {
        "000 - 099 ~ General Works, Computer Science, and Information",
        "100 - 199 ~ Philosophy and psychology", 
        "200 - 299 ~ Religion", 
        "300 - 399 ~ Social sciences",
        "400 - 499 ~ Language", 
        "500 - 599 ~ Science and mathematics ", 
        "600 - 699 ~ Technology", 
        "700 - 799 ~ Arts and recreation", 
        "800 - 899 ~ Literature", 
        "900 - 999 ~ History and geography"};
    public Node node;

    private String title, author;
    private int deweyClass, yearPublished;
    
    BookNode(){
    }

    BookNode(String title, String author, int deweyClass, int yearPublished){
        this.title = title;
        this.author = author;
        this.deweyClass = deweyClass;
        this.yearPublished = yearPublished;
    }

}

public class App {
    private static boolean exitTheUser = false;

    BookNode bn = new BookNode();
    public void viewBooks(){
        System.out.println("Classification:");
        for(String i : bn.deweyDecimalSystem)
            System.out.println(i);
        
        System.out.println("enter a number from 0-9");

        int div = 0;

        switch (div) {
            case 0:
                //use foreach
                break;
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
                
                break;
            case 9:
                
                break;
            default:
                System.out.println("No choice made.");
                break;
        }
    }

    public void addBook(){

    }

    public static void userExit(boolean exit){
            if(exit){
                exitTheUser = true;
            }
        }
    
        public static void main(String[] args) throws Exception {
            try (Scanner scan = new Scanner(System.in)) {
                System.out.println("Welcome to the Library.");
                int choice = scan.nextInt();
                do{
                    System.out.println("\n1.) View Books \n2.) Add Book \n3.) Edit Book \n 4.) Delete Book \n5.) Exit");
                    
                    switch (choice) {
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
                
      } while(exitTheUser == false);
            }
            catch(Exception ex){
                System.out.println("Error: " + ex);
            }
            System.out.print("Bye bye...");
    }
}

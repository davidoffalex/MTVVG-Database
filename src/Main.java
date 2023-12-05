import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String operationSelected = determineOperation();
        String mediaSelected = determineMedia();
        
    }
    
    public static String determineOperation() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like to insert, query, or exit? (Enter 'a', 'b', or 'c'): ");
        System.out.println("a. Insert");
        System.out.println("b. Query");
        System.out.println("c. Exit");
        
        String operation = userInput.next();
        performTypeCheck(operation);
        
        userInput.close();
        
        return operation;
    }
    public static String determineMedia() {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Select Media (Enter 'a', 'b', or 'c'): ");
        System.out.println("a. Movie");
        System.out.println("b. TV Show");
        System.out.println("c. Video Game");
        
        String mediaSelected = userInput.next();
        performTypeCheck(mediaSelected);
        
        System.out.println("\nList the genres: ");
        
        userInput.close();
        
        return mediaSelected;
        
    }
    
    public static void performTypeCheck(String menuItem) {
        if (menuItem.equals("a")) return;
        else if (menuItem.equals("b")) return;
        else if (menuItem.equals("c")) return;
        else {
            throw new IllegalArgumentException("Invalid input");
        }
    }
    public static void instantiateMedia(String genreSelected) {

    }
}

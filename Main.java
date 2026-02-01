import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("=== Welcome to TeamBoard Project Management App! ===");
            System.out.println("Choose an option:");
            System.out.println("1. Create new user account");
            System.out.println("2. Login as an existing user");
            System.out.println("3. Exit\n");
            System.out.print("Your choice:");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Logic for creating new user
                    break;
                
                case 2:
                    // Logic for login
                    break;

                case 3:
                    System.out.println("Bye!");
                    scanner.close();
                    return;
            
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
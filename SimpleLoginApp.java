import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleLoginApp {
    public static void main(String[] args) {
        // Simulating a user database (username - password)
        Map<String, String> userDatabase = new HashMap<>();
        userDatabase.put("user1", "password1");
        userDatabase.put("user2", "password2");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Login App");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (authenticateUser(username, password, userDatabase)) {
            System.out.println("Login successful. Welcome, " + username + "!");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }
    }

    public static boolean authenticateUser(String username, String password, Map<String, String> userDatabase) {
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            return storedPassword.equals(password);
        }
        return false;
    }
}

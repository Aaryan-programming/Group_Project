import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Go Fish!");
        System.out.println("-------------------");

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> playerNames = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter name for Player " + i + ": ");
            String name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                name = "Player " + i;
            }
            playerNames.add(name);
        }

        GoFishGame game = new GoFishGame(playerNames);
        game.play();

        System.out.println("\nThank you for playing Go Fish!");
        scanner.close();
    }
}
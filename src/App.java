// Main
public class App {
    public static void main(String[] args) {

        // Menu
        int menu = Auxiliary.title(
                "No Light Below",
                "Credits to bcsarah@github.com",
                new String[] { "New Game", "Continue", "Options", "Help", "Credits", "Exit" });

        switch (menu) {
            case 1: // New Game
                System.out.println("New Game");
                break;
            case 2: // Continue
                System.out.println("Continue");
                break;
            case 3: // Options
                System.out.println("Options");
                break;
            case 4: // Help
                System.out.println("Help");
                break;
            case 5: // Credits
                System.out.println("Credits");
                break;
            case 6: // Exit
                System.out.println("Exit");
        }

    }
}

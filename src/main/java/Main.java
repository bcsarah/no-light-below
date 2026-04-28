import java.util.Map;
import java.util.LinkedHashMap;

public class Main {
    // Show the game menu
    public static void showMenu() {
        Map<String, Runnable> options = new LinkedHashMap<>();
        options.put("Play", Play::playGame);
        options.put("Options", Options::showOptions);
        options.put("Exit", Main::exit);
        options.put("Test", Test::test);

        // Make and show options for Menu
        Auxiliary.title("No Light Below", "Credits to bcsarah@github.com", options);
    }

    // Quit the application
    public static void exit() {
        System.exit(0);
    }

    // Main
    public static void main(String[] args) {
        showMenu();
    }
}

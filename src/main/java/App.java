import java.util.Map;
import java.util.LinkedHashMap;

// App
public class App {
    // Show menu
    public static void showMenu() {
        // Make and show options for Menu
        Map<String, Runnable> options = new LinkedHashMap<>();
        options.put("Play", Play::playGame);
        options.put("Options", Options::showOptions);
        options.put("Exit", App::exit);
        options.put("Test", Test::test);

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

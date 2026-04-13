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
        options.put("Exit", null);

        Auxiliary.title("No Light Below", "Credits to bcsarah@github.com", options);
    }

    // Main
    public static void main(String[] args) {
        showMenu();
    }
}

import java.util.LinkedHashMap;
import java.util.Map;

// Main
public class App {
    public static void main(String[] args) {
        // Options for Menu
        Map<String, Runnable> options = new LinkedHashMap<>();
        options.put("New Game", Menu::newGame);
        options.put("Continue", Menu::continueGame);
        options.put("Options", Menu::options);
        options.put("Help", Menu::help);
        options.put("Credits", Menu::credits);
        options.put("Exit", Menu::exit);

        // Menu
        Auxiliary.title("No Light Below", "Credits to bcsarah@github.com", options);
    }
}

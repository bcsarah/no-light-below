import java.util.Map;
import java.util.LinkedHashMap;

// Options
public class Options {
    // Show options
    public static void showOptions() {
        // Make and show options for Options
        Map<String, Runnable> options = new LinkedHashMap<>();
        options.put("Text Color", Options::changeTextColor);
        options.put("Help", Options::showHelp);
        options.put("Credits", Options::showCredits);
        options.put("Back", App::showMenu);

        Auxiliary.title("Options", null, options);
    }

    // Change some colors to change the text color
    public static void changeTextColor() {
        Map<String, Runnable> options = new LinkedHashMap<>();
        options.put("White", null);
        options.put("Green", null);
        options.put("Red", null);
        options.put("Blue", null);
        options.put("Yellow", null);
        options.put("Cyan", null);
        options.put("Magenta", null);
        options.put("Back", Options::showOptions);

        int color = Auxiliary.title("TextColor", null, options);
        switch (color) {
            case 1 -> Auxiliary.textColor = "\033[37m"; // White
            case 2 -> Auxiliary.textColor = "\033[32m"; // Green
            case 3 -> Auxiliary.textColor = "\033[31m"; // Red
            case 4 -> Auxiliary.textColor = "\033[34m"; // Blue
            case 5 -> Auxiliary.textColor = "\033[33m"; // Yellow
            case 6 -> Auxiliary.textColor = "\033[36m"; // Cyan
            case 7 -> Auxiliary.textColor = "\033[35m"; // Magenta
        }
        changeTextColor();
    }

    // Show instructions to help new users
    public static void showHelp() {
    }

    // Show the game credits
    public static void showCredits() {
    }
}

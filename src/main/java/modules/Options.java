import java.util.Map;
import java.util.LinkedHashMap;

public class Options {
    // Show options
    public static void showOptions() {
        Map<String, Runnable> options = new LinkedHashMap<>();
        options.put("Text Color", Options::changeTextColor);
        options.put("Help", Options::showHelp);
        options.put("Credits", Options::showCredits);
        options.put("Back", Main::showMenu);

        // Make and show options for Options
        Auxiliary.title("Options", null, options);
    }

    // Change the text color (completly ui)
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

        // Changes color by the input
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

    // Show instructions for new users
    public static void showHelp() {
    }

    // Show the game credits (me and me)
    public static void showCredits() {
    }
}

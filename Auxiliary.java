import java.util.Scanner;

public class Auxiliary {
    static Scanner scan = new Scanner(System.in);

    // Clear terminal screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Ask something, returning String or double
    public static String ask(String phrase) {
        System.out.print(phrase);
        return scan.nextLine();
    }

    public static double askDouble(String phrase) {
        System.out.println(phrase);
        String input = scan.nextLine();
        return Double.parseDouble(input);
    }

    // Ascii art
    // public static String asciiArt(String prompt) {
    // return FigletFont.convertOneLine(prompt);
    // }

    // Create a header, a description and list some options
    public static int title(String header, String description) {
        System.out.println(header);
        return 0;
    }
}

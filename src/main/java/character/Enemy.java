public class Enemy extends Character {
    protected int lvl;

    // Constructor
    public Enemy(String name, int health, int str, int dex, int wis, int lvl) {
        super(name, health, str, dex, wis);
        this.lvl = lvl;
    }

    // Getters
    public int getLevel() {
        return lvl;
    }

    public int getExperienceByLevel() {
        return 25 * lvl;
    }

    // Show enemy sheet
    public void showSheet() {
        String description = name + " (" + lvl + ")" + "\n\n" +
                "HP: " + health + "/" + maxHealth + "\n" +
                "AC: " + ac + "\n\n" +

                "STR: " + str + "\n" +
                "DEX: " + dex + "\n" +
                "WIS: " + wis + "\n";

        Auxiliary.title("Sheet", description, null);
        Auxiliary.scan.nextLine();
    }
}

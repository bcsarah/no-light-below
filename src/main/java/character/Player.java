public class Player extends Character {
    protected int exp, lvl;

    // Constructor
    public Player(String name, int health, int str, int dex, int wis, Weapon weapon, Armor armor, int exp, int lvl) {
        super(name, health, str, dex, wis, weapon, armor);
        this.exp = exp;
        this.lvl = lvl;
    }

    // Getters
    public int getExperience() {
        return exp;
    }

    public int getLevel() {
        return lvl;
    }

    public int getNextLevelExperience() {
        return 125 * lvl;
    }

    // Setters
    public void setExperience(int exp) {
        this.exp = exp;
    }

    public void setLevel(int lvl) {
        this.lvl = lvl;
    }

    // Add exp to player and check if player level up
    public void addExp(int amount) {
        exp += amount;
        while (exp >= getNextLevelExperience()) {
            exp -= getNextLevelExperience();
            levelUp();
        }
    }

    // Level up with status up
    public void levelUp() {

    }

    // Up status and check if its avaiable
    public void upStatus() {
    }

    // Show the character sheet
    public void showSheet() {
        String description = name + "\n\n" +
                "LVL: " + lvl + " (" + exp + "/" + getNextLevelExperience() + ")" + "\n\n" +

                "HP: " + health + "/" + maxHealth + "\n" +
                "AC: " + ac + " (" + armor.getBaseAc() + " + " + dex + ")" + "\n\n" +

                "STR: " + str + "\n" +
                "DEX: " + dex + "\n" +
                "WIS: " + wis + "\n" +
                "CON: " + con + "\n" +
                "CHA: " + cha + "\n\n" +

                "Weapon: " + weapon.getName() + " (" + weapon.getMinDmg() + " - " + weapon.getMaxDmg() + " +"
                + weapon.getAttribute() + ")" + "\n" +
                "Armor: " + armor.getName() + " (" + armor.getBaseAc() + " + DEX)";

        Auxiliary.title("Sheet", description, null);
        Auxiliary.scan.nextLine();
    }
}

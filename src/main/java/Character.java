public class Character {
    // Variables
    private String name;
    private int health, maxHealth, mana, maxMana, ac;
    private int str, dex, wis;
    private int minDmg, maxDmg;

    // Constructor
    public Character(String name, int health, int mana, int str, int dex, int wis, int minDmg, int maxDmg) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.mana = mana;
        this.maxMana = mana;
        this.ac = 10 + dex;
        this.str = str;
        this.dex = dex;
        this.wis = wis;
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getMana() {
        return mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public int getArmorClass() {
        return ac;
    }

    public int getStrength() {
        return str;
    }

    public int getDexterity() {
        return dex;
    }

    public int getWisdom() {
        return wis;
    }

    public int getMinDmg() {
        return minDmg;
    }

    public int getMaxDmg() {
        return maxDmg;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    public void setArmorClass(int ac) {
        this.ac = ac;
    }

    public void setStrength(int str) {
        this.str = str;
    }

    public void setDexterity(int dex) {
        this.dex = dex;
    }

    public void setWisdom(int wis) {
        this.wis = wis;
    }

    public void setMinDmg(int minDmg) {
        this.minDmg = minDmg;
    }

    public void setMaxDmg(int maxDmg) {
        this.maxDmg = maxDmg;
    }

    // Attack a target
    public void attack(Character target) {
        Auxiliary.say(this.getName() + " tryes to attack " + target.getName() + "...");
        int roll = Auxiliary.roll(getStrength(), 20); // Hit dice

        // Hit
        if (roll >= target.getArmorClass()) {
            Auxiliary.say(this.getName() + " hits " + target.getName() + "!\n");

            // Damage
            int dmg = Auxiliary.randomInt(this.getMinDmg(), this.getMaxDmg()) + this.getStrength();
            if (roll == 20) { // Critical hit
                Auxiliary.say("It's a Critical Hit! Damage is doubled!");
                dmg *= 2;
            }

            Auxiliary.say("It causes " + dmg + " damage!");
            target.takeDamage(dmg);
        } else {
            // Miss
            Auxiliary.say(this.getName() + " misses!\n");
        }
    }

    // Check if the Character is alive (health > 0)
    public boolean isAlive() {
        return this.getHealth() > 0;
    }

    // Take damage and check if health is < 0
    public void takeDamage(int dmg) {
        int newHealth = this.getHealth() - dmg;
        if (newHealth < 0)
            newHealth = 0;
        this.setHealth(newHealth);
    }

    // Heal hp and check if health is > max
    public void heal(int amount) {
        int newHealth = this.getHealth() + amount;
        if (newHealth > this.getMaxHealth())
            newHealth = this.getMaxHealth();
        this.setHealth(newHealth);
    }
}

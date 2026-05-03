public class Character {
    protected String name;
    protected int health, maxHealth, mana, maxMana, ac;
    protected int str, dex, wis, con, cha;
    protected Weapon weapon;
    protected Armor armor;

    // Constructor
    public Character(String name, int health, int mana, int str, int dex, int wis) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.ac = armor.baseAc + dex;
        this.str = str;
        this.dex = dex;
        this.wis = wis;
        this.con = con;
        this.cha = cha;
        this.weapon = weapon;
        this.armor = armor;
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

    public int getConstitution() {
        return con;
    }

    public int getCharisma() {
        return cha;
    }

    // Setters
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

    public void setConstitution(int con) {
        this.con = con;
    }

    public void setCharisma(int cha) {
        this.cha = cha;
    }

    // Attack a target
    public void attack(Character target) {
        Auxiliary.say(name + " tryes to attack " + target.getName() + "...");
        int roll = Auxiliary.roll(str, 20, 0); // Hit dice

        // Hit
        if (roll >= ac) {
            Auxiliary.say(name + " hits " + target.getName() + "!\n");

            // Damage
            int dmg = Auxiliary.rollMin2Max(weapon.getMinDmg(), weapon.getMaxDmg(), weapon.getAttribute(this));
            if (roll == 20) { // Critical hit
                Auxiliary.say("It's a Critical Hit! Damage is doubled!");
                dmg *= 2;
            }

            Auxiliary.say("It causes " + dmg + " damage!");
            target.takeDamage(dmg);
        } else {
            // Miss
            Auxiliary.say(name + " misses!\n");
        }
    }

    // Check if the Character is alive (health > 0)
    public boolean isAlive() {
        return health > 0;
    }

    // Take damage and check if health is < 0
    public void takeDamage(int dmg) {
        int newHealth = health - dmg;
        if (newHealth < 0)
            newHealth = 0;
        setHealth(newHealth);
    }

    // Heal hp and check if health is > max
    public void heal(int amount) {
        int newHealth = health + amount;
        if (newHealth > maxHealth)
            newHealth = maxHealth;
        setHealth(newHealth);
    }
}

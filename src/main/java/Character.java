// Player
public class Character {
    // Variables
    String name, race;
    int health, maxHealth, mana, maxMana;
    int minDmg, maxDmg;

    // Constructor
    public Character(String name, int health, int mana, int minDmg, int maxDmg) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.mana = mana;
        this.maxMana = mana;
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
    }

    // Methods
    public void attack(Character enemy) {
        Auxiliary.say(this.name + " tryes to attack " + enemy.name + "...");
        int roll = Auxiliary.roll(1, 20); // Roll a dice

        if (roll >= 10) {
            Auxiliary.say(this.name + " hits " + enemy.name + "!\n");

            int dmg = Auxiliary.roll(this.minDmg, this.maxDmg);
            if (roll == 20) { // Critical hit
                Auxiliary.say("It's a Critical Hit! Your damage is doubled!");
                dmg *= 2;
            }

            Auxiliary.say("It causes " + dmg + " of damage!");
            enemy.takeDamage(dmg);
        } else {
            Auxiliary.say(this.name + " misses!\n");
        }
    }

    public void takeDamage(int dmg) {
        this.health -= dmg;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive(int health) {
        return 0 > this.health;
    }
}

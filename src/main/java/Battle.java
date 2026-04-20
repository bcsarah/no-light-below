// Battle
public class Battle {
    // Automatic battle
    public static void battle(Character hero, Character enemy) {

        while (hero.isAlive() && enemy.isAlive()) {
            String description = hero.name + " -> " + hero.health + "/" + hero.maxHealth + "\n"
                    + enemy.name + " -> " + enemy.health + "/" + enemy.maxHealth;

            Auxiliary.title("Battle!", description, null);

            int roll = Auxiliary.roll(1, 20);
            if (roll >= 10) {
                Auxiliary.say("You start!\n");
                hero.attack(enemy);
            } else {
                Auxiliary.say("Your enemy starts!\n");
                enemy.attack(hero);
            }
        }

        if (!enemy.isAlive()) {
            youWin();
        } else {
            youLose();
        }
    }

    // Rewards if you win or lose (da death)
    public static void youWin() {
    }

    public static void youLose() {
    }
}

// Battle
public class Battle {
    // Automatic battle
    public static void battle(Player hero, Enemy enemy) {
        boolean heroTurn = true;
        int initiative = Auxiliary.roll(hero.getDexterity(), 20);
        if (initiative < 8) {
            heroTurn = !heroTurn;
        }

        while (hero.isAlive() && enemy.isAlive()) {
            String description = hero.getName() + " -> " + hero.getHealth() + "/" + hero.getMaxHealth() + "\n"
                    + enemy.getName() + " -> " + enemy.getHealth() + "/" + enemy.getMaxHealth();

            Auxiliary.title("Battle!", description, null);

            if (heroTurn) {
                Auxiliary.say(hero.getName() + "'s turn!\n");
                hero.attack(enemy);
            } else {
                Auxiliary.say(enemy.getName() + "'s turn!\n");
                enemy.attack(hero);
            }

            heroTurn = !heroTurn;
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

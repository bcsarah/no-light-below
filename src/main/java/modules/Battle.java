public class Battle {
    // Automatic battle
    public static void battle(Character p1, Character p2) {
        // Initative
        boolean p1Turn = true;
        int initiative = Auxiliary.roll(p1.getDexterity(), 20);
        if (initiative < 8) {
            p1Turn = !p1Turn;
        }

        // Loop
        while (p1.isAlive() && p2.isAlive()) {
            String description = p1.getName() + " -> " + p1.getHealth() + "/" + p1.getMaxHealth() + "\n" + p2.getName() + " -> " + p2.getHealth() + "/" + p2.getMaxHealth();

            Auxiliary.title("Battle!", description, null);

            if (p1Turn) {
                Auxiliary.say(p1.getName() + "'s turn!\n");
                p1.attack(p2);
            } else {
                Auxiliary.say(p2.getName() + "'s turn!\n");
                p2.attack(p1);
            }

             p1Turn = !p1Turn;
        }

        // Check who wins
        if (!p2.isAlive()) {
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

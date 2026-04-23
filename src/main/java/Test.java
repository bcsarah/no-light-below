public class Test {
    // Test some thigs of the game (aka features, like battle and others)
    public static void test() {
        Skill stock = new Skill("Stock");

        Armor iron = new Armor("Iron", 13);
        Armor leather = new Armor("Leather", 11);
        Weapon sword = new Weapon("Sword", 2, 6, stock, 4);
        Weapon dagger = new Weapon("Dagger", 1, 4, stock, 4);

        Character sarah = new Character("Sarah", 25, 15, 2, 2, 1, sword, iron);
        Character goblin = new Character("Goblin", 10, 5, 2, 1, 0, dagger, leather);
        sarah.showSheet();
        goblin.showSheet();

        Battle.battle(sarah, goblin);
    }
}

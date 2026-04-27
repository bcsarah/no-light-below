public class Test {
    // Test some thigs of the game (aka features, like battle and others)
    public static void test() {
        Skill none = new Skill("None");

        Armor iron = new HeavyArmor("Iron", 13);
        Armor leather = new MediumArmor("Leather", 11);
        Armor cloth = new LightArmor("Iron", 10);

        Weapon sword = new Sword("Sword", 2, 6, none, 0);
        Weapon bow = new Bow("Bow", 2, 6, none, 0);
        Weapon staff = new Staff("Staff", 2, 6, none, 0);
        Weapon dagger = new Sword("Dagger", 1, 4, none, 0);

        Player sarah = new Player("Sarah", 25, 15, 2, 1, 1, 2, 1, sword, iron, 0, 1);
        Player psiu = new Player("Psiu", 20, 20, 1, 2, 2, 1, 1, bow, leather, 0, 1);
        Player weryka = new Player("Weryka", 15, 25, 1, 2, 2, 1, 1, staff, cloth, 0, 1);

        Enemy goblin = new Enemy("Goblin", 10, 5, 1, 2, 0, 1, 0, dagger, leather, 1);

        sarah.showSheet();
        psiu.showSheet();
        weryka.showSheet();
        goblin.showSheet();

        Battle.battle(sarah, goblin);
        goblin.heal(1000000);
        Battle.battle(psiu, goblin);
        goblin.heal(1000000);
        Battle.battle(weryka, goblin);
        goblin.heal(1000000);
    }
}

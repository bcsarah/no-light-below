public class Test {
    // Test some thigs of the game (aka features, like battle and others)
    public static void test() {
        Armor iron = new HeavyArmor("Iron", 13);
        Armor leather = new MediumArmor("Leather", 11);
        Armor cloth = new LightArmor("Iron", 10);

        Weapon sword = new Sword("Sword", 2, 6);
        Weapon bow = new Bow("Bow", 2, 6);
        Weapon staff = new Staff("Staff", 2, 6);
        Weapon dagger = new Sword("Dagger", 1, 4);

        Player sarah = new Player("Sarah", 25, 2, 1, 1, sword, iron, 0, 1);
        Player psiu = new Player("Psiu", 20, 1, 2, 2,  bow, leather, 0, 1);
        Player weryka = new Player("Weryka", 15, 1, 2, 2, staff, cloth, 0, 1);

        Enemy goblin = new Enemy("Goblin", 10, 1, 2, 0, dagger, leather, 1);

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

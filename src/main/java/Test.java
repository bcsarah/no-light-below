public class Test {
    // Test some thigs of the game (aka features, like battle and others)
    public static void test() {
        Player sarah = new Player("Sarah", 25, 15, 2, 2, 1, 2, 6);
        Enemy goblin = new Enemy("Goblin", 10, 5, 2, 1, 0, 1, 4);
        Battle.battle(sarah, goblin);
    }
}

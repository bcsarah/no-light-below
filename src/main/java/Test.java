// Test
public class Test {
    public static void test() {
        Player sarah = new Player("Sarah", 25, 15, 2, 2, 1, 2, 6);
        Enemy goblin = new Enemy("Goblin", 10, 5, 2, 1, 0, 1, 4);
        Battle.battle(sarah, goblin);
    }
}

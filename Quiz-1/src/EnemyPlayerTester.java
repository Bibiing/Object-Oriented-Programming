public class EnemyPlayerTester {
    public static void main(String[] args) {
        Player player = new Player("Bibing", 100, 20, 5);
        Enemy enemy = new Enemy("Hana", 80, 15, 3);

        // Start the battle
        player.attack(enemy);  // Player attacks Enemy
        enemy.attack(player);  // Enemy attacks Player
        player.attack(enemy);  // Player attacks Enemy again
    }
}

public class Enemy {
    private String name;
    private int health;
    private int power;
    private int defense;

    //Constructor to initialize the enemy's attributes
    public Enemy (String name, int health, int power, int defense){
        this.name = name;
        this.health = health;
        this.power = power;
        this.defense = defense;
    }

    // Getter method for the enemy's name
    public String getName(){
        return name;
    }

    // Getter method for the enemy's health
    public int getHealth(){
        return health;
    }

    // Setter method to update the enemy's health
    public void setHealth(int health){
        this.health = health;
    }

    // Getter method for the enemy's power
    public int getPower(){
        return power;
    }

    // Setter method to update the enemy's power
    public void setPower(int power){
        this.power = power;
    }

    // Getter method for the enemy's defense
    public int getDefense(){
        return defense;
    }

    // Setter method to update the enemy's defense
    public void setDefense(int defense){
        this.defense = defense;
    }

    // Attack method: this method allows the enemy to attack a player
    public void attack(Player player) {
        System.out.println(this.name + " attacks " + player.getName() + "!");
        player.takeDamage(this.power); // Call the player's takeDamage method with this enemy's power
    }

    // Take damage method: this method calculates and applies damage to the enemy
    public void takeDamage(int attackPower) {
        int damage = attackPower - this.defense;
        if (damage > 0) {
            this.health -= damage;
        } else {
            damage = 0;  // No negative damage
        }
        System.out.println(this.name + " takes " + damage + " damage!");
        if (this.health <= 0) {
            System.out.println(this.name + " died!");
        }
    }


}

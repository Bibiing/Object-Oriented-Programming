public class Player {
    //name, health, power, and defense.
    private String name;
    private int health;
    private int power;
    private int defense;

    // Constructor to initialize the player's attributes
    public Player (String name, int health, int power, int defense){
        this.name = name;
        this.health = health;
        this.power = power;
        this.defense = defense;
    }

    // Getter method for the player's name
    public String getName(){
        return name;
    }

    // Getter method for the player's health
    public int getHealth(){
        return health;
    }

    // Setter method to update the player's health
    public void setHealth(int health){
        this.health = health;
    }

    // Getter method for the player's power
    public int getPower(){
        return power;
    }

    // Setter method to update the player's power
    public void setPower(int power){
        this.power = power;
    }

    // Getter method for the player's defense
    public int getDefense(){
        return defense;
    }

    // Setter method to update the player's defense
    public void setDefense(int defense){
        this.defense = defense;
    }

    public void attack(Enemy enemy){
        System.out.println(this.name + " attacks " + enemy.getName() + "!");
        enemy.takeDamage(this.power);
    }

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

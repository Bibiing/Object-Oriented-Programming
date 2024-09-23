public class Player {
    //name, health, power, and defense.
    private String name;
    private int health;
    private int power;
    private int defense;

    public Player (String name, int health, int power, int defense){
        this.name = name;
        this.health = health;
        this.power = power;
        this.defense = defense;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getPower(){
        return power;
    }

    public void setPower(int power){
        this.power = power;
    }

    public int getDefense(){
        return defense;
    }

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

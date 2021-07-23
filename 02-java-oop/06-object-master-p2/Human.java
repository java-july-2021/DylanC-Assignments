public class Human{
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;

    public int health(){
        System.out.println("Current health is: " + this.health);
        return this.health;
    }

    public void attack(Human target){
        int targetHealth = target.getHealth();
        System.out.println("Damage dealt = " + strength);
        targetHealth -= strength;
        target.setHealth(targetHealth);
    }

    public Human(int health, int strength){
        this.health = health;
        this.strength = strength;
    }

    //Getters and Setters

    public void setStrength(int strength){
        this.strength = strength;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setStealth(int stealth){
        this.stealth = stealth;
    }

    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }

    public int getStrength(){
        return this.strength;
    }

    public int getHealth(){
        return this.health;
    }

    public int getIntelligence(){
        return this.intelligence;
    }

    public int getStealth(){
        return this.stealth;
    }


}
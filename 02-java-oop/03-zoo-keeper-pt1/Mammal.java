public class Mammal{
    protected int energy = 100;

    public int energyLevel(){
        System.out.println("Current energy level is: " + this.energy);
        return this.energy;
    }

    public Mammal(int energy){
        this.energy = energy;
    }
}
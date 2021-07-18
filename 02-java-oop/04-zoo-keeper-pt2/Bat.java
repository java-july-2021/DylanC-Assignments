public class Bat{
    private int energyLevel = 300;

    public int energy(){
        System.out.println("Current energy level is: " + this.energyLevel);
        return this.energyLevel;
    }

    public Bat(int energyLevel){
        this.energyLevel= energyLevel;
    }

    public void fly(){
        System.out.println("Whoooosssshhhh");
        this.energyLevel -= 50;
    }

    public void eatHumans(){
        this.energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("AHHHHH The town is on fireeee!!");
        this.energyLevel -= 100;
    }
}
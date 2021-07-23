public class Samurai extends Human{
    private static int numSamurai = 0;

    public Samurai(){
        this.health = 200;
        numSamurai++;
    }

    public void deathBlow(Human target){
        this.health = (this.health / 2);
        target.health -= target.health;
    }

    public void meditate(){
        this.health += (this.health / 2);
    }

    public void howMany(){
        System.out.print(numSamurai);
    }

}
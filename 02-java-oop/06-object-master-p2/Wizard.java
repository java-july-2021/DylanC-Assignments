public class Wizard extends Human{
    public Wizard(){
        super(50, 3);
        this.intelligence= 8;
    }

    public void heal(Human target){
        target.health += this.intelligence;
    }

    public void fireball(Human target){
        target.health -= (this.intelligence * 3 );
    }
}
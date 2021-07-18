public class Gorilla extends Mammal{
    public Gorilla(int energy){
        super(energy);
    }

    public void throwStuff(){
        System.out.println("throw stuff");
        this.energy -= 5;
    }

    public void eatBanana(){
        System.out.println("eat banana");
        this.energy += 10;
    }

    public void climb(){
        System.out.println("climb tree");
        this.energy -= 10;
    }


}
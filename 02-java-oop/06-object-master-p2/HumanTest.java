public class HumanTest{
    public static void main(String[]args){
        Human character1 = new Human(100, 3);
        Human character2 = new Human(100, 3);
        Ninja character3 = new Ninja();


        character3.steal(character1);
        character1.attack(character2);
        character2.health();
        character1.attack(character2);
        character1.attack(character2);
        character1.attack(character2);
        character2.health();
    }
} 
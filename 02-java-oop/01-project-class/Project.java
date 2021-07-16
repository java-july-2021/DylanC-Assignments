public class Project{

        //Attributes / Fields
    private String name;
    private String description;
    private double initialCost;

        //Methods
    public String elevatorPitch(){
        return this.name + " " + initialCost +" : " + description;
    }
        //Constructors
    public Project() {
        this.name = "Give me a name!";
        this.description = "Give me a description!";
        this.initialCost = 0;
    }

    public Project(String name) {
        this.name = name;
        this.description = "Give me a description!";
        this.initialCost = 0;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
        this.initialCost = 0;
    }

    public Project (String name, String description, double cost){
        this.name = name ;
        this.description = description;
        this.initialCost = cost;
    }

        //Getters and Setters
    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public double getCost(){
        return this.initialCost;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCost(double cost){
        this.initialCost = initialCost;
    }
}
public class ProjectTest{
    public static void main(String[] args){
        Project project1 = new Project();
        System.out.println(project1.getName());
        System.out.println(project1.getDescription());
        System.out.println(project1.elevatorPitch());
    

        Project project2 = new Project("Dylan");
        System.out.println(project2.getName());
        System.out.println(project2.getDescription());
        System.out.println(project2.elevatorPitch());

        Project project3 = new Project("Dylan", "Elevator music is awesome!");
        System.out.println(project3.elevatorPitch());
        project3.setName("Heather");
        project3.setDescription("This elevator music is terrible!");
        System.out.println(project3.getDescription());
        System.out.println(project3.elevatorPitch());

        Project project4 = new Project("Avery", "what is an elevator?", 5.14);
        System.out.println(project4.elevatorPitch());
    }
}
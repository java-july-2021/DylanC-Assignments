public class Notes {
    //Entry point method
    public static void main(String[]args){
        System.out.println("Hello World!");

        //variables
        byte myByte = 100; //Stores whole numbers from -128 to 127
        short myShort = 1000; //Stores whole numbers from -32768 to 32767
        int myInt = 1000000; //Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long myLong = 100000000000L;  //must end with uppercase L
        float myFloat = 3.1415f; //Stores fractional numbers good for 6-7 decimal places, must end with lowercase f
        double myDouble = 3.15415967; //Stores fractional numbners sufficient up to 15 decimal digits
        boolean myBool =true; //stores true or false values
        char myChar = 'c'; //Stores a single character/letter or ASCII value

        //Wrapper classes
        Integer myInteger = 10000; //Object of the int variable that we declared
        Character myCharacter = 'q';

        //Strings
        String myString = "Java July 2021";
        String myString2 = "Java July 2021";
        myString.equals(myString2);

        String bootcamp = "Java";
        String bootCamp = "July";
        String bootCAMP = "2021";
        
        System.out.println(bootcamp + bootCamp + bootCAMP);

        //Operator and Conditionals
        int isOdd = 5;
        int isOdd2 = 5;

        System.out.println(isOdd == isOdd2);
        
        if(isOdd % 2 != 0){
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is not odd");
        }

        //int i = 0;
        //while (i < 5){
        //System.out.println(i);
        //i++;
        //}
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        sayHello();
        System.out.println(sayHelloWithName("Cameron!"));
    }
    public static void sayHello() {
        System.out.println("Hello");
    }
    public static String sayHelloWithName(String name) {
        return "Hi " + name;
    }
}
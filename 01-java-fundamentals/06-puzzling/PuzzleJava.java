import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava{
    public void arraySum(int[] array){
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
            if (array[i] > 10){
                array2.add(array[i]);
            }           
        }        
        System.out.println(sum);
        System.out.println(array2);
    }
//Name Shuffle
    public void shuffleNames(String[] names){
        //System.out.println(Arrays.toString(names));
        ArrayList<String> names2 = new ArrayList<String>();
        ArrayList<String> names3 = new ArrayList<String>();
        for (int i = 0; i < names.length; i++){
            names3.add(names[i]);
            String temp = names[i];
            int max = temp.length();
            if(max > 5){
                names2.add(temp);
            }
        }
        Collections.shuffle(names3);
        System.out.println(names2);
        System.out.println(names3);
    }
//Alphabet Shuffle
    public void alphabet(){
        ArrayList<Character> theAlphabet = new ArrayList<Character>();
        for (char i = 'a'; i <= 'z'; i++){
            theAlphabet.add(i);
        }
        Collections.shuffle(theAlphabet);    
        System.out.println("The first letter of the array is " + theAlphabet.get(0) + ". The last letter of the array is " + theAlphabet.get(25));
        if(theAlphabet.get(0) == 'a' || theAlphabet.get(0) == 'e'|| theAlphabet.get(0) == 'i' || theAlphabet.get(0) == 'o' || theAlphabet.get(0) == 'u' ){
            System.out.println("The First letter is a vowel!");
        }
    }
//Generate Random nums between 55-100
    public void generateRandom(){
        Random gr = new Random(); 
        int[] random10 = new int[10];
        for (int r = 0; r < random10.length; r++){
            random10[r] = gr.nextInt(45) + 55;
        }
        System.out.println(Arrays.toString(random10));
    }
//Sort, min, max 
    public void sortMinMax(){
        Random gr = new Random();
        ArrayList<Integer> random10 = new ArrayList<Integer>();
        for (int r = 0; r < 10; r++){
            random10.add(gr.nextInt(45) + 55);
        }
        Collections.sort(random10);
        int min = random10.get(0);
        int max = random10.get(9);
        System.out.println(random10);
        System.out.println("The minimum number in the array is " + min + ", and the maximum number is " + max +".");
    }

    public String randomString(){
        Random rs = new Random();
        ArrayList<Character> randomChar = new ArrayList<Character>();
        ArrayList<Character> theAlphabet = new ArrayList<Character>();
        //String myRandomString = "";
        for (char i = 'a'; i <= 'z'; i++){
            theAlphabet.add(i);
        }
        Collections.shuffle(theAlphabet);
        for (char z = 0 ; z < 5; z++){
            randomChar.add(theAlphabet.get(z));
        }
        StringBuilder buildString = new StringBuilder();
            for (char myChar : randomChar){
                buildString.append(myChar);
            }
            System.out.println(buildString);
        return buildString.toString();
    }

    /*public void arrayRandomStrings(){
        Random rs = new Random();
        ArrayList<Character> randomChar = new ArrayList<Character>();
        ArrayList<Character> theAlphabet = new ArrayList<Character>();
        for (char i = 'a'; i <= 'z'; i++){
            theAlphabet.add(i);
        }
        Collections.shuffle(theAlphabet);
        for (char z = 0 ; z < 5; z++){
            randomChar.add(theAlphabet.get(z));
        }
        StringBuilder buildString = new StringBuilder();
            for (char myChar : randomChar){
                buildString.append(myChar);
            }
        ArrayList<String> arrayOfStrings = new ArrayList<String>();
        for (int w =0; w < 10; w++){
            arrayOfStrings.add(new buildString());
        }
        System.out.println(arrayOfStrings);

    }*/
    public void arrayRandomStrings(){
        String[] myStringsArray = new String[10];
        String newString = randomString();
        for (int i = 0; i < 10; i++){
            myStringsArray[i] = newString;
        }
        System.out.println(Arrays.toString(myStringsArray));
    }

}
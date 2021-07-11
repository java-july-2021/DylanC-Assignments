import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava{
    public void arrayPrint(){
        int[] array = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 1; i < array.length; i++){
            sum += array[i];
            if (array[i] > 10){
                array2.add(array[i]);
            }
        }
        System.out.println(sum);
        System.out.println(array2);
    }

    //public class arraySum(){

    //}

}
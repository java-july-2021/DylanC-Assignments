import java.util.Arrays;
import java.util.ArrayList;

public class Basics{
    public void nums(){
        for(int i = 1; i <= 255; i++){
            int number = i;
            System.out.println(number);
        }
    }

    public void nums2(){
        for (int o = 1; o <= 255; o++){
            if (o % 2 != 0){
                System.out.println(o);
            }
        }
    }

    public void nums3(){
        int number4 = 0;
        for (int j = 1; j <= 255; j++){
            int number3 = j;
            number4 += j;
            System.out.println("New number: " + number3 + " sum: " + number4);
        }
    }

    public void array1(){
        int[] array2 = {1, 3, 5, 7, 9, 13};
        for (int n = 0; n < array2.length; n++){
            System.out.println(array2[n]);
        }
    }

    public int findMax(){
        int[] array3 = {1, 12, -5, 19};
        int max= array3[0];
        for (int m = 0; m < array3.length; m++){
            if (array3[m] > max){
                max = array3[m];
            }
        }
        return max;
    }

    public void average(){
        int[] array4 = {2, 10, 3};
        double sum = 0;
        double average = 0;
        for (int a = 0; a < array4.length; a++){
            sum += array4[a];
            average = sum / array4.length;
        }
        System.out.println(average);
    }

    public void oddNums(){
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for (int b = 1; b <= 255; b++){
            if (b % 2 != 0){
                odds.add(b);
            }
        for (int box : odds){
            System.out.println(box);
            } 
        }
    }

    public void greaterThan(){
        int[] array5 = {1, 3, 5, 7};
        int y = 3;
        int z = 0;
        for (int c = 0; c < array5.length; c++){
            if (array5[c] > y){
                z++;
            }
        }
        System.out.println(z);        
    }

    public void elimNeg(){
        int[] array6 = {1, 5, 10, -2};
        for (int e = 0; e < array6.length; e++){
            if (array6[e] < 0){
                array6[e] = 0;
            }
        }
        System.out.println(Arrays.toString(array6));
    }

    public void maxMinAv(){
        double[] array7 = {1, 5, 10, 7, -2};
        double[] array8 = {1, 2, 3};
        double maxx = array7[0];
        for(int r = 0; r < array7.length; r++){
            if (array7[r] > maxx){
                maxx = array7[r];
            }
        }
        //return maxx;
        array8[0] = maxx;

        double minn = array7[0];
        for(int r = 0; r < array7.length; r++){
            if (array7[r] < minn){
                minn = array7[r];
            }
        }
        //return minn;
        array8[1] = minn;

        double averr = array7[0];
        double sum1 = 0;
        double average2 = 0;
        for (int a = 0; a < array7.length; a++){
            sum1 += array7[a];
            average2 = sum1 / array7.length;
        }
        //return average;
        array8[2] = average2;
        System.out.println(Arrays.toString(array8));
    }

    public void shiftArray(){
        int[] shift = {1, 5, 10, 7, -2};
        for (int s = 1; s < shift.length; s++){
            shift [s - 1] = shift[s];
        }
        shift[shift.length-1] = 0;        
        System.out.println(Arrays.toString(shift));
    }
}
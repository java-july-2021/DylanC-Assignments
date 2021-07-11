import java.util.Arrays;
import java.util.ArrayList;
//1
public class Basics{
    public void nums(int number){
        for(int i = 1; i <= number; i++){
            int numberSolve = i;
            System.out.println(numberSolve);
        }
    }
//2
    public void printOdds(int number2){
        for (int o = 1; o <= number2 ; o++){
            if (o % 2 != 0){
                System.out.println(o);
            }
        }
    }
//3
    public void sumOf(int addNum){
        int number4 = 0;
        for (int j = 1; j <= addNum; j++){
            int number3 = j;
            number4 += j;
            System.out.println("New number: " + number3 + " sum: " + number4);
        }
    }
//4
    public void arrayIterate(int[] x){
        for (int idk : x){
            System.out.println(idk);
        }
    }
//5
    public int findMax(int[] y){
        int max = y[0];
        for (int m = 0; m < y.length; m++){
            if (y[m] > max){
                max = y[m];
            }
        }
        return max;
    }
//6
    public int average(int[] p){
        int sum = 0;
        int average = 0;
        for (int a = 0; a < p.length; a++){
            sum += p[a];
            average = sum / p.length;
        }
        return average;
    }
//7
    public void oddNums(int ii){
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for (int b = 1; b <= ii; b++){
            if (b % 2 != 0){
                odds.add(b);
            }
        }
            System.out.println(odds);
    }
//8
    public void greaterThan(int[] aa){
        int y = 3;
        int z = 0;
        for (int c = 0; c < aa.length; c++){
            if (aa[c] > y){
                z++;
            }
        }
        System.out.println(z);        
    }
//9
    public void squared(int[] dd){
        for (int tt = 0; tt < dd.length; tt++){
            dd[tt] = dd[tt] * dd[tt];
        }
        System.out.println(Arrays.toString(dd));
    }
//10
    public void elimNeg(int[] ss){
        for (int e = 0; e < ss.length; e++){
            if (ss[e] < 0){
                ss[e] = 0;
            }
        }
        System.out.println(Arrays.toString(ss));
    }
//11
    public void maxMinAv(int[] mma){
        int[] array8 = {1, 2, 3};
        array8[0] = findMax(mma);
        array8[1] = findMin(mma);
        array8[2] = average(mma);
        System.out.println(Arrays.toString(array8));
    }
//12
    public void shiftArray(int[] hi){
        for (int s = 1; s < hi.length; s++){
            hi [s - 1] = hi[s];
        }
        hi[hi.length-1] = 0;        
        System.out.println(Arrays.toString(hi));
    }
//additional
    public int findMin(int[] y){
        int min = y[0];
        for (int m = 0; m < y.length; m++){
            if (y[m] < min){
                min = y[m];
            }
        }
        return min;
    }
}
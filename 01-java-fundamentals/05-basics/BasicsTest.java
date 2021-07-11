public class BasicsTest{
    public static void main(String[] args){
        Basics test = new Basics();
        test.nums(255);
    
        Basics test2 = new Basics();
        test2.printOdds(255);

        Basics test3 = new Basics();
        test3.sumOf(255);

        Basics test4 = new Basics();
        int[] test44 = {1, 3, 5, 7, 9, 13};
        test4.arrayIterate(test44);

        Basics test5 = new Basics();
        int[] array3 = {-1, -12, -5, -19};
        System.out.println(test5.findMax(array3));
    
        Basics test6= new Basics();
        int[] array4 = {2, 10, 3};
        test6.average(array4);

        Basics test7 = new Basics();
        test7.oddNums(255);

        Basics test8 = new Basics();
        int[] array5 = {1, 3, 5, 7};
        test8.greaterThan(array5);

        Basics test9 = new Basics();
        int[] array6 = {1, 5 ,10 ,-2};
        test9.squared(array6);

        Basics test10 = new Basics();
        int[] array7 = {1, 5, 10, -2};
        test10.elimNeg(array7);

        Basics test11 = new Basics();
        int[] array8 = {1, 5, 10, 7, -2};
        test11.maxMinAv(array8);

        Basics test12 = new Basics();
        int[] shift = {1, 5, 10, 7, -2};
        test12.shiftArray(shift);

    }
}
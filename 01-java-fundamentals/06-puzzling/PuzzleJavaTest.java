public class PuzzleJavaTest{
    public static void main(String[]args){

        PuzzleJava tester = new PuzzleJava();

        int[] test1 = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        tester.arraySum(test1);

        String[] test2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        tester.shuffleNames(test2);

        tester.alphabet();

        tester.generateRandom();

        tester.sortMinMax();

        tester.randomString();

        tester.arrayRandomStrings();
    }
}
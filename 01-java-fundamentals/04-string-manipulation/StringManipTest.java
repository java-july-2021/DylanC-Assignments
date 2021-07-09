public class StringManipTest{
    public static void main(String[] args){
        StringManip trimTest = new StringManip();
            String tester = trimTest.trimAndConcat("    Hello     ", "  World  ");
            System.out.println(tester);

        StringManip indexOf = new StringManip();
            char letter = 'o';
            Integer a = indexOf.getIndexOrNull("Coding", letter);
            Integer b = indexOf.getIndexOrNull("Hello World", letter);
            Integer c = indexOf.getIndexOrNull("Hi", letter);
            System.out.println(a); // 1
            System.out.println(b); // 4
            System.out.println(c); // null
            
        StringManip manipulator = new StringManip();
            String word = "Hello";
            String subString = "llo";
            String notSubString = "world";
            Integer d = manipulator.getIndexOrNull(word, subString);
            Integer e = manipulator.getIndexOrNull(word, notSubString);
            System.out.println(d); // 2
            System.out.println(e); // null

        StringManip manipulator2 = new StringManip();
            String word2 = manipulator2.concatSubstring("Hello", 1, 2, "world");
            System.out.println(word2); // eworld
    }
}
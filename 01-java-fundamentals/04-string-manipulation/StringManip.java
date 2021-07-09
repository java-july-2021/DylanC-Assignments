public class StringManip{
    public String trimAndConcat(String st1, String st2){
        return st1.trim().concat(st2.trim());
    }

    public Integer getIndexOrNull(String st3, char letter){
        if (st3.indexOf(letter) == -1){
            return null;
        } else {
            return st3.indexOf(letter);
        }
    }
    public Integer getIndexOrNull(String st4, String st5){
        if (st4.indexOf(st5) == -1){
            return null;
        } else {
            return st4.indexOf(st5);
        }
    }

    public String concatSubstring(String st6, int num1, int num2, String st7){
        String newString = st6.substring(num1, num2);
        return newString + st7;
        }
}
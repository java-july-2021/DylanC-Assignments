public class CalculatorTest{
    public static void main(String[] args){
        Calculator myCalc = new Calculator();

        myCalc.setNum1(10.5);
        myCalc.setNum2(5.2);
        myCalc.setOperator('+');
        myCalc.execute();
        myCalc.result();
    }
}
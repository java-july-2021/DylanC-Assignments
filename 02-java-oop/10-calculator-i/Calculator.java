public class Calculator{
    private double result;
    private double num1;
    private double num2;
    private char operator;

    public Calculator(){
    }

    public void setNum1(double input){
        this.num1 = input;
    }

    public void setNum2(double input){
        this.num2 = input;
    }

    public void setOperator(char operator){
        this.operator = operator;
    }

    public void execute(){
        if (this.operator == '+'){
            result = (num1) + (num2);
        }
        if (this.operator == '-'){
            result = (num1) + (num2);
        }
    }

    public void result(){
        System.out.println(result);
    }
}
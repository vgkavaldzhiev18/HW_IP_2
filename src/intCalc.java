import java.util.Scanner;

public class intCalc {

    private int value1;
    private int value2;

    public intCalc(){
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public void intCalcDiv()
    {
        System.out.println("Division:"+value1/value2);
    }

    public void intCalcMul(){
        System.out.println("Multiplication:"+value1*value2);
    }
}

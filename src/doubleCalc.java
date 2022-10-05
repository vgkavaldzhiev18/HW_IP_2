public class doubleCalc {

    private double value1;
    private double value2;

    public doubleCalc(){
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public void doubleCalcDiv()
    {

        System.out.println("Division:"+value1/value2);
    }

    public void doubleCalcMul(){

        System.out.println("Multiplication:"+value1*value2);
    }


}

public class longCalc {

    private long value1;
    private long value2;

    public longCalc(){
    }

    public void setValue1(long value1) {
        this.value1 = value1;
    }

    public void setValue2(long value2) {
        this.value2 = value2;
    }

    public void longCalcDiv()
    {
        System.out.println("Division:"+value1/value2);
    }

    public void longCalcMul(){
        System.out.println("Multiplication:"+value1*value2);
    }

}

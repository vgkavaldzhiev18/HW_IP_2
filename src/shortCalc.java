public class shortCalc {

    private short value1;
    private short value2;

    public shortCalc(){
    }

    public void setValue1(short value1) {
        this.value1 = value1;
    }

    public void setValue2(short value2) {
        this.value2 = value2;
    }

    public void shortCalcDiv()
    {
        System.out.println("Division:"+value1/value2);
    }

    public void shortCalcMul(){
        System.out.println("Multiplication:"+value1*value2);
    }

}

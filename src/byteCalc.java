public class byteCalc {

    private byte value1;
    private byte value2;

    public byteCalc(){
    }

    public void setValue1(byte value1) {
        this.value1 = value1;
    }

    public void setValue2(byte value2) {
        this.value2 = value2;
    }

    public void byteCalcDiv()
    {

        System.out.println("Division:"+ value1/value2);
    }

    public void byteCalcMul(){

        System.out.println("Multiplication:"+ value1*value2);
    }

}

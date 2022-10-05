public class floatCalc {

    private float value1;
    private float value2;

    public floatCalc(){
    }

    public void setValue1(float value1) {
        this.value1 = value1;
    }

    public void setValue2(float value2) {
        this.value2 = value2;
    }

    public void floatCalcDiv()
    {

        System.out.printf("Division:","%.2f", value1/value2);
    }

    public void floatCalcMul(){

        System.out.printf("Multiplication:","%.2f", value1*value2);
    }

}

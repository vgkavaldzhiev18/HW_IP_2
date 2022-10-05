import java.util.Scanner;
public class Calculator {
    //System.out.println("Wrong Input. Please try again!\n");
    //choice=scan.nextInt();
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("\nHello to my division/multiplication calculator.\n" +
                "Please choose what type of data you want to calculate.\n" +
                "1.Integer\n" +
                "2.Double\n" +
                "3.Float\n" +
                "4.Byte\n");

        int choice=scan.nextInt();
        while(choice>0 || choice<4) {

            //Integer division and multiplication
            if(choice==1)
            {
                System.out.println("You chose Integer!");
                intCalc intCalculator = new intCalc();

                System.out.println("Please enter a positive value for the first number");
                int value1=scan.nextInt();
                while(value1<0) {
                    System.out.println("Wrong Input! Please try again");
                    value1=scan.nextInt();
                }
                intCalculator.setValue1(value1);

                System.out.println("Please enter a positive value for the second number");
                int value2=scan.nextInt();
                while(value2==0) {
                    System.out.println("Wrong Input! You can't divide by 0. Try again!");
                    value2=scan.nextInt();
                }
                while(value2<0) {
                    System.out.println("Wrong Input! Please try again");
                    value2=scan.nextInt();
                }
                intCalculator.setValue2(value2);

                intCalculator.intCalcDiv();

                intCalculator.intCalcMul();
            }

            //Double division and multiplication
            else if(choice==2)
            {

                System.out.println("You chose Double!");

                doubleCalc doubleCalculator = new doubleCalc();

                System.out.println("Please enter a positive value for the first number");
                double value1=scan.nextDouble();
                while(value1<0) {
                    System.out.println("Wrong Input! Please try again");
                    value1=scan.nextDouble();
                }
                doubleCalculator.setValue1(value1);

                System.out.println("Please enter a positive value for the second number");
                double value2=scan.nextDouble();
                while(value2==0) {
                    System.out.println("Wrong Input! You can't divide by 0. Try again!");
                    value2=scan.nextDouble();
                }
                while(value2<0) {
                    System.out.println("Wrong Input! Please try again");
                    value2=scan.nextDouble();
                }
                doubleCalculator.setValue2(value2);

                doubleCalculator.doubleCalcDiv();

                doubleCalculator.doubleCalcMul();


            }

            //Float division and multiplication
            else if(choice==3)
            {
                System.out.println("You chose Float!");

                floatCalc floatCalculator = new floatCalc();

                System.out.println("Please enter a positive value for the first number");
                float value1=scan.nextFloat();
                while(value1<0) {
                    System.out.println("Wrong Input! Please try again");
                    value1=scan.nextFloat();
                }
                floatCalculator.setValue1(value1);

                System.out.println("Please enter a positive value for the second number");
                float value2=scan.nextFloat();
                while(value2==0) {
                    System.out.println("Wrong Input! You can't divide by 0. Try again!");
                    value2=scan.nextFloat();
                }
                while(value2<0) {
                    System.out.println("Wrong Input! Please try again");
                    value2=scan.nextFloat();
                }
                floatCalculator.setValue2(value2);

                floatCalculator.floatCalcDiv();

                floatCalculator.floatCalcMul();

            }

            //Byte division and multiplication
            else if(choice==4)
            {
                System.out.println("You chose Byte!");

                byteCalc byteCalculator = new byteCalc();

                System.out.println("Please enter a positive value for the first number");
                byte value1=scan.nextByte();
                while(value1<0) {
                    System.out.println("Wrong Input! Please try again");
                    value1=scan.nextByte();
                }
                byteCalculator.setValue1(value1);

                System.out.println("Please enter a positive value for the second number");
                byte value2=scan.nextByte();
                while(value2==0) {
                    System.out.println("Wrong Input! You can't divide by 0. Try again!");
                    value2=scan.nextByte();
                }
                while(value2<0) {
                    System.out.println("Wrong Input! Please try again");
                    value2=scan.nextByte();
                }
                byteCalculator.setValue2(value2);

                byteCalculator.byteCalcDiv();

                byteCalculator.byteCalcMul();
            }

            System.out.println("\nDo you want to continue?\n" +
                    "1.Yes\n" +
                    "2.No");

            int yesOrNo=scan.nextInt();
            while(yesOrNo<0 || yesOrNo>2)
            {
                System.out.println("Wrong input! Please try again!");
                yesOrNo=scan.nextInt();
            }

            if(yesOrNo==1)
            {
                System.out.println("\nPlease choose what type of data you want to calculate.\n" +
                        "1.Integer\n" +
                        "2.Double\n" +
                        "3.Float\n" +
                        "4.Byte\n");
                choice=scan.nextInt();
                while(choice<0 || choice>4)
                {
                    System.out.println("Wrong Input! Please try again!");
                    choice = scan.nextInt();
                }
            }
            else if(yesOrNo==2) {
                System.out.println("Thank you for using my calculator, bye!");
                System.exit(0);
            }

        }




    }

}

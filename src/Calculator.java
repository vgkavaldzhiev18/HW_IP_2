import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("\nHello to my division/multiplication calculator.\n" +
                "Please choose what type of data you want to calculate.\n" +
                "1.Integer\n" +
                "2.Double\n" +
                "3.Float\n" +
                "4.Byte\n" +
                "5.Short\n" +
                "6.Long\n");

        int choice=scan.nextInt();
        while(choice>0 || choice<6) {

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

            else if(choice==5)
            {

                System.out.println("You chose Short!");

                shortCalc shortCalculator = new shortCalc();

                System.out.println("Please enter a positive value for the first number");
                short value1=scan.nextShort();
                while(value1<0) {
                    System.out.println("Wrong Input! Please try again");
                    value1=scan.nextShort();
                }
                shortCalculator.setValue1(value1);

                System.out.println("Please enter a positive value for the second number");
                short value2=scan.nextShort();
                while(value2==0) {
                    System.out.println("Wrong Input! You can't divide by 0. Try again!");
                    value2=scan.nextShort();
                }
                while(value2<0) {
                    System.out.println("Wrong Input! Please try again");
                    value2=scan.nextShort();
                }
                shortCalculator.setValue2(value2);

                shortCalculator.shortCalcDiv();

                shortCalculator.shortCalcMul();
            }

            else if(choice==6)
            {

                System.out.println("You chose Long!");

                longCalc longCalculator = new longCalc();

                System.out.println("Please enter a positive value for the first number");
                long value1=scan.nextLong();
                while(value1<0) {
                    System.out.println("Wrong Input! Please try again");
                    value1=scan.nextLong();
                }
                longCalculator.setValue1(value1);

                System.out.println("Please enter a positive value for the second number");
                long value2=scan.nextLong();
                while(value2==0) {
                    System.out.println("Wrong Input! You can't divide by 0. Try again!");
                    value2=scan.nextLong();
                }
                while(value2<0) {
                    System.out.println("Wrong Input! Please try again");
                    value2=scan.nextLong();
                }
                longCalculator.setValue2(value2);

                longCalculator.longCalcDiv();

                longCalculator.longCalcMul();
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
                        "4.Byte\n" +
                        "5.Short\n" +
                        "6.Long\n");
                choice=scan.nextInt();
                while(choice<0 || choice>6)
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

import java.io.File;
import java.util.Scanner;

public class Main {
    private static AbstractCalculator rationalCalculator;
    public static void main(String[] args) {
        //NumberTester numberTester = new NumberTester("Numbers.txt");
        //numberTester.testFile();
        AbstractCalculator calculator;
        while(true) {
            System.out.println("Choose calculator");
            System.out.println("1 - Rational calculator");
            System.out.println("2 - Vector calculator");
            System.out.println("3 - Complex calculator");
            System.out.println("4 - Exit programm");
            Scanner s = new Scanner(System.in);
            int number = s.nextInt();
            Number number1 = new Number();
            Number number2 = new Number();
            do {
                switch (number) {
                    case 1:
                        System.out.println("Please enter the first number");
                        number1.setA(s.nextInt());
                        System.out.println("Please enter the second number");
                        number2.setB(s.nextInt());
                        calculator = rationalCalculator;
                        break;

                    case 2:
                        System.out.println("Please enter the first number of vector one");
                        System.out.println("Please enter the second number of vector one");
                        System.out.println("Please enter the first number of vector two");
                        System.out.println("Please enter the second number of vector two");

                    case 3:

                    case 4:
                        System.exit(0);
                        break;

                }
                System.out.println("Choose operation");
                System.out.println("1 - add");
                System.out.println("2 - subtract");
                System.out.println("3 - multiply");
                System.out.println("4 - divide");
                System.out.println("5 - enter numbers again");
            }while(number == 5);

            Number result = null;
            System.out.println("Result");
            System.out.println("a = " + result.getA());
            System.out.println("a = " + result.getB());


        }
    }

    private static void CalculationOperations(){
        CalculationOperation add;
        CalculationOperation sub;
        CalculationOperation mult;
        CalculationOperation div;

        add = (x, y) -> {
            Number result = new Number();
            result.setA(x.getA() + y.getA());
            return result;
        };
        sub = (x, y) -> {
            Number result = new Number();
            result.setA(x.getA() - y.getA());
            return result;
        };
        mult = (x, y) -> {
            Number result = new Number();
            result.setA(x.getA() * y.getA());
            return result;
        };
        div = ((x, y) -> {
            Number result = new Number();
            result.setA(x.getA() / y.getA());
            return result;
        });
        rationalCalculator = new RationalCalculator(add, sub, mult, div);

    }

}
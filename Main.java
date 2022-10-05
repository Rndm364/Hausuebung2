import java.io.File;
import java.util.Scanner;

public class Main {
    private static AbstractCalculator rationalCalculator;
    private static AbstractCalculator vectorCalculator;
    private static AbstractCalculator complexCalculator;

    public static void main(String[] args) {
        //NumberTester numberTester = new NumberTester("Numbers.txt");
        //numberTester.testFile();
        AbstractCalculator calculator = null;
        Number result = null;
        CalculationOperations();
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
                        System.out.print("Enter number a ");
                        number1.setA(s.nextDouble());
                        System.out.print("Enter number b ");
                        number2.setA(s.nextDouble());
                        break;
                    case 2:
                        System.out.print("Enter number a 1> ");
                        number1.setA(s.nextInt());
                        System.out.print("Enter number a 2> ");
                        number2.setB(s.nextInt());
                        System.out.print("Enter number b 1> ");
                        number1.setA(s.nextInt());
                        System.out.print("Enter number b 2> ");
                        number2.setB(s.nextInt());
                        break;
                    case 3:
                        System.out.print("Enter number a complex ");
                        number1.setA(s.nextInt());
                        System.out.print("Enter number a imaginary ");
                        number2.setB(s.nextInt());
                        System.out.print("Enter number b complex ");
                        number1.setA(s.nextInt());
                        System.out.print("Enter number b imaginary ");
                        number2.setB(s.nextInt());
                        break;
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
                number = s.nextInt();
                if (number == 5){
                    continue;
                }
                calculator = getData(s, number, calculator, number1, number2);
            }while(number == 5);
            result = calculate(number, calculator, number1, number2);
            Result(result);

        }
    }
    private static void Result(Number result) {
        System.out.println("Result:");
        System.out.println("a = " + result.getA());
        System.out.println("b = " + result.getB());
    }

    private static void CalculationOperations(){
        CalculationOperation Radd;
        CalculationOperation Rsub;
        CalculationOperation Rmult;
        CalculationOperation Rdiv;

        Radd = (x, y) -> {
            Number result = new Number();
            result.setA(x.getA() + y.getA());
            return result;
        };
        Rsub = (x, y) -> {
            Number result = new Number();
            result.setA(x.getA() - y.getA());
            return result;
        };
        Rmult = (x, y) -> {
            Number result = new Number();
            result.setA(x.getA() * y.getA());
            return result;
        };
        Rdiv = ((x, y) -> {
            Number result = new Number();
            result.setA(x.getA() / y.getA());
            return result;
        });
        rationalCalculator = new RationalCalculator(Radd, Rsub, Rmult, Rdiv);

        CalculationOperation Vadd;
        CalculationOperation Vsub;
        CalculationOperation Vmult;
        CalculationOperation Vdiv;

    }
    private static Number calculate(int number, AbstractCalculator calculator, Number number1, Number number2) {
        Number result = null;
        switch (number) {
            case 1:
                result = calculator.add(number1, number2);
                break;
            case 2:
                result = calculator.subtract(number1, number2);
                break;
            case 3:
                result = calculator.multiply(number1, number2);
                break;
            case 4:
                result = calculator.divide(number1, number2);
                break;
        }
        return result;
    }

    private static AbstractCalculator getData(Scanner s, int number, AbstractCalculator calculator, Number number1, Number number2) {
        switch (number){
            case 1:
                calculator = rationalCalculator;
                break;
            case 2:
                calculator = vectorCalculator;
                break;
            case 3:
                calculator = complexCalculator;
                break;
        }
        return calculator;
    }




}
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberTester numberTester = new NumberTester("Numbers.txt");
        numberTester.testFile();

        System.out.println("Choose calculator");
        System.out.println("1 - Rational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("3 - Complex calculator");
        System.out.println("4 - Exit programm");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        Number number1 = new Number();
        Number number2 = new Number();
        switch(number){
            case 1:
                System.out.println("Please enter the first number");
                number1.setA(s.nextInt());
                System.out.println("Please enter the second number");
                number2.setB(s.nextInt());

            case 2:
            case 3:

            case 4: System.exit(0); break;
            default:
        }
        operationTypes();
    }
    private static void operationTypes(){
        System.out.println("Choose operation");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter numbers again");
    }

}
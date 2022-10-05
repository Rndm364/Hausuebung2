import java.beans.XMLDecoder;
import java.io.*;
import java.util.Scanner;

public class NumberTester {

    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    private String fileName;

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester ;
    }

    public void setPrimeTester(NumberTest primeTester){
            this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }

    public void testFile(){

        try {
            Scanner s = null;

            String strCurrentLine;

            s = new Scanner(new File(fileName));

            int zahl = Integer.parseInt(s.nextLine());

                for(int i = 0; i < zahl; i++ ) {
                    String line = s.nextLine();
                    String[] parts = line.split(" ");
                    switch (Integer.parseInt(parts[0])) {
                        case 1:
                            if (oddTester.testNumber(Integer.parseInt(parts[1]))) {
                                System.out.println("ODD");
                                break;
                            } else {
                                System.out.println("EVEN");
                            }
                            break;
                        case 2:
                            if (primeTester.testNumber(Integer.parseInt(parts[1]))) {
                                System.out.println("PRIME");
                                break;
                            } else {
                                System.out.println("NO PRIME");
                            }
                            break;
                        case 3:
                            if (palindromeTester.testNumber(Integer.parseInt(parts[1]))) {
                                System.out.println("PALINDROME");
                                break;
                            } else {
                                System.out.println("NO PALINDROME");
                            }
                            break;
                    }
                }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



}

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
            Scanner s = new Scanner(new File(fileName));
            int zahl = Integer.parseInt(s.nextLine());
                for(int i = 0; i < zahl; i++ ) {
                    String line = s.nextLine();
                    String[] parts = line.split(" ");
                    System.out.println(line);
                }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



}

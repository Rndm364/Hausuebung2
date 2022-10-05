import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavamitForEach {

    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();

        for(var a : liste){
            System.out.printf(a);
        }
        Consumer<String> consumer = (String s) -> System.out.println(s);
        liste.forEach(System.out :: print );
    }

}

import java.text.NumberFormat;
import java.text.ParseException;

public class Execoes {
    public static void main(String[] args) throws ParseException {
        Number valor = Double.valueOf("a1.75");

        valor = NumberFormat.getInsta nce().parse("a1.75");
        System.out.println(valor);
    }
}

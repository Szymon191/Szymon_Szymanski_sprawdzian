import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<RownanieKwadratowe> rownania = new ArrayList<>();

        rownania.add(new RownanieKwadratowe(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
        rownania.add(new RownanieKwadratowe(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
        rownania.add(new RownanieKwadratowe(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
        rownania.add(new RownanieKwadratowe(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));

        System.out.println(rownania.get(3).toString());
        Double suma = rownania.get(0).getA() + rownania.get(0).getB() + rownania.get(0).getC();

        Function<Double,Boolean> parzyste = (Double x) -> x%2==0;
        System.out.println(parzyste.apply(suma));

        rownania.sort(new Comparator<RownanieKwadratowe>() {
            @Override
            public int compare(RownanieKwadratowe o1, RownanieKwadratowe o2) {
                return 0;
            }
        });



    }
}
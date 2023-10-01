import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        boolean res = 100 <= x && x <= 999 && x % 5 == 0;
        System.out.println(res);
    }
}

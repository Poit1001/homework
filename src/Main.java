import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        boolean res = -3 <= x && x <= 5 || 9 <= x && x <= 15;
        System.out.println(res);
    }
}
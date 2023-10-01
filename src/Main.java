import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        boolean res = -2 <= x && x <= 3 || 6 <= x && x <= 9;
        System.out.println(res);
    }
}
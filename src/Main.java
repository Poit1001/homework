import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int x1 = in.nextInt(), x2 = in.nextInt(), x3 = in.nextInt();
        boolean res = (x1 % 2) == 0 && (x2 % 2 == 0 || x3 % 2 == 0) || (x2 % 2 == 0 && x3 % 2 == 0);
        System.out.println(res);
    }
}
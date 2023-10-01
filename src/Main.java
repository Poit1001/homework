import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int x1 = in.nextInt(), x2 = in.nextInt(), x3 = in.nextInt(), x4 = in.nextInt();
        boolean res = x1==-x2 || x1 == -x3 || x1 == -x4 ||  x2 == -x3 || x2 == -x4 || x3 == -x4;
        System.out.println(res);
    }
}
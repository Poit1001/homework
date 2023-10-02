import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x % 10 == 1 && x % 100 != 11) System.out.println(x + " TORT");
        else if (5 <= x % 100 && x % 100 <= 20) System.out.println(x + " TORTOV");
        else if (x % 10 >= 2 && x % 10 <= 4) System.out.println(x + " TORTA");
        else if (x % 10 == 0 || x % 10 >= 5 || x % 100 == 11) System.out.println(x + " TORTOV");
    }
}
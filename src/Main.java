import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), x1 = in.nextInt(), x2 = in.nextInt();
        if (x >= x1 && x >= x2) {
            if (x1>=x2) System.out.println(x2 + " " + x1 + " " + x);
            else System.out.println(x1 + " " + x2 + " " + x);
            }
        else if (x1 >= x && x1 >= x2) {
            if (x >= x2) System.out.println(x2 + " " + x + " " + x1);
            else System.out.println(x + " " + x2 + " " + x1);
            }
        else {
            if (x >= x1) System.out.println(x1 + " " + x + " " + x2);
            else System.out.println(x + " " + x1 + " " + x2);
            }
        }
    }
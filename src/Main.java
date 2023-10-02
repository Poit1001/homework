import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (0 <= x && x <=9) System.out.println("DIGIT");
        else if (10 <= x && x <= 99) System.out.println("NUM");
        else System.out.println("OTHER");
    }
}
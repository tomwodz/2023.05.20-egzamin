import java.util.Arrays;
import java.util.Scanner;

public class KucharzRek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give quantity apple, orange and coins: ");
        String str = scanner.nextLine();
        String[] strDane = str.split(" ");
        //System.out.println(Arrays.toString(strDane));
        int apple = Integer.parseInt(strDane[0]);
        int orange = Integer.parseInt(strDane[1]);
        int coins = Integer.parseInt(strDane[2]);
        System.out.println(rek(apple, orange, coins));
    }

    public static String rek(int apple, int orange, int coins) {
        if (coins <= 0) {
            return new StringBuilder()
                    .append("Apple: ")
                    .append(apple)
                    .append(" Orange: ")
                    .append(orange)
                    .append(" Coins: ")
                    .append(coins)
                    .toString();
        } else {
            if (apple > orange) {
                return rek(apple, orange + 1, coins - 1);
            } else {
                return rek(apple + 1, orange, coins - 1);
            }
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

//J P Z (ilość jabłek, ilość pomarańczy, ilość złotych monet).
public class Kucharz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give quantity apple, orange and coins: ");
        String str = scanner.nextLine();
        String[] strDane = str.split(" ");
        //System.out.println(Arrays.toString(strDane));
        int apple = Integer.parseInt(strDane[0]);
        int orange = Integer.parseInt(strDane[1]);
        int coins = Integer.parseInt(strDane[2]);
        while (coins > 0) {
            if (apple > orange) {
                orange++;
                coins--;
            } else {
                apple++;
                coins--;
            }
        }
        System.out.println("Apple: " + apple);
        System.out.println("Orange: " + orange);
        System.out.println("Coins: " + coins);
    }
}

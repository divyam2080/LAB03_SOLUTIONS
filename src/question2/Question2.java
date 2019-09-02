package question2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = scan.nextDouble();
        scan.close();
        price = price * 100;
        int a = ((int) price % 100 );
        int b = ((int) price / 100);
        System.out.println(b + " rupees " + a + " paisa " );
    }
}

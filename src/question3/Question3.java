package question3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double f = scan.nextDouble();
        scan.close();
        double c = (f - 32)/1.8;
        System.out.println(c);
    }
}

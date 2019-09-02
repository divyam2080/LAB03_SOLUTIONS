package question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    double s = 0;
    for (int i = 1; i <= n; i++){
        s = s + ((double)1 / i);
    }
    System.out.println(s);
    scan.close();
}
}

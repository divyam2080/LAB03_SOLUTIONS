package lab04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        char gender = scan.next().trim().charAt(0);
        Person myself = new Person(name,age,gender);
        System.out.println(myself.toString());
    }
}

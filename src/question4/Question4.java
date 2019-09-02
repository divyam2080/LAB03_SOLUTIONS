package question4;

public class Question4 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = i; j > 0 ; j--) {
                System.out.print(i);
                System.out.print(" ");
                if ( j == 1){
                    System.out.println();
                }

            }

        }
    }
}

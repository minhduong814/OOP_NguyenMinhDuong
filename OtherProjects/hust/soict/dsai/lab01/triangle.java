import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = keyboard.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) 
                System.out.print(" ");
            for (int j = 1; j <= i*2 - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

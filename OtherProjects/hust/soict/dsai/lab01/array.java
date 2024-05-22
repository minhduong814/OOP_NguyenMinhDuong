import java.util.Scanner;
import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
            sum += a[i];
        }
        Arrays.sort(a, 0, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + (double) sum/n);
    }
}

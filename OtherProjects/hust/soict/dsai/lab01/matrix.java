import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of rows and columns (separated by space): ");
        int n = input.nextInt(), m = input.nextInt();
        int[][] a = new int[n][m], b = new int[n][m];

        System.out.println("Enter the first matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the second matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = input.nextInt();
                a[i][j] += b[i][j];
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++)
                System.out.print(a[i][j] + " ");
        }
    }
}

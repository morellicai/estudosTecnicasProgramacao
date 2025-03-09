import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {3, 4, 2, 1};
        int[] b = {9, 4, 7 };
        barras(a, 4);
        // char c = scanner.next().charAt(0);
        barras(b, 3);
        scanner.close();
    }
    public static void barras(int[] a, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[i]; j++) {
                System.out.print("|");
            }
            System.out.println();
        }
    }
}

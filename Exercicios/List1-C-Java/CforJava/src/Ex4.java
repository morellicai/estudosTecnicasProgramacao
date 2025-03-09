import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, f;
        System.out.println("Numero? ");
        n = Integer.parseInt(scanner.nextLine());
        f = 1;
        for(int i = 1; i <= n; i++){
            f *= i;
        }
        System.out.println(String.format("Fatorial: %d", f));
        scanner.close();
    }
}

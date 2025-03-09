import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Digite um número: ");
        n = Integer.parseInt(scanner.nextLine());
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        System.out.println(String.format("Soma dos digitos = %d", s));
        scanner.close();
    }
}

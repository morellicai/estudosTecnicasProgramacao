import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float p, a, i;
        System.out.println("Peso e altura? ");
        p = Float.parseFloat(scanner.nextLine());
        a = Float.parseFloat(scanner.nextLine());
        i = p / (a * a);
        System.out.println(String.format("IMC: %.2f", i));
        scanner.close();
    }
}
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p;
        System.out.println("Digite a placa: ");
        p = Integer.parseInt(scanner.nextLine());
        switch (p % 10) {
            case 1: case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3: case 4:
                System.out.println("Terça-Feira");
                break;
            case 5: case 6:
                System.out.println("Quarta-Feira");
                break;
            case 7: case 8:
                System.out.println("Quinta-Feira");
                break;
            default:
                System.out.println("Sexta-Feira");
                break;
            }
        scanner.close();
    }
}
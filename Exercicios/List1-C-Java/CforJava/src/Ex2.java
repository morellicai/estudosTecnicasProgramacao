import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float p, a, i;
        System.out.println("Peso e altura? ");
        p = Float.parseFloat(scanner.nextLine());
        a = Float.parseFloat(scanner.nextLine());
        i = p / (a * a);
        System.out.println(String.format("IMC: %.2f", i));
        if(i < 18.5){
            System.out.println("Abaixo do peso");
        } else if(i > 30){
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Peso normal");
        }
        scanner.close();
    }
}
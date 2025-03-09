import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rand = (int) (Math.random() * 7) + 1;
        int c = 0;
        do {
            System.out.println("Chute entre 1 e 7:");
            c = scanner.nextInt();
            if(c < rand){
                System.out.println("Baixo!");
            } else if(c > rand){
                System.out.println("Alto!");
            }
        } while (c != rand);
        System.out.println("Acertou!");
        scanner.close();
    }
}

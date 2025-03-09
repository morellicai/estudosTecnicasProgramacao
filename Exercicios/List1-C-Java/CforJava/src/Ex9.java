import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha = "Abracadabra";
        String inUser;
        System.out.println("Qual é a senha?");
        inUser = scanner.nextLine();
        if(inUser.equals(senha)){
            System.out.println("Acesso permitido");
        }else{
            System.out.println("Acesso negado");
        }
        scanner.close();
    }
}

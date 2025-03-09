import java.io.*;
public class AreaTriangulo {
    public static int areaTriangulo(int base, int altura) {
        int area = (base * altura) / 2;
        return area;
    }
    public static void main(String[] args) {
        BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
        int base = 0;
        int altura = 0;
        int area = 0;
        try {
            System.out.println("Digite o valor da base: ");
            base = Integer.parseInt(dado.readLine());
            System.out.println("Digite o valor da altura: ");
            altura = Integer.parseInt(dado.readLine());
            area = areaTriangulo(base, altura);
            System.out.println("A área do triângulo é: " + area);
        } catch (IOException error) {
            System.out.println("Erro na leitura dos dados.");
        }
    }
}
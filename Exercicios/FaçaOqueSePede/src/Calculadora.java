/*
 * Usando a classe JOptionPane para a entrada de dados, elabore uma
 * classe que receba dois valores numéricos (v1 e v2) e apresente na
 * tela o resultado das quatro operações matemáticas básicas (soma,
 * subtração, multiplicação e divisão)
 */

 import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        String aux = "";
        int num1, num2, soma, div, mult, sub;
        aux = JOptionPane.showInputDialog(null, "Digite o Primeiro numero a ser calculado");
        num1 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Digite o Segundo numero a ser calculado");
        num2 = Integer.parseInt(aux);

        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        JOptionPane.showMessageDialog(null,
        "Os resultados são esses\n" +
            num1 + " + " + num2 + " = " + soma + "\n" +
            num1 + " - " + num2 + " = " + sub + "\n" +
            num1 + " * " + num2 + " = " + mult + "\n" +
            num1 + " / " + num2 + " = " + div
        );
    }
}

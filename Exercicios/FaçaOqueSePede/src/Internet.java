/*
 * Um usuário possui uma internet banda larga com velocidade fixa de
 * 2Mb (2 megabits) por segundo. Usando a classe JOptionPane para a
 * entrada de dados, elabore uma classe que receba o tamanho do
 * arquivo em bytes e apresente a quantidade de segundos necessária
 * para fazer o download. Considere que 8 bits é igual a 1 byte.
*/
import javax.swing.JOptionPane;

public class Internet {
    public static void main(String[] args) {
        int internet = 2, download;
        String aux;

        aux = JOptionPane.showInputDialog("Qual o tamanho do Arquivo a ser baixado?");
        download = Integer.parseInt(aux);
        download *= 1024;
        int tempSec = download / internet;
        int tempMin = tempSec / 60;
        JOptionPane.showMessageDialog(null, "O tempo necessario para fazer esse download é: " + tempMin + "min");
    }
}
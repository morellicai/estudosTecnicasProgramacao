import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args) {
        String aux = "";
        float nota1 = 0, nota2 = 0, trabalho = 0;
        int resposta;
        try{
            do{
                aux = JOptionPane.showInputDialog("Entre com a 1ºNota");
                nota1 = Float.parseFloat(aux);

                aux = JOptionPane.showInputDialog("Entre com a 2ºNota");
                nota2 = Float.parseFloat(aux);

                aux = JOptionPane.showInputDialog("Entre com a nota de trabalho");
                trabalho = Float.parseFloat(aux);

                JOptionPane.showMessageDialog(null, "Média :" + media(nota1, nota2, trabalho));

                resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
            } while (resposta == JOptionPane.YES_OPTION);
        }
        catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos "+erro.toString());
         }

        System.exit(0);

    }
    public static float media(float nota1,float nota2, float trabalho){
        return (nota1+nota2+trabalho)/3;
    }

}
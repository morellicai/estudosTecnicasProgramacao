import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String aux = "";
        int codigo;
        double preco;
        Camisa varCamisa = new Camisa();
        // Utilizando encapsulamento com metodos set
        try {
            aux = JOptionPane.showInputDialog("Digite o id da camisa:");
            codigo = Integer.parseInt(aux);
            varCamisa.setId(codigo);
            aux = JOptionPane.showInputDialog("Digite o modelo da camisa:");
            varCamisa.setModelo(aux);
            aux = JOptionPane.showInputDialog("Digite a cor da camisa:");
            varCamisa.setCor(aux);
            aux = JOptionPane.showInputDialog("Digite o tamanho da camisa:");
            varCamisa.setTamanho(aux);
            aux = JOptionPane.showInputDialog("Digite o preço da camisa:");
            preco = Double.parseDouble(aux);
            varCamisa.setPreco(preco);
            aux = JOptionPane.showInputDialog("Digite a descrição da camisa:");
            varCamisa.setDescricao(aux);
            JOptionPane.showMessageDialog(null,
                "Id:" + varCamisa.getId() +
                "\nCor:" + varCamisa.getCor()+
                "\nModelo:" + varCamisa.getModelo() +
                "\nTamanho:" + varCamisa.getTamanho() +
                "\nPreço:" + varCamisa.getPreco() +
                "\nDescrição:" + varCamisa.getDescricao()
            );
        } catch (NumberFormatException erro) { // Tratando erro
            JOptionPane.showMessageDialog(null, "Houve erro na conversão. Digite somente números" + erro.toString());
        }
        // Peganso os dados digitados através de Getters
        /*
         * System.out.println("Id:      " + varCamisa.getId());
         * System.out.println("Cor:     " + varCamisa.getCor());
         * System.out.println("Modelo:  " + varCamisa.getModelo());
         * System.out.println("Tamanho: " + varCamisa.getTamanho());
        */
    }
}
import java.io.*;

public class EntradaComBufferedReader
{
	public static void main(String[] args) {
		String s="";
		float cotacao, dolar, conversao;
		BufferedReader dado;
		try{
		    System.out.println("Entre com o valor em Dolar");
		    dado = new BufferedReader(new InputStreamReader(System.in));
		    s = dado.readLine();
		    dolar = Float.parseFloat(s);
		    System.out.println("Qual a cotação do Dolar");
		    dado = new BufferedReader(new InputStreamReader(System.in));
		    s = dado.readLine();
		    cotacao = Float.parseFloat(s);

		    conversao = dolar * cotacao;

		    System.out.println("O valor da cotação do dolar é" + conversao);
		}
		catch(IOException erro){
		    System.out.println("Houve um erro na entrada de dados");
		}
		catch(NumberFormatException erro){
		    System.out.println("Erro na conversão, digite apenas números");
		}
	}
}
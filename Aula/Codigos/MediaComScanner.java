/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class MediaComScanner
{
    float p1=0, p2=0, p3=0, t=0, m=0;
    
	public static void main(String[] args) {
	    MediaComScanner es=new MediaComScanner();
		    try{
	        System.out.println("Entre com a nota P1");
	        Scanner sc=new Scanner(System.in);
	        es.p1=sc.nextFloat();
	        System.out.println("Entre com a nota P2");
	        es.p2=sc.nextFloat();
	        System.out.println("Entre com a nota de Trabalho");
	        es.t=sc.nextFloat();
	        System.out.println("A media é : "+ es.media(es.p1, es.p2, es.t));
	   }
	    catch(InputMismatchException erro)
	    {
	        System.out.println("Erro de conversão" + erro.toString());
	    }
		
	}
	public double media(float p1, float p2, float t)
	{
	    return ((3.5*p1)+(3.5*p2)+(3*t))/10;
	}
	
}
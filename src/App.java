import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        // POO Membro estaticos
		//programa ler cotação dolar, depois valor em dolares a ser comprado em reais.Quanto ira pagar em reais pelos
		//dolares,considerando que tera que pagar 6% de IOF sobre o valor do dolar.Criar uma classe conversor 
		//para ser responsavel pelos cálculos.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual é o preço do dólar?" );
		double dolarPreco =sc.nextDouble();
		System.out.print("Quantos dólares serão comprados? ");
		double quantidade = sc.nextDouble();
		double resultado = Conversor.dolarReal(quantidade, dolarPreco);
		System.out.printf("Valor a ser pago em reais = %.2f%n",resultado );
		
		sc.close();
    }
}

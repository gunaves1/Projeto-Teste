package primeiro_projeto;
import java.util.Scanner;
public class Fluxograma {

	public static void main(String[] args) {
		double horatrab,valorhora,salbruto,salliquido,inss;
		Scanner ler = new Scanner (System.in);

		System.out.println("Quanto foram as horas trabalhadas?");
		horatrab = ler.nextDouble();

		System.out.println("Qual o valor da hora?");
		valorhora = ler.nextDouble();

		salbruto = horatrab*valorhora;
		inss = salbruto*0.12;
		salliquido = salbruto-inss;

		System.out.println("O valor do salário bruto é " + salbruto);
		System.out.println("O valor do salário líquido é " + salliquido);
		ler.close();
	}
}

package primeiro_projeto;
import java.util.Scanner;
public class Nome_idade {

	public static void main(String[] args) {
		String nome,idade;
		Scanner ler = new Scanner (System.in);

		System.out.println("Informe seu nome: ");
		nome = ler.nextLine();
		System.out.println("Informe sua idade: ");
		idade = ler.next();

		System.out.print("Seu nome é " + nome + " e sua idade é " + idade + " anos");
		ler.close();

	}

}

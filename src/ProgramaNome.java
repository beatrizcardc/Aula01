//Utilizamos o Scanner para ler os dados que o usuário vai digitar. Como nõa vem por padrão precisamos importar o Scanner
import java.util.Scanner;
//Esse programa deve receber o nome do usuário e exibir
public class ProgramaNome {

	public static void main(String[] args) {
		//A linha abaixo cria um leitor para lermos o teclado do usuário
		Scanner leitor = new Scanner(System.in);
		//A linha abaixo cria uma variável (espaço na RAM) para guardar dados do tipo String
		String nome;
		System.out.println("Por favor, digite o seu nome");
		//A linha abaixo pega o texto digitado pelo usuário e guarda na variável "nome"
		nome = leitor.nextLine();
		System.out.println("Que legal que seu nome é " + nome + "!");
		System.out.println(nome + ", fico feliz que você esteja usando o meu programa.");
	}

}

//Utilizamos o Scanner para ler os dados que o usu�rio vai digitar. Como n�a vem por padr�o precisamos importar o Scanner
import java.util.Scanner;
//Esse programa deve receber o nome do usu�rio e exibir
public class ProgramaNome {

	public static void main(String[] args) {
		//A linha abaixo cria um leitor para lermos o teclado do usu�rio
		Scanner leitor = new Scanner(System.in);
		//A linha abaixo cria uma vari�vel (espa�o na RAM) para guardar dados do tipo String
		String nome;
		System.out.println("Por favor, digite o seu nome");
		//A linha abaixo pega o texto digitado pelo usu�rio e guarda na vari�vel "nome"
		nome = leitor.nextLine();
		System.out.println("Que legal que seu nome � " + nome + "!");
		System.out.println(nome + ", fico feliz que voc� esteja usando o meu programa.");
	}

}

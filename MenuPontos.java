import java.util.Scanner;

public class MenuPontos {
	
	
	public static void menu1(){
		int opcao;
		int tabelaPontos[] = new int[14];
		Scanner teclado = new Scanner(System.in);
		
			 System.out.println("1 - Soma dos dados com face 1");
			 System.out.println("2 - Soma dos dados com face 2");
			 System.out.println("3 - Soma dos dados com face 3");
			 System.out.println("4 - Soma dos dados com face 4");
			 System.out.println("5 - Soma dos dados com face 5");
			 System.out.println("6 - Soma dos dados com face 6");
			 System.out.println("7 - Soma de todos os dados(Minimo de tres dados com faces iguais)");
			 System.out.println("8 - Soma de todos os dados(Minimo de quatro dados com faces iguais");
			 System.out.println("9 - Full house");
			 System.out.println("10 - Sequencia curta(4 faces de dados em sequencia)");
			 System.out.println("11 - Sequencia longa(5 faces de dados em sequencia)");
			 System.out.println("12 - Yahtzee(5 dados com faces iguais)");
			 System.out.println("13 - Qualquer combinacao de dados");
			 opcao = teclado.nextInt();
			 
			 switch(opcao) {
			 
			 case 9:
				 tabelaPontos[9] = 25;
				 break;
			 case 10:
				 tabelaPontos[10] = 30;
				 break;
			 case 11:
				 tabelaPontos[11] = 40;
				 break;
			 case 12:
				 tabelaPontos[12] = 50;
				 break;
			 default:
				 System.out.println("Opcao invalida");
			 }
			 
		
	}
}
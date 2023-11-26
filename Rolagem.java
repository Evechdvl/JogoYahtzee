import java.util.Scanner;

public class Rolagem {
	static Scanner teclado = new Scanner(System.in);
	public static int[] menuJogo(){
	
		
		int[] dadoD = new int[5];
		int[] dadosParaRerolar = new int[5];
	
		
		Dado d1 = new Dado();
		
		int dadoRerolado1 = 0;
		int dadosRerolando;
		
		
	
		for(int i = 0; i<5; i++){
			d1.rolar();
			
			dadoD[i] = d1.getValor();
		}
		
		System.out.println("Dado 1: "+ dadoD[0]);
		System.out.println("Dado 2: "+ dadoD[1]);
		System.out.println("Dado 3: "+ dadoD[2]);
		System.out.println("Dado 4: "+ dadoD[3]);
		System.out.println("Dado 5: "+ dadoD[4]);
	
		
		
		dadosParaRerolar[0] = dadoD[0];
		dadosParaRerolar[1] = dadoD[1];
		dadosParaRerolar[2] = dadoD[2];
		dadosParaRerolar[3] = dadoD[3];
		dadosParaRerolar[4] = dadoD[4];
		
		
		System.out.println("Deseja rerolar algum dado? digite 1 para sim e 0 para não");
		dadoRerolado1 = teclado.nextInt();
		if(dadoRerolado1 == 1){
			int contadorWhile = 0;

			for(int t = 0; t<3; t++){
			contadorWhile++;
			int cont = 0;
			while(cont !=6){
			System.out.println("Quais dados deseja rerolar? digite 1-5 para escolher e 6 para encerrar sua escolha");
			cont = teclado.nextInt();
			if(cont == 6){
				break;
			}
			dadosRerolando = cont;
			
					int i = dadosRerolando;
					d1.rolar();
					dadosParaRerolar[i-1] = d1.getValor();
			}
			System.out.println("Dados Rerolados: "+dadosParaRerolar[0]);
			System.out.println("Dados Rerolados: "+dadosParaRerolar[1]);
			System.out.println("Dados Rerolados: "+dadosParaRerolar[2]);
			System.out.println("Dados Rerolados: "+dadosParaRerolar[3]);
			System.out.println("Dados Rerolados: "+dadosParaRerolar[4]);
			
			if(contadorWhile == 2) {
				break;
			}
			System.out.println("Deseja rerolar algum dado novamente? 1 para sim, 2 para não");
			cont = teclado.nextInt();
			if(cont == 2) {
				break;
			}
		}
		}
		
		int opcao = 0;
		int[] tabelaPontos = new int[15];
	
		
	
 
 
 
 // a partir dessa linha é código para contar os pontos
 

 
	 // soma das faces com numero 1, 2, 3, 4, 5 e 6
	 	int contador = 0, contador2 = 0, contador3 = 0, contador4 =0, contador5 = 0, contador6 = 0, contador7 = 0, contador71 = 0;
	 	int contador8 = 0, contador81 = 0;
		for(int i = 0; i<5; i++) {
				if(dadosParaRerolar[i] == 1) {
				contador++;
				
			}
			if(dadosParaRerolar[i] == 2) {
				contador2++;
		}
			if(dadosParaRerolar[i] == 3) {
				contador3++;
		}
			if(dadosParaRerolar[i] == 4) {
				contador4++;
		}
			if(dadosParaRerolar[i] == 5) {
				contador5++;
		}
			if(dadosParaRerolar[i] == 6) {
				contador6++;
		}
			//3 faces iguais
		    if(contador >= 3 || contador2 >= 3 || contador3 >= 3 || contador4 >= 3 || contador5>= 3 ||contador6>= 3){
				 for(int j = 0; j<5; j++) {
					 
					 contador7 = dadosParaRerolar[j];
					 contador71 = contador71 + contador7;
					 
				 }
				 tabelaPontos[7] = contador71;
			}
		    // 4 faces iguais
			if(contador >=4 || contador2 >= 4 || contador3 >= 4 || contador4 >= 4 || contador5 >= 4 || contador6 >= 4) {
				 for(int k = 0; k<5; k++) {
					 contador8 = dadosParaRerolar[k];
					 contador81 = contador81 + contador8;
					 
				 }
				 tabelaPontos[8] = contador81;
		}
			// full house, 3 faces iguais + 2 faces iguais(1 triplo + 1 par)
	 boolean tripla = false, par = false;
	 if(contador == 3 || contador2 == 3 || contador3 == 3|| contador4 == 3|| contador5 == 3 || contador6 == 3){
		 tripla = true;
	 }else{
		 tripla = false;
	 }
	 if(contador == 2 || contador2 == 2 || contador3 == 2|| contador4 == 2|| contador5 == 2 || contador6 == 2){
		 par = true;
	 }else{
		 par = false;
	 }
	 if(tripla == true && par == true){
		 tabelaPontos[9] = 25;

		 
	 // short straight (1, 2, 3, 4; 2, 3, 4, 5; 3, 4, 5, 6;)
	 if(dadosParaRerolar[0] == 1 && dadosParaRerolar[1] == 2 && dadosParaRerolar[2] == 3 && dadosParaRerolar[3]==4) {
		tabelaPontos[10] = 30;
	 }else if(dadosParaRerolar[0] == 2 && dadosParaRerolar[1] == 3 && dadosParaRerolar[2] == 4 && dadosParaRerolar[3]==5) {
			tabelaPontos[10] = 30;
	 }else if(dadosParaRerolar[0] == 3 && dadosParaRerolar[1] == 4 && dadosParaRerolar[2] == 5 && dadosParaRerolar[3]==6) {
			tabelaPontos[10] = 30;
	 }else if(dadosParaRerolar[1] == 1 && dadosParaRerolar[2] == 2 && dadosParaRerolar[3] == 3 && dadosParaRerolar[4]==4) {
			tabelaPontos[10] = 30;
	 }else if(dadosParaRerolar[1] == 2 && dadosParaRerolar[2] == 3 && dadosParaRerolar[3] == 4 && dadosParaRerolar[4]==5) {
				tabelaPontos[10] = 30;
	 }else if(dadosParaRerolar[1] == 3 && dadosParaRerolar[2] == 4 && dadosParaRerolar[3] == 5 && dadosParaRerolar[4]==6) {
				tabelaPontos[10] = 30;
	 }
	

	// long straight (1, 2, 3, 4, 5 ou 2, 3, 4, 5, 6)
	 if(dadosParaRerolar[0]==1 && dadosParaRerolar[1]==2 && dadosParaRerolar[2]==3 && dadosParaRerolar[3]==4
	 && dadosParaRerolar[4]==5) { 
		 tabelaPontos[11] = 40;
		
	 }else if(dadosParaRerolar[0]==2 && dadosParaRerolar[1]==3 && dadosParaRerolar[2]==4 && dadosParaRerolar[3]==5
			 && dadosParaRerolar[4]==6) {
		 tabelaPontos[11] = 40;
		
	 }
 
	// cinco dados precisam ter faces iguais, soma de todos 
	
	 if(contador==5 || contador2 == 5 || contador3 == 5 || contador4 == 5 || contador5 == 5 || contador6== 5) {
	 tabelaPontos[12] = 50;
	 }
 
	 // sorte (soma de todos os numeros)
	
	
			
		}
	 }
		int contadorSorte = 0; 
		int contadorSorte2 = 0;
		 for(int l = 0; l<5; l++){
				if(dadosParaRerolar[l]>0) {
					contadorSorte = dadosParaRerolar[l];
					contadorSorte2 = contadorSorte2 + contadorSorte;
				}
	 tabelaPontos[13] = contadorSorte2;
	 
		

 			}		 
		
	 
		tabelaPontos[1] = contador;
		tabelaPontos[2] = contador2*2;
		tabelaPontos[3] = contador3*3;
		tabelaPontos[4] = contador4*4;
		tabelaPontos[5] = contador5*5;
		tabelaPontos[6] = contador6*6;
		// aqui acaba as linhas de contar ponto
		
		//verificacao da validade do bonus
		int bonus = 0, contBonus = 0;
		for(int i = 0; i <7; i++) {
			contBonus = contBonus + tabelaPontos[i];
		}
		if(contBonus >= 63) {
			bonus = 35;
		}else {
			bonus = 0;
		}
		tabelaPontos[14] = bonus;
		//acima fica a aplicacao do valor do bonus. se for valido tera valor de 35 pontos adicionado.
		
		
		//teste de codigo para invalidar jogadas duplas
		
		
		
		
		//repeticao do comando que oferece as jogadas ao jogador
		
			menu1(opcao, dadosParaRerolar, tabelaPontos);
			

		return(tabelaPontos);
	}
	
	public static void menu1(int opcao, int dadosParaRerolar[], int tabelaPontos[]){
		
			do {
			int contadorJogada1 = 0, contadorJogada2 = 0, contadorJogada3 = 0, contadorJogada4 = 0, contadorJogada5 = 0; 
			int contadorJogada6 = 0, contadorJogada7 = 0, contadorJogada8 = 0, contadorJogada9 = 0, contadorJogada10 = 0;
			int contadorJogada11 = 0, contadorJogada12 = 0, contadorJogada13 = 0;
			

			if(opcao == 1) {
			 contadorJogada1++;
				}
			if(opcao == 2) {
				 contadorJogada2++;
					}
			if(opcao == 3) {
				 contadorJogada3++;
					}
			if(opcao == 4) {
				 contadorJogada4++;
					}
			if(opcao == 5) {
				 contadorJogada5++;
					}
			if(opcao == 6) {
				 contadorJogada6++;
					}
			if(opcao == 7) {
				 contadorJogada7++;
					}
			if(opcao == 8) {
				 contadorJogada8++;
					}
			if(opcao == 9) {
				 contadorJogada9++;
					}
			if(opcao == 10) {
				 contadorJogada10++;
					}
			if(opcao == 11) {
				 contadorJogada11++;
					}
			if(opcao == 12) {
				 contadorJogada12++;
					}
			if(opcao == 13) {
				 contadorJogada13++;
					}
			
			 System.out.println("\n1 - Soma dos dados com face 1");
			 if(contadorJogada1 >= 1) {
				 System.out.println("Jogada inválida!");
			 }else {
			 System.out.println("Valor dessa jogada: "+tabelaPontos[1]);
			 }
			 System.out.println("2 - Soma dos dados com face 2");
			 if(contadorJogada2 >= 1) {
				 System.out.println("Jogada inválida!");
			 }else {
			 System.out.println("Valor dessa jogada: "+tabelaPontos[2]);
			 }
			 System.out.println("3 - Soma dos dados com face 3");
			 if(contadorJogada3 >= 1) {
				 System.out.println("Jogada inválida!");
			 }else {
			 System.out.println("Valor dessa jogada: "+tabelaPontos[3]);
			 }
			 System.out.println("4 - Soma dos dados com face 4");
			 if(contadorJogada4 >= 1) {
				 System.out.println("Jogada inválida!");
			 }else {
			 System.out.println("Valor dessa jogada: "+tabelaPontos[4]);
			 }
			 System.out.println("5 - Soma dos dados com face 5");
			 if(contadorJogada5 >= 1) {
				 System.out.println("Jogada inválida!");
			 }else {
			 System.out.println("Valor dessa jogada: "+tabelaPontos[5]);
			 }
			 System.out.println("6 - Soma dos dados com face 6");
			 if(contadorJogada6 >= 1) {
				 System.out.println("Jogada inválida!");
			 }else {
			 System.out.println("Valor dessa jogada: "+tabelaPontos[6]);
			 }
			 System.out.println("7 - Soma de todos os dados(Minimo de tres dados com faces iguais)");
			 if(contadorJogada7 >= 1) {
				 System.out.println("Jogada inválida!");
			 }else {
			 System.out.println("Valor dessa jogada: "+tabelaPontos[7]);
			 }
			 System.out.println("8 - Soma de todos os dados(Minimo de quatro dados com faces iguais)");
			 if(contadorJogada8 >= 1) {
				 System.out.println("Jogada inválida!");
			 }else {
			 System.out.println("Valor dessa jogada: "+tabelaPontos[8]);
			 }
			 System.out.println("9 - Full house");
			 if(contadorJogada9 >= 1) {
				 System.out.println("Jogada inválida!");
			 }else {
			 System.out.println("Valor dessa jogada: "+tabelaPontos[9]);
			 }
			 System.out.println("10 - Sequencia curta(4 faces de dados em sequencia)");
			 if(contadorJogada10 >= 1) {
				 System.out.println("Jogada inválida!");
			 }else {
			 System.out.println("Valor dessa jogada: "+tabelaPontos[10]);
			 }
			 System.out.println("11 - Sequencia longa(5 faces de dados em sequencia)");
			 if(contadorJogada11 >= 1) {
				 System.out.println("Jogada inválida!");
			 }else {
			 System.out.println("Valor dessa jogada: "+tabelaPontos[11]);
			 }
			 System.out.println("12 - Yahtzee(5 dados com faces iguais)");
			 if(contadorJogada12 >= 1) {
				 System.out.println("Jogada inválida!");
			 }else {
			 System.out.println("Valor dessa jogada: "+tabelaPontos[12]);
			 }
			 System.out.println("13 - Sorte (Qualquer combinacao de dados)");
			 if(contadorJogada13 >= 1) {
				 System.out.println("Jogada inválida!");
			 }else {
			 System.out.println("Valor dessa jogada: "+tabelaPontos[13]);
			 }
			 System.out.println("Digite 0 para sair.");
			 
			 System.out.println("Qual deseja escolher?");
			 opcao = teclado.nextInt();
			}while(opcao != 0);
			 
	
	}
	
	}
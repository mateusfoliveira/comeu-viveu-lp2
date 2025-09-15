package br.com.comeuviveu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		menu();
				

	}
	
	public static void menu(){
		
		Scanner Scanner = new Scanner(System.in);
		
		int entrada = 0;
		
		while (entrada != 4) {
			
			entrada = Scanner.nextInt();
			Scanner.next();
			
			switch(entrada){
			//Registrar pedido
				case 1:
					break;
			//Remover
				case 2:
					break;
			//Listar
				case 3:
					break;
			//Exit
				case 4:
					Scanner.close();
					return;
			
				default:
					System.out.println("Entrada inválida, tente novamente ou digite 4 para sair.");
					break;
			}
		}
			Scanner.close();
	}
}

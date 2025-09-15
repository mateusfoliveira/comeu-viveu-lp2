package br.com.comeuviveu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println ("bem vindo ao programa do comeu viveu");
		
		ArrayList <Pedido> pedidos = new ArrayList <>();
		
		menu(pedidos);
				

	}
	
	public static void menu(ArrayList <Pedido> pedidos){
		
		System.out.println("Escolha uma das opções: ");
		System.out.println(" 1 - Adicionar pedido\n 2 - Remover pedido \n 3 - Listar pedidos\n 4 - Encerrar o programa");
		
		Scanner Scanner = new Scanner(System.in);
		
		int entrada = 0;
		
		while (entrada != 4) {
			
			entrada = Scanner.nextInt();
			Scanner.nextLine();
			
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
					System.out.println("Encerrando a execução do programa.");
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

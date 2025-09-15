package br.com.comeuviveu;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	
	private ArrayList <Pedido> pedidos;
	
	public Sistema() {
		super();
		this.pedidos = new ArrayList <>();
	}
	
	public void addPedido(Scanner scanner){
		
		System.out.println("Para adicionar um pedido, digite o nome do cliente. Quando terminar escreva 'none'. ");
		
		while(true) {
		
			String nomeCliente = scanner.nextLine();
			
			if(nomeCliente.equalsIgnoreCase("none")) return;
			
			Pedido novoPedido = new Pedido(nomeCliente);
			
			novoPedido.addItem(scanner);
			
			pedidos.add(novoPedido);
			
			System.out.println("Pedido registrado com sucesso!");
			
			//Nota fiscal no console
			System.out.println("\n========================================");
			System.out.println(" Restaurante 'Comeu? Viveu!' ");
			System.out.println("========================================");
			System.out.println("Pedido N°: " + novoPedido.getNumero());
			System.out.println("Cliente: " + novoPedido.getCliente());
			novoPedido.showItens();
			System.out.println("========================================");
			System.out.println(" Obrigado pela preferência! :) ");
			System.out.println("========================================\n");
			
			System.out.println("Para adicionar um novo pedido, digite o nome do cliente. Quando terminar escreva 'none'. ");
			
		}
	}

	public void menu(){
		
		Scanner scanner = new Scanner(System.in);
		
		int entrada = 0;
		
		System.out.println ("Bem vindo ao programa do 'Comeu? Viveu!'");
		
		while (entrada != 4) {
			
			System.out.println("Escolha uma das opções: ");
			System.out.println(" 1 - Adicionar pedido\n 2 - Remover pedido \n 3 - Listar pedidos\n 4 - Encerrar o programa");
			
			entrada = scanner.nextInt();
			scanner.nextLine();
			
			switch(entrada){
			//Registrar pedido
				case 1:
					addPedido(scanner);
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
					scanner.close();
					return;
			
				default:
					System.out.println("Entrada inválida, tente novamente ou digite 4 para sair.");
					break;
			}
		}
			scanner.close();
	}
	

}

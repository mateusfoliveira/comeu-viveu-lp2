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
		System.out.println("------------------------------------------------------------------------------------");
		
		while(true) {
		
			String nomeCliente = scanner.nextLine();
			
			if(nomeCliente.equalsIgnoreCase("none")) return;
			
			Pedido novoPedido = new Pedido(nomeCliente);
			
			novoPedido.addItem(scanner);
			
			pedidos.add(novoPedido);
			
			System.out.println("Pedido registrado com sucesso!");
			System.out.println("------------------------------");
			
			//Nota fiscal no console
			System.out.println("\n==============================");
			System.out.println(" Restaurante 'Comeu? Viveu!'  |");
			System.out.println("===============================");
			System.out.println("|Pedido N°: " + novoPedido.getNumero());
			System.out.println("|Cliente: " + novoPedido.getCliente());
			novoPedido.showItens();
			System.out.println("===============================");
			System.out.println("|Obrigado pela preferência! :)|");
			System.out.println("===============================\n");
			
			System.out.println("Para adicionar um novo pedido, digite o nome do cliente. Quando terminar escreva 'none'. ");
			System.out.println("-----------------------------------------------------------------------------------------");
		}
	}
	
	public void removePedido(Scanner scanner){
		
		if(pedidos.isEmpty()){
			System.out.println("Não existem pedidos na lista para serem removidos!");
			System.out.println("--------------------------------------------------\n");
			return;
		}
		
		System.out.println("Escreva o número do pedido a ser removido: ");
		System.out.println("-------------------------------------------");
		int index = scanner.nextInt();
		if(index > 0 && index <= pedidos.size())pedidos.remove(index - 1);
		else {
			System.out.println("Número escolhido inválido! Encerrando remoção de pedidos.");
			System.out.println("---------------------------------------------------------");
			return;
		}
		System.out.println("Pedido removido!");
		System.out.println("----------------");
		if(pedidos.isEmpty()) {
			System.out.println("A lista agora está vazia. Encerrando remoção de pedidos!");
			System.out.println("--------------------------------------------------------\n");
			return;
		}
		
		System.out.println("Deseja remover mais algum pedido?\n------------------------------------\n 1 - Sim\n 2 - Não");
		
		int entrada = scanner.nextInt();
		switch(entrada) {
			case 1:
				removePedido(scanner);
				break;
		
			case 2:
				System.out.println("Fim da remoção de pedidos!");
				System.out.println("--------------------------\n");
				break;
			
			default:
				System.out.println("Opção inválida! Encerrando remoção de pedidos.");
				System.out.println("----------------------------------------------\n");
				
		}

		
		
	}
	
	public void showPedidos(){
		
		if(pedidos.isEmpty()){
			System.out.println("A lista de pedidos está vazia!\n");
			System.out.println("------------------------------\n");
			return;
		}
		
		System.out.println("\n=========================");
		System.out.println("|Listas de pedidos: |");
		
		System.out.println("==========================");
		
		for(Pedido pedido:pedidos){
			System.out.println(" Pedido N°: " + pedido.getNumero());
			System.out.println(" Cliente: " + pedido.getCliente());
			pedido.showItens();
			System.out.println("=========================");
		}
		System.out.println(" Fim da lista de pedidos.|");
		System.out.println("=========================\n");
	}

	public void menu(){
		
		Scanner scanner = new Scanner(System.in);
		
		int entrada = 0;
		System.out.println("=========================================");
		System.out.println("Bem vindo ao programa do 'Comeu? Viveu!'|");
		System.out.println("=========================================");
		while (entrada != 4) {
			System.out.println("Escolha uma das opções: ");
			System.out.println("------------------------");
			System.out.println(" 1 - Adicionar pedido\n 2 - Remover pedido \n 3 - Listar pedidos\n 4 - Encerrar o programa");
			System.out.println("-------------------------");
			entrada = scanner.nextInt();
			scanner.nextLine();
			
			switch(entrada){
			//Registrar pedido
				case 1:
					addPedido(scanner);
					break;
			//Remover
				case 2:
					removePedido(scanner);
					break;
			//Listar
				case 3:
					showPedidos();
					break;
			//Exit
				case 4:
					System.out.println("Programa encerrado.");
					System.out.println("===================\n");
					scanner.close();
					return;
			
				default:
					System.out.println("Entrada inválida, tente novamente ou digite 4 para sair.");
					System.out.println("--------------------------------------------------------\n");
					break;
			}
		}
			scanner.close();
	}
	

}

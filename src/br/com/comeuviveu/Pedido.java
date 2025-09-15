package br.com.comeuviveu;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
	
	private static int numeroPedidos = 0;
	private int numero;
	private String cliente;
	private ArrayList <Item> itens = new ArrayList<>();
	
	public static int getNumeroPedidos() {
		return numeroPedidos;
	}
	public static void setNumeroPedidos(int numeroPedidos) {
		Pedido.numeroPedidos = numeroPedidos;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Item> getItens() {
		return itens;
	}
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}
	
	public void addItem(Scanner Scanner){
		
		System.out.println("Digite os itens, um por vez, nome e preço. Quando terminar escreva 'end'.");
		
		String entradaNome = "Vazio";
		
		while(true) {
			entradaNome = Scanner.nextLine();
			if(entradaNome.equalsIgnoreCase("end")) break;
			double entradaPrice = Scanner.nextDouble();
			Scanner.nextLine();
			getItens().add(new Item(entradaNome, entradaPrice));
		}
		
		System.out.println("Itens adicionados com sucesso!");
	}
	
	public void showItens() {
		
		System.out.println("______________________________\n");
		for(Item item: itens) {
			System.out.println("- " + item.getNome() + " R$: " + item.getPreco());
		}
		//Fim da lista
		System.out.println("______________________________");
		
	}
	
	public Pedido(String cliente) {
		super();
		this.numero = ++numeroPedidos;
		this.cliente = cliente;
		this.itens = new ArrayList<Item>();
	}

	
	

}

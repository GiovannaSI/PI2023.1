package packTestePI;

import java.util.Scanner;

public class TesteAvaliativoPI {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Olá, aqui você irá encontrar o desconto aplicado em sua compra!");
		
		String nome;
		int quantAdquirida;
		double precoUnitario, total, desconto, valorDesconto;
		
		System.out.print("1° passo - Digite o nome do produto: ");
		nome = dado.next();
		
		System.out.print("2° passo - Digite a quantidade adquirida: ");
		quantAdquirida = dado.nextInt();
		
		System.out.print("3° passo - Digite o preço unitário: ");
		precoUnitario = dado.nextDouble();
		
		total = quantAdquirida * precoUnitario;
		
		System.out.println("O valor total a pagar: R$ " + total);
		
		if (quantAdquirida <=5){
			desconto = total * 0.02;
			valorDesconto = total - desconto;
			System.out.println("Você obteve um desconto de 2%!");
			System.out.println("O novo valor a pagar, com o desconto aplicado é R$ " + valorDesconto);
		}
		
		else if(quantAdquirida > 5 && quantAdquirida <= 10){
			desconto = total * 0.03;
			valorDesconto = total - desconto;
			System.out.println("Você obteve um desconto de 3%!");
			System.out.println("O novo valor a pagar, com o desconto aplicado é R$ " + valorDesconto);
		}
		
		else if (quantAdquirida > 10){
			desconto = total * 0.05;
			valorDesconto = total - desconto;
			System.out.println("Você obteve um desconto de 5%!");
			System.out.println("O novo valor a pagar, com o desconto aplicado é R$ " + valorDesconto);
		}
		
		dado.close();
		
	}

}

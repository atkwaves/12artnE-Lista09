package Lista09;

import java.util.Scanner;

public class exec09 {
	
//	Faça um programa para testar uma senha. 
//	a. A senha deve ser compilada no código;
//	b. Após 3 tentativas erradas o programa deve finalizar;
//	c. Ao acertar a senha, escreva na tela "A senha é: SENHA".

	public static void main(String[] args) {

		String contraSenha = "batataFrita"; 
		
		String senha = ""; 
		
		Scanner ler = new Scanner(System.in);
	
		int i = 0; 
		while ((i < 3) && (!contraSenha.equals(senha))) {
			System.out.println("Senha: ");
			senha = ler.next();
			if (contraSenha.equals(senha)) {
				System.out.println("Senha Digitada: " + senha);
			}
			
			i++;
		}
		
		/*	
		int i = 0; 
		do {
			System.out.println("Senha: ");
			senha = ler.next();
			if (contraSenha.equals(senha)) {
				System.out.println("Senha Digitada: " + senha);
			} 
			i++;
		} while ((i < 3) && (!contraSenha.equals(senha)));
		*/
		/*
		for (int i = 0; i < 3; i++) {
			System.out.println("Senha: ");
			senha = ler.next();
			if (contraSenha.equals(senha)) {
				System.out.println("Senha Digitada: " + senha);
				break;
			} 
		} 
		
		
		for (int i = 0; (i < 3) && (!contraSenha.equals(senha)); i++) {
			System.out.println("Senha: ");
			senha = ler.next();
			if (contraSenha.equals(senha)) {
				System.out.println("Senha Digitada: " + senha);
			} 
		}
		
		*/
		
		/*
		for (int i = 0; i < 3; i++) {
			System.out.println("Senha: ");
			senha = ler.next();
			if (contraSenha.equals(senha)) {
				System.out.println("Senha Digitada: " + senha);
			    i = 3; 		    
			} 
		} 
		*/
		
		/*
		System.out.println("Senha: ");
		senha = ler.next();
		
		
		if (senha.equals(contraSenha)) {
			System.out.println("Senha digitada: " + senha);
		}else {
			System.out.println("Senha: ");
			senha = ler.next();
			
			if (senha.equals(contraSenha)) {
				System.out.println("Senha digitada: " + senha);				
			}else { 
				System.out.println("Senha: ");
				senha = ler.next();
				if (senha.equals(contraSenha)) {
					System.out.println("Senha digitada: " + senha);
				}
			}
			
		} 
		*/

	}
}

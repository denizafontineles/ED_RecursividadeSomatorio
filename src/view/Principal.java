package view;

import controller.SomatorioController;

public class Principal {
	
	public static void main(String[] args) {
		SomatorioController op = new SomatorioController();
		
		int n = 5;
		int soma = op.recursividadeSoma(n);
		System.out.println(soma);
	}

}

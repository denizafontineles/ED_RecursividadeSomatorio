package controller;

public class SomatorioController {
	
	public SomatorioController() {
		super();
	}
	
	public int recursividadeSoma(int n) {

		//parada
		if (n == 0) {
			return 0;
		}else {
			//relação soma numero recebido com a função chamada -1
			return n + recursividadeSoma(n-1);	
		}
		
	}

}

package poocarro;

public class objetoCarro {

	public static void main(String[] args) {

		carro carro1= new carro();


		carro1.setModelo("Porsche 922 Targa Sakura");
		carro1.setMarca("Porsche");
		carro1.setTipo("Conversível");
		carro1.setCor("Rosa");


		System.out.println("----- OBJETO 1-----");
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getTipo());
		System.out.println(carro1.getCor());

		System.out.println("Vire à direita");
		System.out.println("Vire à esquerda");
		System.out.println("Dar Seta");
		System.out.println("Abrir Porta"); 
	}
}

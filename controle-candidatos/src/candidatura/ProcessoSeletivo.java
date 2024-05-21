package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		imprimirSelecionandos();
		
	}
	
	static void imprimirSelecionados() {
		String [] canditados = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		System.out.println("Imprimindo a lista candidatos informando o informando o indice do elemento");
		
		for(int indice=0; indice < candidatos.length;indice++) {
			System.out.println("O canditado de nº " + indice + " e " + candidatos[indice]);
		}
	}
	
	static void selecaoCandidatos() {
		
		String [] canditados = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO","MIRELA", "DANIELA", "JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual=0;
		double salarioBase=2000.0;
		while(candidatosSelecionados <5 && candidatosAtual < candidatos.length) {
			String canditado = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O canditado " + candidato + "Solicitou este valor de salario " + salarioPretendido );
			if(salarioBase >= salarioPretendido) {
				System.out.println("O canndidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}
	static void analisarCanditado(double salarioPretentido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDITADO");
	} else if (salarioBase==salarioPretendido)
		System.out.println("LIGAR PARA O CANDITADO COM A CONTRA PROPOSTA");
	 else {
		System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
	}
		
	}
}

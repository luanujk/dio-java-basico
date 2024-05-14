package edu.luan.segundasemana;

public class MinhaClasse {
	
	public static void main (String [] args) {
		String primeiroNome = "Luan";
		String segundoNome = "Ujaque";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

		System.out.println(nomeCompleto);
		// No exemplo acima, sei que nomeCompleto é a variável primeiramente porque começa com letra minúscula.
		// Depois disso, também percebo que nomeCompleto é um método porque TODO MÉTODO TEM ARGUMENTOS, mesmo que vazios.
	}

	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "Resultado do método -> " + primeiroNome.concat(" ").concat(segundoNome);	
	}
}
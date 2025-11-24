package view;

import br.gui.arvorechar.ArvoreChar;

public class Principal {

	public static void main(String[] args) {
		char[] vetor = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};
		ArvoreChar arvore = new ArvoreChar();
		
		for (char i : vetor) {
			arvore.insert(i);
		}
		
		try {
			arvore.remove('F');
			arvore.remove('U');
			
			arvore.prefixSearch();
			System.out.println();
			arvore.infixSearch();
			System.out.println();
			arvore.postfixSearch();
		} catch (Exception e) {
			System.err.println(e.getMessage());	
		}

	}

}

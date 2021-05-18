import org.junit.Test;

import junit.framework.Assert;

/**
* Classe com metodos de casas e magias da Escola de Magia Hogwarts
* @author Paola Medeiros
* @version 1
*/

public abstract class Hogwarts {
	
	
	
	static public String magia (String feiti�o) {
		return feiti�o;
	
	}
	
	void lufalufa() {
	return;			
	}
	
	void grifinoria() {
	return;			
	}
	
	void sonserina() {
	return;	
	}
	
	void corvinal() {
	return;	
	}
	
}

/**
* Classe sobre um aluno herdeiro da casa Lufa-Lufa com metodos de magia e da sua expectiva casa
* @author Paola Medeiros
* @version 1
*/
	class Lazarus extends Hogwarts {
		
		
		@Test
		void magia() {
		String feiti�oEsperado = "Expelliarmus";
		String feiti�oObtido = "Expelliarmus";
		
		Assert.assertEquals(feiti�oEsperado, feiti�oObtido, 0);
		
			
		}

		void lufalufa() {
			System.out.println("Ensinarei a todos e os tratarei como iguais");
		}
		
	}

/**
 * Classe sobre uma aluna herdeira da casa Grifin�ria com metodos de magia e da sua expectiva casa
* @author Paola Medeiros
* @version 1
*/
		class Grisha extends Hogwarts {
			
			
			@Test
			void magia() {
			
			String feiti�oEsperado = "Expectro Patronum";
			String feiti�oObtido = "Expectro Patronum";
			
			Assert.assertEquals(feiti�oEsperado, feiti�oObtido, 0);
			
			}

			void grifinoria() {
				System.out.println("N�s vamos ensinar a todos aqueles com os bravos feitos do seu nome.");
			}
		}
		
/**
 * Classe sobre um aluno herdeiro(que futuramente se torna Voldermort) da casa Sonserina com metodos de magia e da sua expectiva casa
* @author Paola Medeiros
* @version 1
*/		
		class Riddle extends Hogwarts {
			
			@Test
			void magia() {
			
			String feiti�oEsperado = "Expelliarmus";
			String feiti�oObtido = "Avada Kedrava";
			
			Assert.assertEquals(feiti�oEsperado, feiti�oObtido, 0);
			}

			void sonserina() {
				System.out.println("O que � para ser nosso ningu�m tira e o que n�o � a gente toma a for�a.");
			}
			
		}

/**
 * Classe sobre um aluno herdeiro da casa Corvinal com metodos de magia e da sua expectiva casa 
* @author Paola Medeiros
* @version 1
*/	
		abstract class Wiglaf extends Hogwarts {
			
			@Test
			void magia() {
				String feiti�oEsperado = "Alohomora";
				String feiti�oObtido = "Alohomora";
				
				Assert.assertEquals(feiti�oEsperado, feiti�oObtido, 0);
			}
			
			
			void corvinal() {
				System.out.println("O esp�rito sem limites � o maior tesouro do homem.");
			}
			
		}
		
	


import org.junit.Test;

import junit.framework.Assert;

/**
* Classe com metodos de casas e magias da Escola de Magia Hogwarts
* @author Paola Medeiros
* @version 1
*/

public abstract class Hogwarts {
	
	
	
	static public String magia (String feitiço) {
		return feitiço;
	
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
		String feitiçoEsperado = "Expelliarmus";
		String feitiçoObtido = "Expelliarmus";
		
		Assert.assertEquals(feitiçoEsperado, feitiçoObtido, 0);
		
			
		}

		void lufalufa() {
			System.out.println("Ensinarei a todos e os tratarei como iguais");
		}
		
	}

/**
 * Classe sobre uma aluna herdeira da casa Grifinória com metodos de magia e da sua expectiva casa
* @author Paola Medeiros
* @version 1
*/
		class Grisha extends Hogwarts {
			
			
			@Test
			void magia() {
			
			String feitiçoEsperado = "Expectro Patronum";
			String feitiçoObtido = "Expectro Patronum";
			
			Assert.assertEquals(feitiçoEsperado, feitiçoObtido, 0);
			
			}

			void grifinoria() {
				System.out.println("Nós vamos ensinar a todos aqueles com os bravos feitos do seu nome.");
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
			
			String feitiçoEsperado = "Expelliarmus";
			String feitiçoObtido = "Avada Kedrava";
			
			Assert.assertEquals(feitiçoEsperado, feitiçoObtido, 0);
			}

			void sonserina() {
				System.out.println("O que é para ser nosso ninguém tira e o que não é a gente toma a força.");
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
				String feitiçoEsperado = "Alohomora";
				String feitiçoObtido = "Alohomora";
				
				Assert.assertEquals(feitiçoEsperado, feitiçoObtido, 0);
			}
			
			
			void corvinal() {
				System.out.println("O espírito sem limites é o maior tesouro do homem.");
			}
			
		}
		
	


package introjava;

public class DemoSentenciasSwitch {
	
	public static void main(String[] args) {
		int dia = 2 ;
		
		
		System.out.println("Dia numero: " + dia);
		
		switch(dia) {
		case 0:
			System.out.println("Ootra semanaa");
			break;
		case 1:
				System.out.println("Deprimente");
				//break;
		case 2:
			System.out.println("Ok, otra vez");
			//break;
		case 3:
			System.out.println("Estamos a la mitad y ya no soporto!");
			//break;
		case 4:
			System.out.println("Aun falta");
			break;
		case 5:
			System.out.println("Ya viene el fin de semana, aqui es donde sonrio");
			break;
			default:
				System.out.println("Los fines de semana son increibles pero como son tan buenos por eso dura poco");
		}

	}

}

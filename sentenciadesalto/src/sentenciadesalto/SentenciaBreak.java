package sentenciadesalto;

public class SentenciaBreak {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			if(Math.random() > 0.5) {
				System.out.println("Ni modo , yo me largo amig0");
				break;
			}
			System.out.println("Volvamos a intentarlo para el otro!");
			
		}
       System.out.println("Ciclo terminado. Cuantas veces contamos????");
	}


}

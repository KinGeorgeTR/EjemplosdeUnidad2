package sentenciadesalto;

public class SentenciaContinue {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			if(Math.random() > 0.5) {
				System.out.println("Ok, el numero " + i + " es aburrido, obvio lo pongo para hacerlo mas larg0");
				continue;
}
			System.out.println("Hagamos eso para el otro!");
		}
		System.out.println("Listo");
	}

}

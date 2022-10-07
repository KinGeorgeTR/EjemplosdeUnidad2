package ejecutable;

public class MiProgram {
	public static void main(String[] args) {
		System.out.println("Hola Mundo!, obvio no usamos el clasico ejemplo de Hola Mundo, este es mas original");
		for(int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] es " + args[i]);
			
		}
         System.out.println("Y ya esta!");
	}


}

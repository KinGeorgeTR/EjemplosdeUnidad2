package estructuraa;

public class ClaseDeEstructura {
	public float obtenerTemperatura() {
		return temperatura;
	}
	public static int obtenerNumeroGrande() {
		return UN_NUMERO_GRANDE;
	}
	//variables
	private static int UN_NUMERO_GRANDE=123456;
	private float temperatura;
	//metodo constructor
	public ClaseDeEstructura() {
		temperatura=98.4f;
	}
	//metodo
	public void hacerUno() {
		//Creacion de un objeto(instancia)
		UnConcepto uc=new UnConcepto();
	}
	//variable de una clase de otro paquete
	//nombre completo, No fue importado
	public estructuraa.sub.ClaseSecreta cs;
	
	//La clase interna a la clase principal
	
	class ClaseInterna{
		public void hacerAlgo() {}
	}

}

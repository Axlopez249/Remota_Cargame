package track;

public class Obstaculo {
	private String tipo;
	private int tamaño;
	private int velocidad;
	
	//metodos
	public Obstaculo (String pTipo, int pTamaño, int pVelocidad) {
		this.tipo = pTipo;
		this.tamaño = pTamaño;
		this.velocidad = pVelocidad;
	}
	
	public void mover() {
		System.out.println("Se mueve");
	}
	
	public void atacar() {
		System.out.println("Ataca");
	}
}

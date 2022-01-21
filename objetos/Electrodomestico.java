package objetos;

public class Electrodomestico {
	
	//Atributos
	private double precio = 100;
	private Colores color = Colores.blanco;
	private Letras letraConsumo = Letras.F;
	private double peso = 5;
	
	public Electrodomestico() {		
	}

	public Electrodomestico(double precio, double peso) {		
		this.precio = precio;
		this.peso = peso;
	}

	public Electrodomestico(double precio, Colores color, Letras letraConsumo, double peso) {
		super();
		this.precio = precio;
		this.color = color;
		this.letraConsumo = letraConsumo;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", color=" + color + ", letraConsumo=" + letraConsumo + ", peso="
				+ peso + "]";
	}	
	
}

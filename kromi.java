package oscurilandia;

public class kromi extends carro
{

	//3 ESPACIOS DE FORMA VERTICAL
	private int anioFabricacion;
	private String marca;
	public kromi(int cantOcupantes, int filaCarro, int columnaCarro, String fechaIngreso, int anioFabricacion,
			String marca) {
		super(cantOcupantes, filaCarro, columnaCarro, fechaIngreso);
		this.anioFabricacion = anioFabricacion;
		this.marca = marca;
	}
	public kromi(int cantOcupantes, int filaCarro, int columnaCarro, String fechaIngreso) {
		super(cantOcupantes, filaCarro, columnaCarro, fechaIngreso);
	}
	public int getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Kromi [anioFabricacion=" + anioFabricacion + ", marca=" + marca + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

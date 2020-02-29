package oscurilandia;

public class trupalla extends carro
{

	//1 ESPACIO
	private int nivelArmadura; //ENTRE 1 y 5
	private String nombreOperador;
	public trupalla(int cantOcupantes, int filaCarro, int columnaCarro, String fechaIngreso, int nivelArmadura,
			String nombreOperador) {
		super(cantOcupantes, filaCarro, columnaCarro, fechaIngreso);
		this.nivelArmadura = nivelArmadura;
		this.nombreOperador = nombreOperador;
	}
	public trupalla(int cantOcupantes, int filaCarro, int columnaCarro, String fechaIngreso) {
		super(cantOcupantes, filaCarro, columnaCarro, fechaIngreso);
	}
	public int getNivelArmadura() {
		return nivelArmadura;
	}
	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}
	public String getNombreOperador() {
		return nombreOperador;
	}
	public void setNombreOperador(String nombreOperador) {
		this.nombreOperador = nombreOperador;
	}
	@Override
	public String toString() {
		return "Trupalla [nivelArmadura=" + nivelArmadura + ", nombreOperador=" + nombreOperador + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

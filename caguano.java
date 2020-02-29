package oscurilandia;

public class caguano extends carro
{

	private double alcanceTiro;
	private String colorConfeti;
	public caguano(int cantOcupantes, int filaCarro, int columnaCarro, String fechaIngreso, double alcanceTiro,
			String colorConfeti) {
		super(cantOcupantes, filaCarro, columnaCarro, fechaIngreso);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}
	public caguano(int cantOcupantes, int filaCarro, int columnaCarro, String fechaIngreso) {
		super(cantOcupantes, filaCarro, columnaCarro, fechaIngreso);
	}
	public double getAlcanceTiro() {
		return alcanceTiro;
	}
	public void setAlcanceTiro(double alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}
	public String getColorConfeti() {
		return colorConfeti;
	}
	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}
	@Override
	public String toString() {
		return "Caguano [alcanceTiro=" + alcanceTiro + ", colorConfeti=" + colorConfeti + "]";
	}
	//2 ESPACIOS DE FORMA HORIZONTAL
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

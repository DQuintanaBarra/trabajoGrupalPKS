package oscurilandia;


public class carro {

	
	private int cantOcupantes, filaCarro, columnaCarro;
	private String fechaIngreso;
	
	public carro(int cantOcupantes, int filaCarro, int columnaCarro, String fechaIngreso) {
		super();
		this.cantOcupantes = cantOcupantes;
		this.filaCarro = filaCarro;
		this.columnaCarro = columnaCarro;
		this.fechaIngreso = fechaIngreso;
	}
	public carro() {
		super();
	}
	public int getCantOcupantes() {
		return cantOcupantes;
	}
	public void setCantOcupantes(int cantOcupantes) {
		this.cantOcupantes = cantOcupantes;
	}
	public int getFilaCarro() {
		return filaCarro;
	}
	public void setFilaCarro(int filaCarro) {
		this.filaCarro = filaCarro;
	}
	public int getColumnaCarro() {
		return columnaCarro;
	}
	public void setColumnaCarro(int columnaCarro) {
		this.columnaCarro = columnaCarro;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	@Override
	public String toString() {
		return "Carro [cantOcupantes=" + cantOcupantes + ", filaCarro=" + filaCarro + ", columnaCarro=" + columnaCarro
				+ ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

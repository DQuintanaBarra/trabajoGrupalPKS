package oscurilandia;

public class huevo {
	private int filaProyectil, columnaProyectil, puntajeObtenido;

	public huevo(int filaProyectil, int columnaProyectil, int puntajeObtenido) {
		super();
		this.filaProyectil = filaProyectil;
		this.columnaProyectil = columnaProyectil;
		this.puntajeObtenido = puntajeObtenido;
	}

	public huevo() {
		super();
	}

	public int getFilaProyectil() {
		return filaProyectil;
	}

	public void setFilaProyectil(int filaProyectil) {
		this.filaProyectil = filaProyectil;
	}

	public int getColumnaProyectil() {
		return columnaProyectil;
	}

	public void setColumnaProyectil(int columnaProyectil) {
		this.columnaProyectil = columnaProyectil;
	}

	public int getPuntajeObtenido() {
		return puntajeObtenido;
	}

	public void setPuntajeObtenido(int puntajeObtenido) {
		this.puntajeObtenido = puntajeObtenido;
	}

	@Override
	public String toString() {
		return "Huevo [filaProyectil=" + filaProyectil + ", columnaProyectil=" + columnaProyectil + ", puntajeObtenido="
				+ puntajeObtenido + "]";
	}
		
}

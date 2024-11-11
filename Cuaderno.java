import java.util.*;

public class Cuaderno {

	private Collection<Hoja> papeles;
	private List<Hoja> hojas;

	public List<Hoja> getHojas() {
		return this.hojas;
	}

	/**
	 * 
	 * @param hojas
	 */
	public void setHojas(List<Hoja> hojas) {
		this.hojas = hojas;
	}

	/**
	 * 
	 * @param hoja
	 * @param texto
	 */
	public boolean escribirApunte(int hoja, String texto) {
		// TODO - implement Cuaderno.escribirApunte
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param hoja
	 */
	public boolean quitarHoja(int hoja) {
		// TODO - implement Cuaderno.quitarHoja
		throw new UnsupportedOperationException();
	}

}
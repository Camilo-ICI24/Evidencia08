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
		for(Hoja hoja1: hojas){
			if(hoja1.getNumero() == hoja){
				hoja1.apuntar(texto);
				if(hoja1.getApunte().equals(texto)){
					return true;
				}
			}
		}return false;
	}

	public boolean quitarHoja(int hoja) {
		for(Hoja hoja1: hojas){
			if(hoja1.getNumero() == hoja){
				if(hoja1.arrancarHoja()){
					return true;
				}
			}
		}return false;
	}

}
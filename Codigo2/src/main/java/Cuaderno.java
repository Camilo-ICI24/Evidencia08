import java.util.*;

public class Cuaderno {

	private Collection<Hoja> papeles;
	private List<Hoja> hojas;

	public Cuaderno(){
		this.hojas = new ArrayList<Hoja>();
		this.papeles = new ArrayList<Hoja>();
	}

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
		for(Hoja hoja1: hojas) {
			if (hoja1.getNumero() == hoja) {
				if (hoja1.getEstadoHoja().equals("Arrancada")) {
					return false;
				}
				hoja1.apuntar(texto);
				System.out.println(hoja1.getApunte());
				if (hoja1.getApunte().equals(texto)) {
					return true;
				}
			}
		}
		Hoja nuevaHoja = new Hoja(this,texto,hoja,"");
		hojas.add(nuevaHoja);
		if (nuevaHoja.getApunte().equals(texto)){
			if(nuevaHoja.getNumero() == hoja){
				return true;
			}
		}
		return false;
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
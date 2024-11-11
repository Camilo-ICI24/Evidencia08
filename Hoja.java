public class Hoja {

	private Cuaderno cuaderno;
	private String apunte;
	private int numero;
	private String estadoHoja;

	public String getApunte() {
		return this.apunte;
	}

	/**
	 * 
	 * @param apunte
	 */
	public void setApunte(String apunte) {
		this.apunte = apunte;
	}

	public int getNumero() {
		return this.numero;
	}

	/**
	 * 
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEstadoHoja() {
		return this.estadoHoja;
	}

	/**
	 * 
	 * @param estadoHoja
	 */
	public void setEstadoHoja(String estadoHoja) {
		this.estadoHoja = estadoHoja;
	}

	/**
	 * 
	 * @param apunte
	 */
	public boolean apuntar(String apunte) {
		// TODO - implement Hoja.apuntar
		throw new UnsupportedOperationException();
	}

	public boolean arrancarHoja() {
		// TODO - implement Hoja.arrancarHoja
		throw new UnsupportedOperationException();
	}

}
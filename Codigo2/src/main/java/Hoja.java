public class Hoja {

	private Cuaderno cuaderno;
	private String apunte;
	private int numero;
	private String estadoHoja;

	public String getApunte() {

		return this.apunte;
	}
	public void setApunte(String apunte) {

		this.apunte = apunte;
	}

	public int getNumero() {

		return this.numero;
	}

	public void setNumero(int numero) {

		this.numero = numero;
	}

	public String getEstadoHoja() {

		return this.estadoHoja;
	}

	public void setEstadoHoja(String estadoHoja) {

		this.estadoHoja = estadoHoja;
	}


	public boolean apuntar(String apunte) {
		if (estadoHoja.equals("Arrancada")) {
			return false;
		}
		this.apunte = apunte;
		return true;
	}

	public boolean arrancarHoja() {
		if (estadoHoja.equals("Arrancada")) {
			return false;
		}
		this.estadoHoja = "Arrancada";
		this.apunte = null;
		return true;
	}

}
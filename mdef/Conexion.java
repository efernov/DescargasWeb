package mdef;

public class Conexion {

	private float velocidad;
	
	public float getVelocidad() {
		return velocidad;
	}

	public Conexion(float velocidad) {
		super();
		this.velocidad = velocidad;
	}
	
	/**
	 * Metodo que sirve para calcular el tiempo empleado
	 * por esta conexion para los megas pasados.
	 * @param megas Tamanho total para descargar en MB
	 * @return segundos que tarda esta conexion para la descarga
	 */
	public float tiempoDeDescarga(float megas) {
		return megas/getVelocidad();
	}
}

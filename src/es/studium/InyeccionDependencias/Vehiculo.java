/**
 * 
 */
package es.studium.InyeccionDependencias;

/**
 * Clase Vehiculo
 * @author Alvca
 * @since 2021
 * @version 1.0
 */
public class Vehiculo {
	private Motor m;
	/**
	 * Contructor sin parametros
	 */
	public Vehiculo() {
		m = new Motor();
	}
	/**
	 * Metodo para optener las revoluciones del motor
	 * @return clase motor optiene las revoluciones
	 */
	public int getRevolucionesMotor() {
		return m.getRevoluciones();
	}
	/**
	 * Optiene el motor
	 * @return the m motor
	 */
	public Motor getM() {
		return m;
	}
	/**
	 * Establece el motor
	 * @param m the m to set motor
	 */
	public void setM(Motor m) {
		this.m = m;
	}
}
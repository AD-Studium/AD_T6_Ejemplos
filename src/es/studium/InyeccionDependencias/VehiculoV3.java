/**
 * 
 */
package es.studium.InyeccionDependencias;

/**
 * Clase VehiculoV3
 * @author Alvca
 * @since 2021
 * @version 1.0
 */
public class VehiculoV3 {
	private IMotor m;
	/**
	 * Contructor sin parametros
	 */
	public VehiculoV3() {
	}
	/**
	 * Contructor con parametro
	 * @param motorVehiculo Tipo de motor
	 */
	public VehiculoV3(IMotor motorVehiculo) {
		m = motorVehiculo;
	}
	/**
	 * Metodo para optener las revoluciones del motor
	 * @return clase motor optiene las revoluciones
	 */
	public int getRevolucionesMotor() {
		return m.getRevoluciones();
	}
}
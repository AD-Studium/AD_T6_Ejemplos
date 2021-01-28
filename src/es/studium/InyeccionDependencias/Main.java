/**
 * 
 */
package es.studium.InyeccionDependencias;

/**
 * @author Alvca
 *
 */
public class Main {
	public static void main(String[] args) {
		/*Al proporcionar un objeto que implementa la interfaz IMotor
		 * como par�metro del constructor de Vehiculo, estamos
		 * inyectando la dependencia*/
		VehiculoV3 cocheDiesel = new VehiculoV3(new MotorDiesel());
		/*En este caso, realizamos otra inyecci�n de una dependencia,
		 * pero con una instancia de MotoGasolina*/
		VehiculoV3 cocheGasolina = new VehiculoV3(new MotorGasolina());
	}
}

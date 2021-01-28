/**
 * 
 */
package es.studium.InyeccionDependencias;

/**
 * Clase MotorGasolina
 * @author Alvca
 * @since 2021
 * @version 1.0
 */
public class MotorGasolina implements IMotor{
	private int currentRPM;
	@Override
	/**
	 * Metodo para acelerar
	 */
	public void acelerar() {
		/*
		 * realizarAdmision();
		 * realizarCompresion();
		 * realizarCombustion();
		 * realizarEscape();
		 */
	}
	@Override
	public int getRevoluciones() {
		// TODO Auto-generated method stub
		return currentRPM;
	}
}
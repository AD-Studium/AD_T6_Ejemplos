/**
 * 
 */
package es.studium.InyeccionDependencias;

/**
 * @author Alvca
 *
 */
public class MotorDiesel implements IMotor {
	private int currentRPM;
	@Override
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
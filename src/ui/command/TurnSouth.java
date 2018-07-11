/**
 * @author Chandana G
 * Checks to see whether the active life forms turns in the direction the player wants it to.
 */
package ui.command;

import environment.Environment;
import exceptions.RException;
import lifeform.LifeForm;

public class TurnSouth implements Command{

	Environment theWorld;
	LifeForm lifeform;
	@Override
	public void execute() throws RException {
		System.out.println("direction:" + "" + "South");
		theWorld.itsMyTurn.rotate("South");			
	}

	
}

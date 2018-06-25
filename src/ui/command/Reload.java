/**
 * @Author Chandana G
 */

package ui.command;

import environment.Environment;
import lifeform.LifeForm;
import weapon.Weapon;

public class Reload implements Command{
	
	LifeForm lifeform;
	Environment theWorld;

	@Override
	public void execute() {
		//theWorld.getWorld();
		lifeform = theWorld.itsMyTurn;
		System.out.println(lifeform);
		Weapon w = lifeform.getWeapon();
		System.out.println(w);
		w.reload();
		
	}
	

}

/**
 * @Author Chandana G
 * Tests to see whether the active life forms turns in the direction the player wants it to.
 */

package ui.command;

import static org.junit.Assert.*;

import org.junit.Test;

import environment.Environment;
import exceptions.RException;
import lifeform.LifeForm;
import lifeform.MockLifeForm;

public class TestTurnNorth {
	Environment theWorld;

	
	@Test
	public void testTurnNorth() throws RException {
		Environment.resetWorld();
		Environment.createWorld(12, 14);
		theWorld = Environment.getWorld();
		LifeForm entity = new MockLifeForm("bob", 20, 20);
		TurnNorth tn = new TurnNorth();
		theWorld.addLifeForm(5, 5, entity);
		theWorld.setActivePlayer(entity);
		tn.execute();		
		assertEquals("North", entity.getDirection());
		
		
		
	}

}

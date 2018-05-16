package com.monirul.myturtle.command.turtle;

import com.monirul.myturtle.GameContext;
import com.monirul.myturtle.exception.ApplicationException;

public class MoveRightCmd extends AbstractTurtleCommand {

	@Override
	public void execute(GameContext gameContext) throws ApplicationException {
		gameContext.getTurtle().turnRight();
	}

	
}

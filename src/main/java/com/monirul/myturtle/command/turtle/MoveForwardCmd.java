package com.monirul.myturtle.command.turtle;

import com.monirul.myturtle.GameContext;
import com.monirul.myturtle.simulation.Position;
import com.monirul.myturtle.exception.ApplicationException;

public class MoveForwardCmd extends AbstractTurtleCommand {

	@Override
	public void execute(GameContext gameContext) throws ApplicationException {
		if(gameContext.getTurtle().isPlaced()){
			Position newPosition = gameContext.getTurtle().getCurrentPosition().getNextPosition(1);
			gameContext.getBoard().placeRobot(gameContext.getTurtle(), newPosition);
		}
	}

	
}

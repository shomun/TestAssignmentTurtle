package com.monirul.myturtle.command.board;

import com.monirul.myturtle.GameContext;
import com.monirul.myturtle.command.AbstractCommand;
import com.monirul.myturtle.simulation.Direction;
import com.monirul.myturtle.simulation.Position;
import com.monirul.myturtle.exception.ApplicationException;

public class BoardPlaceCmd extends AbstractCommand {
	
	private final String INVALID_MSG = "Invalid PLACE command"; 

	@Override
	public void execute(GameContext gameContext) throws ApplicationException {
		String[] userCmd = gameContext.getUserCommand().split(" ");
		if(userCmd.length < 2){
			throw new ApplicationException(INVALID_MSG);
		}
		String[] params = userCmd[1].split(",");
		try{
				int x = Integer.parseInt(params[0]);
				int y = Integer.parseInt(params[1]);
				Direction direction = Direction.valueOf(params[2]);
				Position position = new Position(x, y, direction);
				gameContext.getBoard().placeRobot(gameContext.getTurtle(), position);
				
		}catch(Exception e){
			throw new ApplicationException(INVALID_MSG);
		}

	}

}

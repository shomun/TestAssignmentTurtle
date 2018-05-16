package com.monirul.myturtle.board;

import com.monirul.myturtle.simulation.Position;
import com.monirul.myturtle.turtle.Turtle;
import com.monirul.myturtle.exception.ApplicationException;

public interface Board {

	/**
	 * Check whether a given Position is valid position in the Board.
	 * A Position is invalid if it falls outside of the edges
	 * @param position
	 * @return true if it is valid Position 
	 * @throws ApplicationException for Invalid Position
	 */
	boolean isValidPosition(Position position) throws ApplicationException;
	
	/**
	 * Place a Robot on the Board 
	 * @param robot 
	 * @param newPosition
	 * @throws ApplicationException
	 */
	void placeRobot(Turtle robot,Position newPosition)throws ApplicationException;
	
}
